class Teacher{
    private int id;
    private String name;
    private String address;

    public Teacher(){
        id=1;
        name="Akhlaq";
        address="Rahmat nager kareli";
    }

    public Teacher(int a){
        id=a;
    }
    public Teacher(int a ,String b){
        id=a;
        name=b;
        }
    public int getId(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }


}


public class constructure {
    public static void main(String[] args) {
        // Teacher newTeacher=new Teacher();
        // Teacher newTeacher=new Teacher(3);
        Teacher newTeacher=new Teacher(3,"rahul");
        System.out.println(newTeacher.getId());
        System.out.println(newTeacher.getname());
        System.out.println(newTeacher.getaddress());
        
    }
}
