# Design Principle: TEMPLATE METHOD

Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

- A hook is a method that is declared in the abstract class, but onyl given an empty or default implementation. This gives subclasses the ability to "hook into" the algorithm at various points, if they wish; a subclass is also free to ignore the hook.

- The hollywood principle: Don't call us, we'll call you, the connection between the Hollywood Principle, and the Template Method is probably somewhat apparent: when we design with the Template Method Pattern, we're telling subclasses, "Don't call us, we'll call you".