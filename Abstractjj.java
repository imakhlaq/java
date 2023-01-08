
abstract class Base {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
        
    }

    public Base() {
        System.out.println("Base default constructor");

    }

    public Base(int j) {
        System.out.println("overloaded constructor");

    }

    public void sayHellow() {
        System.out.println("hello");

    }

    abstract public void greet();

    abstract public void turnOff();

}

class Derive extends Base {
    Derive() {
        super(2);
        System.out.println("Derived default constructor");
    }

    @Override
    public void greet() {

        System.out.println("hellow from nokia");
    }

    @Override
    public void turnOff() {
        System.out.println("nokia turn off");
    }

}

class Samsung extends Base {
    @Override
    public void greet() {
        System.out.println("hellow from Samsung");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung turn off");
    }

}

public class Abstractjj {
    public static void main(String[] args) {

        // Samsung Newphone = new Samsung();
        // Newphone.greet();
        // Newphone.turnOff();

        // Base newNokia=new Base(); cant creat objet of abstact class

        Derive newNokia = new Derive();
        newNokia.turnOff();
        newNokia.greet();

    }

}
