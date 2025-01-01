# Testing-Equality-of-Strings
In a computer, two objects are identically equal if they occupy the same space in memory, so
they have the same address. In other words, there really only one object, but with two different
names. That meaning of equality is reflected in Java by the equality operator. If x and y are references to objects, then the condition (x == y) will be true only if x and y both refer to the same
object.
But the normal concept of equality in mathematics is that the two things have the same value.
This distinction is handled in Java by the equals() method, defined in the Object class (see
Chapter 4) and thus inherited by every class. As defined there, it has the same effect as the equals
operator: x.equals(y) means x == y. But that equals() method is intended to be overridden
in subclasses so that it will return true not only when the two objects are identically equal, but
also when they are separate objects that are “the same” in whatever sense the class designer
intends. For example, x.equals(y) could be defined to be true for distinct instances x and y of
Point class if they have the same coordinates.
