public class Varargs {
    int addNum(int i,int ...arr){
        int result=i;
        for(int x:arr){
            result+=x;


        }
        return result;

    }
    public static void main(String[] args) {
        Varargs obj=new Varargs();
        System.out.println(obj.addNum(3,3,2,54,6,56,4));
        System.out.println(obj.addNum(3,3,2,54,6,56,4,55));
        
    }
}
