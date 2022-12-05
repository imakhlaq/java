class Phone {
    public void on() {
        System.out.println("turn on phone");
    }

    public void greeting() {
        System.out.println("Hello how are you");
    }

    public void state() {
        System.out.println("life and death");
    }
}

class Smartphone extends Phone {
    @Override
    public void state() {
        System.out.println("no idea");

    }

    public void model() {
        System.out.println("phone name");
    }
    

}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Phone newPhone = new Phone();
        // newPhone.greeting();

        Phone newphone = new Smartphone();
        newphone.state();
        newphone.greeting();
        // newphone.model();
    }
}
