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
    class StrategyA {
        +execute()    
    }
    class StrategyB {
        +execute()    
    }
}

Strategy <|-[dashed]- StrategyA
Strategy <|-[dashed]- StrategyB

@enduml
```
