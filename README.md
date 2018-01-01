# Java

**Intermediate and Advanced Java Application Examples**

This repository contains examples that you can use to test out [Java](https://java.com/en/) with. Each package contains a small application that should run on most any operating system that supports [Java](https://java.com/en/) desktop or server environments. The repository serves two primary purposes:

1. A code-snippet store for my reference
2. Code examples for aspiring [Java](https://java.com/en/)
developers that want something more than just "Hello World" to play with.

All of the examples are either labs, dev-book problems, or common application
needs I've run across. While the problem source may differ, I wrote all of the solutions as presented in the repository. As time allows, more advanced topics will be added.

## Required Tools
All of the applications were written using [Eclipse Oxygen](https://www.eclipse.org/), [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [NetBeans](https://netbeans.org/).

The [Java](https://java.com/en/) version used for both Windows and Linux (at the time of testing) was Version 8 Update 151. No external libraries are needed nor used unless otherwise noted.

## Classification
Unlike my [dotnet-core-example](https://github.com/KI7MT/dotnet-core-examples) respository, the [Java](https://java.com/en/) examples provide both Console and Graphical examples.
Additionally, the code complexity moves from Intermediate to advanced rather quickly. However, the same simplistic classification (from a new developer standpoint) exists. Professional and experienced  [OOP Developers](https://en.wikipedia.org/wiki/Object-oriented_programming) should consider the examples intro-level. New Developers, or those switching over to 
[OOP Development](https://en.wikipedia.org/wiki/Object-oriented_programming) could think of them in terms of:

* **Intermediate** - employs things such as structures, and methods from outside of the main method, in addition to simple class instantiation.

* **Advanced** - implements main methods, Class objects, interfaces, abstract classes and methods, IS-A relationships (Inheritance),
Has-A relationships (association), or any combination thereof.

The code for each application is Verbose, meaning, shortcuts and advanced
concatenations have been kept to a minimum to allow for easier readability.
Code comments are also brief, but should suffice for most readers.

For easy separation of classes, each application has its own package. Each program collection also has its on "Driver" (entry point). Most often, the name takes the form of (AppName)Driver.java. On occasion, the entry point is simply named Driver.java

## How to Run Examples

The easiest way to run the applications is from an IDE. Simply import
the projects (ConsoleApps and GuiApps) into your IDE, browse to the **src/** folder, then expand the package you want to test. This is true for both console and UI packages.

## Example List

**Graphical Interface Examples**

* (Intermediate) [Hi-Low Redux Game](https://github.com/KI7MT/java-app-examples/tree/master/GuiApps/src/beam/example/redux/game) - Is a very simple (1 to 10) redux guessing game.

* (Advanced) [Fire Fighter Cost Calculator](https://github.com/KI7MT/java-app-examples/tree/master/GuiApps/src/beam/example/firefighter/cost) - Is a cost estimation calculator. I plan on dramatically expanding this application in the future. 

**Console Application Examples**

* (Intermediate) [Salary Tests](https://github.com/KI7MT/java-app-examples/tree/master/ConsoleApps/src/beam/example/salary/tests) - is a simple test application. It employs class instantiation, and static methods to test three different conditions.

* (Intermediate) [Airline Reservation](https://github.com/KI7MT/java-app-examples/tree/master/ConsoleApps/src/beam/example/airline/reservation) - is a single-file seat assignment app. It employs boolean arrays, input scanners, random number generators, and static methods.

* (Intermediate) [Calculate Sales](https://github.com/KI7MT/java-app-examples/tree/master/ConsoleApps/src/beam/example/calculate/sales) - is a product sales calculator. It employs an input scanner, while-loops, for-loops, switch, and if-else statements.

* (Intermediate) [Hourly Salary](https://github.com/KI7MT/java-app-examples/tree/master/ConsoleApps/src/beam/example/hourly/salary) - is a pay calculator that allows for multi-employee input. It employs an input scanner and while-loop.

* (Intermediate) [Parking Garage](https://github.com/KI7MT/java-app-examples/tree/master/ConsoleApps/src/beam/example/parking/garage) - is a parking fee calculator. It employs an input scanner, while-loop and it-statements.

* (Advanced) [Animal Sighting](https://github.com/KI7MT/java-app-examples/tree/master/ConsoleApps/src/beam/example/animal/sighting) - is an application that counts animal sightings and prints the totals. It uses ArrayLists, input scanners, while-loops, class instantiation, Object, hashCode, and toString overrides.

* (Advanced) [Domain Purchase](https://github.com/KI7MT/java-app-examples/tree/master/ConsoleApps/src/beam/example/domain/purchase) - in an invoicing example application. It implements an [Interface](https://docs.oracle.com/javase/tutorial/java/concepts/interface.html), [Abstract Method](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html), random generator, for-loops, and static methods.

* (Advanced) [Gross Pay](https://github.com/KI7MT/java-app-examples/tree/master/ConsoleApps/src/beam/example/gross/pay) - is a gross pay calculator that uses three different pay types: S=Salary, H=Hourly, C=Commission. It extends (has-a) an Employee class, uses an [Abstract Method](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html), for-loops, and switch statements.

* (Advanced) [Radio Station](https://github.com/KI7MT/java-app-examples/tree/master/ConsoleApps/src/beam/example/radio/station) - is a station inventory and cost application. It employs class instantiation, ArrayLists, and if-else statements.
