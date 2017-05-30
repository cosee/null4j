(Logo screenshot png 452x167)

# null4j

Simplified null-handling.

(Screenshot with functions and error)

## Features

### Annotation

```java
@NotNullByDefault
```

This meta annotation can be applied to classes and packages. 

### orDefault

```java
<T> T orDefault((@Nullable T)... nullables, T fallback)
```

Returns the first not null parameter. The last parameter must not be null.

This is similar to SQL's coalesce or Javascript's ||.

The name of the function stems from Java8 Map's getOrDefault method:

```java
// Java 7:

String s = someMap.get(key);
if(s == null) {
	s = "";
}

doSomethingWith(s);
```

```java
// Java 8:

String s = someMap.getOrDefault(key, "");

doSomethingWith(s);


// null4j:

String s = orDefault(someMap.get(key), "");

doSomethingWith(s);


// null4j can wrap any function:

String t = orDefault(anyOtherNullableFunction(), "");

doSomethingWith(t);
```

### let 

A fluent map/flatMap for nullable types that works similar to Optional::map and Optional::flatMap. The type signature can't be expressed in Java directly (type aligned sequence), but it typechecks none the less.

```java
<T> @Nullable 🌀 let(@Nullable T value, Function<🌀, @Nullable 🌀>... functions)
```

Also, if the last parameter is a consumer, let returns void.

```java
// like map
@Nullable String s = let(maybeName, String::toUpperCase);

// map/flatMap chain that returns void and may or may not print to System.out
let(s, someMap::get, StringUtils::reverse, System.out::println);
```

## Mockito support

It will flag errors when you try to mock something with wrong types.

(Mockito screenshot)

## Lombok support

Nullability annotations are copied to generated getters/setters.

```java
@Data
class Thing {
	String name;
	@Nullable String description;
}

void main() {
	Thing thing = getSomeThing();

	// fine
	thing.getName().toUpperCase();

	// Will be flagged by IntelliJ
	thing.getDescription().toUpperCase();❌

	// fine
	let(thing.getDescription(), String::toUpperCase);
}
```

## Examples

### Default Parameters

To create default parameters, the usual solution is to overload methods with variants that take less parameters.

```java
void displayName() {
	displayName("no name");
}

void displayName(String name) {
	//...
}
```

However, this can get confusion when dealing with many parameters. Instead, you can use orDefault and the fact that parameters are variables to implement default parameters:

```java
void displayInfo(
	String id,
	@Nullable String name,
	@Nullable String comment,
	Address address,
	@Nullable String designation
) {
	name = orDefault(name, "no name");
	comment = orDefault(comment, "");
	designation = orDefault(designation, "no designation");
	// ...
}
```

### Safe Navigation

Suppose you have some classes that can be nested. With let, you can easily reach into them.

```java
@Data class Person  { int id; @Nullable Address; }
@Data class Address { @Nullable Street street; }
@Data class Street  { String streetName; }

@Nullable String getStreetName(Person person) {
	return let(person,
		Person::getAddress,
		Address::getStreet,
		Street::getStreetName);
}
```

### Combining orDefault and let

```java
return orDefault(let(person,
	Person::getId,
	commentMap::get,
	String::toUpperCase
), "NO COMMENT");
```

### Nesting let to bind multiple values at once

```java
let(getNullableA(), a ->
let(getNullableB(), b ->
let(getNullableC(), c -> {

	System.out.println("All three are present");

	doSomethingWithAllThree(a, b, c);

})));
```

## Refactoring existing code

Some useful suggestions. 

### Annotate classes instead of packages

Experience shows that using the package annotation in legacy projects can be confusing: When you see a class that has no @NotNullByDefault annotation, is that because the package is already annotated or was it never annotated? The package annotation can also lead to problems when moving a class between annotated and non-annonated packages.

Only use the package annotation in new projects or when you annotated all of your legacy code.

### Remove null handling from functions.

Null handling like this distracts from the actual intention of a function. Functions should only do one thing; if you add null handling they are doing two things:

```java

// avoid this
@Nullable String format(@Nullable Thing thing) {
	if(thing == null) {
		return null;
	} else {
		return "It's very " + thing.getQuality;
	}
}

void main() {
	@Nullable String a = format(getNullableThing());

	// this is not really nullable
	@Nullable String b = format(getNotNullableThing());

	// ...
}
```

Instead, simplify your functions by moving the null handling to the call site:


```java

// clean, function does one thing only.
String format(Thing thing) {
	return "It's very " + thing.getQuality;
}

void main() {
	@Nullable String a = let(getNullableThing(), this::format);

	// notice that no null handling is needed at all in this case.
	String b = getDescription(getNotNullableThing());

	// ...
}
```

## Setup

Using null4j is a two step process: Add the library to your pom/gradle file and configure IntelliJ to perform stricter tests.

### Dependency

#### Maven

It's not yet in Maven Central, but you can get it from JCenter:

(XML goes here)

#### Gradle

(Groovy goes here)

### IntelliJ

You need to adjust two checker settings.

(Screenshot setting 1)
(Screenshot setting 2)
(Screenshot with code and checker violation)


