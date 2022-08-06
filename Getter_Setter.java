

class Student{
    private int id;
    private String name;
    private String cast;

   public void setId(int newid){
    if(newid>0){
        id=newid;
    }
    else{
        System.out.println("Invalid input");
    }

   }
   public int getId(){
    return id;
    
   }

   public void setName(String newname){
    if(name.length()>4){
        name=newname;

    }
    else{
        System.out.println("Too short");
    }
   }
   public String getName(){
    return name;
   }
    public void setcast(String newcast){
        cast=newcast;
    }
    public String getcast(){
        return cast;
    }




}





public class Getter_Setter {
    public static void main(String[] args) {

        Student akhlaq=new Student();
        akhlaq.setId(0);
         System.out.println(akhlaq.getId());
         akhlaq.setcast("Islam");
          System.out.println(akhlaq.getcast());





        
    }
    
}
