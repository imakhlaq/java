
abstract class cellphone {
    public void turnOn() {
        System.out.println("turning on");
    }

    public void turnOFf() {
        System.out.println("turning off");
    }

    abstract void Company();
}


interface Gps {

    void connect();

}


interface Music {
    void Gana();
}

class SmartPhone extends cellphone implements Gps, Music {
    @Override
    void Company() {
        System.out.println("apple");
    }

    @Override
    public void connect() {
        System.out.println("connecting to space");
    }

    @Override
    public void Gana() {
        System.out.println("gana playing");

    }

}

interface hollogram {
    void holloFeature();
}

class NewSmart extends SmartPhone implements hollogram {
    public void holloFeature() {
        System.out.println("hollogram call");
    }

}

public class Innterface {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.connect();

        NewSmart newPhone = new NewSmart();
        newPhone.turnOn();

    }
}
