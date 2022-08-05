public class Recursion {



        static int factorial(int n){
            if(n==0 || n==1){
                return 1;
            }
            else{
                n=n * factorial(n-1);
            }
            return n;
        }


    public static void main(String[] args) {
        System.out.println(factorial(4));
        
    }
}
