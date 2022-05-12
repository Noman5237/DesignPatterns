# Strategy Pattern

___

### Definition

The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy
lets the algorithm vary independently of clients that use it.

### Structure

```puml
@startuml
class Client 

class Context {
    + strategy
    + setStrategy(strategy)
    + doSomething()
}

Client o--> "many" Context : has

interface Strategy {
    +execute()
}

Context *-up-> Strategy

package ConcreteStrategies {
    class StrategyA implements Strategy {
        +execute()    
    }
    class StrategyB implements Strategy {
        +execute()    
    }
}

@enduml
```

### Notes

- A more modern approach of implementing the concrete strategies is to use predeclared anonymous functions or lambdas,
  which behaves the same but without bloating code with extra classes.