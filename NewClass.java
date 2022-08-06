
 class Employe
{
    int id;
    String name; 
    int salary;
    public void printDetails(){
        System.out.println("My id is "
                                +id+". My name is "+name +" . My salary is "+salary);
    }

}

public class NewClass {
    public static void main(String[] args) {
        System.out.println("New Class");


        Employe akhlaq=new Employe();//instantion a new employe object
        

        akhlaq.id=12;
        akhlaq.name="Akhlaq";
        akhlaq.salary=30000;
        akhlaq.printDetails();


        Employe jhon=new Employe();
        jhon.id=13;
        jhon.name="Johan";
        jhon.salary=45000;
        jhon.printDetails();

    }
}
