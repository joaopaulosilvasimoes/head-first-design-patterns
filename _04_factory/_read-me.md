# Design Principle: FACTORY

SIMPLE FACTORY: While not a bonafide design pattern, is a simple way to decouple your clients from concrete classes.

FACTORY METHOD: Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to the subclasses.

Relies on inheritance: Object creation is delegated to subclasses which implement the factory method to create objects.

ABSTRACT FACTORY: Provide an interface for creating families of related or dependent objects witout specifying their concrete classes.

Relies on object composition: Object creation is implemented in methods exposed in the factory interface.

- Depend on abstractions. Do not depend on concrete classes.

### The main difference between a "factory method" and an "abstract factory" is that the factory method is a method, and an abstract factory is an object.