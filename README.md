(Logo with null4j in it png 452x167)

With null4j, your code will have less NullPointerExceptions and more readable null checks.

```java
@NotNullByDefault
class Example {

	@Getter class Person  { int id; @Nullable Address; }
	@Getter class Address { @Nullable Street street; }
	@Getter class Street  { String streetName; }

	String getStreetName(Person person) {

		@Nullable String streetName =
			 let(person,
				Person::getAddress,
				Address::getStreet,
				Street::getStreetName);


		return orDefault(streetName, "could not find street name");

	}
}
```

## Features

### Annotation

```java
@NotNullByDefault
```

This meta annotation can be applied to classes and packages. Everything will be implicitely annotated with @NotNull unless it is explicitely annotated with @Nullable.

### orDefault

```java
<T> T orDefault((@Nullable T)... nullables, T fallback)
```

Returns the first not null parameter. The last parameter must not be null.

This is similar to SQL's coalesce or Javascript's || except that having null as the last parameter is not allowed.

```java
// Java 7:

String s = someMap.get(key);
if(s == null) {
	s = "";
}

doSomethingWith(s);


// Java 8:

String s = someMap.getOrDefault(key, "");

doSomethingWith(s);


// null4j:

String s = orDefault(someMap.get(key), "");

doSomethingWith(s);


// null4j can wrap any function:

Thing t = orDefault(anyOtherNullableFunction(), Things.STANDARD_THING);

doSomethingWith(t);
```

### let 

A fluent map/flatMap for nullable types that works similar to Optional::map and Optional::flatMap.

```java
<⬤> @Nullable ⬤ let(@Nullable ⬤ value, Function<⬤, @Nullable ⬤>... functions)
```

The functions must form a matching chain.

Also, if the last parameter is a consumer, let returns void.

```java
// like map
@Nullable String maybeUpperCaseName = let(maybeName, String::toUpperCase);

// map/flatMap chain that returns void and may or may not print to System.out
let(maybeUpperCaseName,
	someMap::get,
	StringUtils::reverse,
	System.out::println
);
```

## Mockito support

It will flag errors when you try to mock something with wrong types e.g. if the original method never returns null mocking it as always returning null will be an error.

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

If method overloading is not an option because the method has too many parameters, orDefault can be used to declare default values for nullable parameters.

```java
void displayInfo(
	String id,
	@Nullable String name,
	@Nullable String comment,
	Address address,
	@Nullable String designation
) {
	// set defaults for nullable parameters
	name = orDefault(name, "no name");
	comment = orDefault(comment, "");
	designation = orDefault(designation, "no designation");

	// ...
}
```

### Safe Navigation

Suppose you have some types that can be nested. With let, you can easily reach into them, all without worrying about nullpointer exceptions on the way to the desired value.

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

This is similar to declaring variables, except that the null checks are included already.

```java
let(getNullableA(), a ->
let(getNullableB(), b ->
let(getNullableC(), c -> {

	System.out.println("All three are not null");

	doSomethingWithAllThree(a, b, c);

})));
```

## Refactoring existing code

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
		return "It's very " + thing.getQuality();
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

// simple: function does only one thing
String format(Thing thing) {
	return "It's very " + thing.getQuality();
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

(Available soon)

#### Maven

(XML goes here)

#### Gradle

(Groovy goes here)

### IntelliJ

You need to change two checker settings:

![Constant conditions & exceptions](intellij1.png)

![@NotNull/@Nullable problems](intellij2.png)

## Contributing

Contributions are welcome! Contact Michael Zinn on [Github](https://github.com/RedNifre) or [Twitter](https://twitter.com/RedNifre).

