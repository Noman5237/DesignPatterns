# Design Principles

___

1. Identify the aspects of your application that vary and separate them from what stays the same.

> - Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don’t.
> - Fewer unintended consequences of code changes and more flexibility in your systems!

2. Program to an interface, not an implementation.

> - *Program to an interface* really means
    *Program to a supertype*.
> - The point is to exploit polymorphism by programming to a supertype so that the actual runtime object isn’t locked into the code.

3. Favour composition over inheritance.

> - It lets you encapsulate a family of algorithms into their own set of classes and also lets you change behaviour at runtime.

4. Strive for loosely coupled designs between the objects that interact.

> - Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the interdependency between the objects.

5. Classes should be open for extension, but closed for modification.

> - By dynamically composing objects, functionality can be added by writing new code rather than altering existing code which reduces the chances of introducing bugs or untended side effects.

6. Depend upon abstractions. Do not depend upon concrete classes.

> - High level components should not depend on low level components; rather, they should both depend upon abstractions.
> - Avoid creating different type of instances and use a factory method to create them for you.
> - Try not to derive from a concrete class or override implemented methods of parent class.