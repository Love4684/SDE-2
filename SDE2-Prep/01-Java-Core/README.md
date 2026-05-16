# 01 — Java Core (Refresh)

> You use Java daily, so this is a **quick refresh** of concepts interviewers love to ask.
> Target: 3-4 days to complete.

---

## Topics Checklist

### A. OOP Fundamentals
- [ ] Four pillars: Encapsulation, Abstraction, Inheritance, Polymorphism
- [ ] Abstract class vs Interface (Java 8+ default/static methods)
- [ ] Method overloading vs overriding (compile-time vs runtime polymorphism)
- [ ] `super` keyword, constructor chaining
- [ ] Covariant return types
- [ ] Diamond problem in Java (interface default methods)

### B. Java Memory Model & JVM
- [ ] Stack vs Heap memory
- [ ] How objects are stored (Young Gen, Old Gen, Metaspace)
- [ ] Garbage Collection basics (GC roots, Mark & Sweep, G1GC)
- [ ] `finalize()` — why it's deprecated
- [ ] Memory leaks in Java (common causes)
- [ ] ClassLoader hierarchy

### C. Strings
- [ ] String pool & interning
- [ ] String vs StringBuilder vs StringBuffer
- [ ] Why String is immutable (security, caching, thread-safety)
- [ ] `equals()` vs `==` for Strings

### D. Collections Framework
- [ ] List: ArrayList vs LinkedList (internal implementation)
- [ ] Set: HashSet vs LinkedHashSet vs TreeSet
- [ ] Map: HashMap internals (buckets, load factor, rehashing, treeification in Java 8)
- [ ] HashMap vs LinkedHashMap vs TreeMap vs ConcurrentHashMap
- [ ] How `hashCode()` and `equals()` contract works
- [ ] Iterator vs ListIterator, fail-fast vs fail-safe
- [ ] Comparable vs Comparator

### E. Generics
- [ ] Type erasure
- [ ] Bounded types (`<T extends Number>`)
- [ ] Wildcards: `<?>`, `<? extends T>`, `<? super T>` (PECS principle)

### F. Exception Handling
- [ ] Checked vs Unchecked exceptions
- [ ] try-with-resources (AutoCloseable)
- [ ] Custom exceptions — when to create them
- [ ] Exception hierarchy (Throwable → Error/Exception)

### G. Java 8+ Features
- [ ] Lambda expressions & functional interfaces
- [ ] Stream API: `map`, `filter`, `reduce`, `collect`, `flatMap`
- [ ] Optional: proper usage, avoiding `get()`
- [ ] Method references (`Class::method`)
- [ ] `default` and `static` methods in interfaces
- [ ] `CompletableFuture` (basics — deep dive in Concurrency module)

### H. Serialization & Cloning
- [ ] Serializable vs Externalizable
- [ ] `transient` keyword
- [ ] Shallow copy vs Deep copy
- [ ] Cloneable pitfalls

### I. Miscellaneous Interview Favorites
- [ ] Immutable class design (step by step)
- [ ] Singleton patterns & how to break them
- [ ] `final`, `finally`, `finalize` differences
- [ ] Pass by value in Java (why "pass by reference" is wrong)
- [ ] `static` keyword: variable, method, block, nested class
- [ ] Marker interfaces (Serializable, Cloneable)
- [ ] Enum: methods, constructor, abstract methods in enum
- [ ] Record classes (Java 14+), sealed classes (Java 17+)

---

## Practice Files
We'll create `.java` files here as we go through each topic with coded examples.

## How to Study
1. Read the concept
2. Code a small example
3. Predict output of tricky snippets (I'll give you these)
4. Note down anything you find surprising

## Start Here
Tell me: **"Start Java Core"** and I'll begin with OOP fundamentals + tricky output questions.
