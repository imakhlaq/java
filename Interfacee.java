
interface cycle {
    int a = 34;// feilds

    void breakUp();

    void speedUp();
    // can be more things

}

interface style {
    void horn();

    void song();
}

class Base implements cycle, style {
    public void breakUp() {
        System.out.println("Break");
    }

    public void speedUp() {
        System.out.println("speeding up");
    }

    public void horn() {
        System.out.println("hornnnnnnnnnnnnnn");

    }

    public void song() {
        System.out.println("Laaaaaa laaaaa");
    }

}

public class Interfacee {
    public static void main(String[] args) {
        Base NewBase = new Base();
        NewBase.breakUp();
        NewBase.horn();
        NewBase.song();

    }
}
