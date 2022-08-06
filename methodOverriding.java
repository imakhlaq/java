import java.util.concurrent.CancellationException;

import javax.xml.transform.Source;

class MyClass {
    int id;
    int rollnumber;

    public MyClass() {
        this.id = 34;
        System.out.println("default");

    }

    public MyClass(int b) {
        this.id = 34;
        System.out.println("defaultb");

    }

    public void method1() {
        System.out.println("Enter the number");
    }

    public void method2() {
        System.out.println("Enter the rara");
    }
}

class YourClass extends MyClass {
    public YourClass() {

        super(2);
        System.out.println("your class");

    }

    @Override
    public void method2() {
        System.out.println("Enter the rdadadad");
    }

}

public class methodOverriding {
    public static void main(String[] args) {

        // MyClass newMyClass = new MyClass();
        YourClass newClass = new YourClass();

        newClass.method2();

    }
}
