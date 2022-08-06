
class Base {
    public Base() {
        System.out.println("I am base constructor");
    }

    public Base(int n) {
        System.out.println("hiiiiiiiiiii");
    }

    public Base(int n, int m) {
        System.out.println("fsfsfsfsfsfsf");
    }

}

class Derived extends Base {
    Derived() {
        super(2);
        System.out.println("I am enxtens constructor");
    }

    Derived(int n, int m) {
        // super(n, n);
        System.out.println("I am enxtens overloaded constructor");
    }

}

class Child extends Derived {
    Child() {
        System.out.println("I am enxtens constructor");
    }

    Child(int n, int m) {
        // super(n, n);
        System.out.println("I am enxtens overloaded constructor");
    }

}

public class DerivedClass {
    public static void main(String[] args) {
        // Base newBase = new Base();

        // Derived newDrDerived = new Derived();

        // Derived newDrDerived = new Derived(4, 5);

        Child newDrDerived = new Child(4, 5);
    }
}