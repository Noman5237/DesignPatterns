# Decorator Pattern

___

### Definition

Decorator pattern provides a flexible alternative to subclassing for attaching additional responsibilities and extending
functionality dynamically.

### Structure

```puml
abstract class Component {
    + state
    + methodA()
}

class ConcreteComponent extends Component {
    + methodA()
    + methodB()
}

abstract class Decorator extends Component {
    + component
    + Decorator(component)
    + methodA()
    + methodC()
}

class ConcreteDecoratorA extends Decorator {
    + methodA()
    + methodC()
    + methodD()
}

class ConcreteDecoratorB extends Decorator {
    + newState
    + methodA()
    + methodC()
    + methodE()
}

```

### Notes

- Decorator subclasses component to inherit its type not behaviours.
- The behaviours' comes in through composition of decorators with the base components as well as other components.