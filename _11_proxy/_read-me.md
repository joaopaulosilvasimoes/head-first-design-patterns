# Design Principle: PROXY

Provides a surrogate or placeholder for another object to control access to it.

- The Remote Proxy, manages interaction between a client and a remote object.

- The Virtual Proxy, controls access to an object that is expensive to instantiate.

- The Protection Proxy, controls access to the methods of an object based on the caller.

- Many other variants of the Proxy Pattern exist including caching proxies, firewall proxies, and so on.

### The RMI Activation mechanism has been deprecated and may be removed from a future version of the Java Platform. All of the classes and interfaces in this package have been terminally deprecated. The rmid tool has also been terminally deprecated. There is no replacement for the RMI Activation mechanism in the Java Platform. Users of RMI Activation are advised to migrate their applications to other technologies.