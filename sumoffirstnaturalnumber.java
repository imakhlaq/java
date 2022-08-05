public class sumoffirstnaturalnumber {



public static int sumof(int p){
    int res=0;
    if(p==0){
        return res;
        
    }
    else{
        res+=p;
        System.out.println(res);
        sumof(p-1);
        return res;

    }

   
    


}
    
    public static void main(String[] args) {
        int n=3;
        
        System.out.println(sumof(n));
    }
}
