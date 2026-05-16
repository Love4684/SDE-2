// ============================================================
// JAVA CORE — Lesson 1: OOP Fundamentals
// ============================================================
// Go through each section, PREDICT the output, then run it.
// Understanding "why" is more important than memorizing.

public class OOPBasics {

    // ========================================================
    // 1. FOUR PILLARS — Quick Recap
    // ========================================================
    // Encapsulation  → Bundle data + methods, hide internals (private fields + getters/setters)
    // Abstraction    → Hide complexity, expose what's needed (abstract class / interface)
    // Inheritance    → Reuse code via parent-child (extends / implements)
    // Polymorphism   → Same method, different behavior (compile-time: overloading, runtime: overriding)

    // ========================================================
    // 2. METHOD OVERLOADING (Compile-time Polymorphism)
    // ========================================================
    // Rules: Same method name, different parameter list (type, count, or order)
    // Return type alone does NOT count

    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }
    static int add(int a, int b, int c) { return a + b + c; }

    // ========================================================
    // 3. METHOD OVERRIDING (Runtime Polymorphism)
    // super.method() → parent class ki method forcefully call karo
    // override nahi → parent method automatically chalegi
    // static → class/reference decide karegi (compile time)
    // non-static → actual object decide karega (runtime)
    // ========================================================
    static class Animal {
        String sound() { return "Some sound"; }

        // This is NOT overriding — it's a static method (belongs to class, not instance)
        static String type() { return "Animal"; }
    }

    static class Dog extends Animal {
        @Override
        String sound() { return "Bark"; }  // Runtime polymorphism

        // This HIDES the parent static method, does NOT override it
        static String type() { return "Dog"; }
    }

    // ========================================================
    // 4. ABSTRACT CLASS vs INTERFACE
    // ========================================================

    // Abstract class: partial implementation, constructor, instance variables, single inheritance
    static abstract class Vehicle {
        String brand;  // Can have state

        Vehicle(String brand) { this.brand = brand; }  // Can have constructor

        abstract void start();  // Must be implemented by subclass

        void stop() { System.out.println(brand + " stopped"); }  // Concrete method
    }

    // Interface: contract only (Java 8+ can have default/static methods)
    interface Electric {
        void charge();  // public abstract by default

        default void showBatteryStatus() {  // Java 8+ default method
            System.out.println("Battery OK");
        }

        static int maxRange() { return 500; }  // Java 8+ static method
    }

    interface Autonomous {
        void selfDrive();

        default void showBatteryStatus() {  // Same default method name!
            System.out.println("Autonomous Battery OK");
        }
    }

    // Diamond Problem: Two interfaces with same default method
    // Java FORCES you to override and resolve the conflict
    static class Tesla extends Vehicle implements Electric, Autonomous {
        Tesla() { super("Tesla"); }

        @Override
        void start() { System.out.println("Tesla silent start"); }

        @Override
        public void charge() { System.out.println("Supercharging..."); }

        @Override
        public void selfDrive() { System.out.println("Autopilot engaged"); }

        @Override
        public void showBatteryStatus() {
            // Resolve diamond problem — choose one or write custom
            Electric.super.showBatteryStatus();  // Explicitly call Electric's version
        }
    }

    // ========================================================
    // 5. COVARIANT RETURN TYPE
    // ========================================================
    static class Shape {
        Shape create() { return new Shape(); }
    }

    static class Circle extends Shape {
        @Override
        Circle create() { return new Circle(); }  // Return type is subclass — VALID (covariant)
    }

    // ========================================================
    // TRICKY OUTPUT QUESTIONS — Predict before running!
    // ========================================================

    public static void main(String[] args) {

        System.out.println("=== TRICKY Q1: Reference type vs Object type ===");
        Animal animal = new Dog();     // Reference: Animal, Object: Dog
        System.out.println(animal.sound());  // Q: What prints?
        System.out.println(animal.type());   // Q: What prints? (TRICKY — static method)
        // Answer: sound() → "Bark" (runtime polymorphism, actual object is Dog)
        //         type()  → "Animal" (static methods use REFERENCE type, not object type)

        System.out.println("\n=== TRICKY Q2: Overloading with null ===");
        // Uncomment to test — which add() is called?
        // add(null, null);  // COMPILE ERROR: ambiguous if we had add(String, String)

        System.out.println("\n=== TRICKY Q3: Constructor chaining ===");
        class Parent {
            Parent() { System.out.println("Parent constructor"); }
            { System.out.println("Parent instance block"); }
            static { System.out.println("Parent static block"); }
        }
        // Note: Local classes can't have static members, so this is simplified
        // In a real interview, the order is:
        // 1. Parent static block (once, on class load)
        // 2. Child static block (once, on class load)
        // 3. Parent instance block
        // 4. Parent constructor
        // 5. Child instance block
        // 6. Child constructor

        System.out.println("\n=== TRICKY Q4: equals() and == ===");
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1 == s2);       // Q: ? → true  (same string pool reference)
        System.out.println(s1 == s3);       // Q: ? → false (s3 is a new object on heap)
        System.out.println(s1.equals(s3));  // Q: ? → true  (content comparison)

        System.out.println("\n=== TRICKY Q5: Polymorphism with fields ===");
        class Base {
            int x = 10;
            int getX() { return x; }
        }
        class Derived extends Base {
            int x = 20;  // This HIDES parent's x, does NOT override
            @Override
            int getX() { return x; }
        }
        Base obj = new Derived();
        System.out.println(obj.x);       // Q: ? → 10 (fields use REFERENCE type)
        System.out.println(obj.getX());   // Q: ? → 20 (methods use OBJECT type)

        System.out.println("\n=== TRICKY Q6: Abstract class ===");
        // Can you instantiate an abstract class? NO
        // But you CAN do this (anonymous class):
        Vehicle v = new Vehicle("BMW") {
            @Override
            void start() { System.out.println("BMW starts"); }
        };
        v.start();  // BMW starts
        v.stop();   // BMW stopped — concrete method from abstract class

        System.out.println("\n=== Tesla (Diamond Problem Resolution) ===");
        Tesla tesla = new Tesla();
        tesla.start();
        tesla.charge();
        tesla.selfDrive();
        tesla.showBatteryStatus();  // Uses Electric's version (we chose it)
        tesla.stop();               // Inherited from Vehicle

        System.out.println("\n=== KEY TAKEAWAYS ===");
        System.out.println("1. Static methods → resolved by REFERENCE type (no polymorphism)");
        System.out.println("2. Instance methods → resolved by OBJECT type (polymorphism)");
        System.out.println("3. Fields → resolved by REFERENCE type (no polymorphism)");
        System.out.println("4. Diamond problem → Java forces you to override and resolve");
        System.out.println("5. Constructors → Parent first, then child (super() is auto-inserted)");
    }
}

// ========================================================
// HOMEWORK — Try these yourself:
// ========================================================
// 1. Create an interface with a default method, then override it
// 2. Create a scenario that causes the diamond problem and resolve it
// 3. Write a class hierarchy and predict which methods get called with:
//    Parent ref = new Child();
//    ref.staticMethod(); ref.instanceMethod(); ref.field;
// ========================================================
