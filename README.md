This repository demonstrates the implementation of Gang of Four (GoF) Design Patterns in a Banking System using Java and Spring Boot. The project showcases how different creational, 


Design Patterns Implemented

1. Creational Design Patterns

Singleton: Ensures a single instance of database connection.

Factory Method: Creates different types of bank accounts dynamically.

Abstract Factory: Manages related bank services (Account & Card Services).

Builder: Constructs complex bank account objects step-by-step.

Prototype: Clones existing bank account objects to save processing time.

2. Structural Design Patterns

Adapter: Converts third-party payment gateways to a common banking interface.

Bridge: Decouples loan processing logic from bank types.

Composite: Represents hierarchical structures in loan approvals.

Decorator: Adds features like overdraft protection dynamically to accounts.

Facade: Provides a unified interface for customer banking operations.

Flyweight: Reduces memory usage by sharing common banking objects.

Proxy: Adds security layers for account access.

3. Behavioral Design Patterns

Chain of Responsibility: Handles transaction approvals at multiple levels.

Command: Implements undo/redo operations in fund transfers.

Interpreter: Parses banking queries and processes user requests.

Iterator: Iterates over account transaction history.

Mediator: Manages interactions between banking services.

Observer: Notifies customers of transaction updates.

State: Manages different states of an account (Active, Suspended, Closed).

Template Method: Defines a standard procedure for loan approvals.

Visitor: Applies different operations on account transactions.

Strategy: Switches between different interest calculation strategies.structural, and behavioral design patterns can be applied to solve real-world banking challenges efficiently.
