# Null Object

___

### Definition

A null object is useful when you don't have a meaningful object to return, but you still want to avoid returning null,
so that clients don't have to check for null every time they use the returned object.

### Notes
 - The implementation behaviour of the null object is very predictable and has no side effects: it does nothing.
 - The null object is often implemented as empty body method.