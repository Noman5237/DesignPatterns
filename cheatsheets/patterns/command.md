# Command Pattern

___

### Definition

The command pattern encapsulates a request as an object, and parameterize clients with different requests, queue or log
requests, and support undoable operations.

### Structure

```puml
@startuml

interface Command {
    + execute()
}

class ConcreteCommand implements Command {
    - receiver
    - params
    + execute()
}

class Receiver {
    + action()
}

class Invoker {
    + command
    + setCommand(command)
    + executeCommand()
}

class Client {
}

ConcreteCommand -.left-> Receiver
Invoker -> Command
Client -> Invoker
Client -> ConcreteCommand
Client -> Receiver

@enduml
```

### Notes

- The Meta Command Pattern creates macros of commands so that multiple commands can be executed at once.
- The Invoker and Receiver now both depends on Command abstraction rather than concrete classes.