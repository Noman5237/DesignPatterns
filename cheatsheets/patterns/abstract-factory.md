# Abstract Factory Pattern

___

### Definition

The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without
specifying their concrete classes.

### Structure

```puml
@startuml

abstract class ProductA {}
abstract class ProductB {}

class ConcreteProductA1 extends ProductA {}
class ConcreteProductA2 extends ProductA {}

class ConcreteProductB1 extends ProductB {}
class ConcreteProductB2 extends ProductB {}

interface AbstractFactory {
    + {abstract} createProductA()
    + {abstract} createProductB()
}

class ConcreteFactory1 implements AbstractFactory {
    + createProductA()
    + createProductB()
}

class ConcreteFactory2 implements AbstractFactory {
    + createProductA()
    + createProductB()
}

class Client {}

Client -left-> ProductA
Client -right-> ProductB

ConcreteFactory1 -up-> ConcreteProductA1
ConcreteFactory1 -up-> ConcreteProductB1

ConcreteFactory2 -up-> ConcreteProductA2
ConcreteFactory2 -up-> ConcreteProductB2

Client o-> AbstractFactory : factory

@enduml
```

### Notes

- Often methods of an Abstract Factory are implemented as factory methods.
- **Abstract Factory Interface changes if new products are added.**
- Clients get its products from concrete implementations of Abstract Factory.