

public class Main {
    public static void main(String[] args) {
        // int sum=0;
        // double []arr={3,4,1,1,1};
        // for(double x: arr){
        //     sum+=x;

        // }
        // System.out.println(sum);







         // int [] marks={34,32,465,767,5344,};
    // int length=marks.length;
    // for(int i=0;i<length;i++){
    //     System.out.println(marks[i]);
    // }

    // int [][] arr = {{2,3,4},{45,65,4},{3,45,6}};

    // for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr[i].length;j++){
    //         System.out.print(arr[i][j]);
    //         System.out.print(" ");
    //     }


    // boolean sum=false;
        // int []arr={3,4,1,1,1};
        // int a=5;
        // for(int x:arr){
        //     if(x==a){
        //         sum=true;

        //     }
            
        // }
        // System.out.println(sum);

        //         double avg=0;
        // double [] arr={2,3,4.5,6,5};
        // for(double x:arr){
        //     avg+=x;
            

        // }
        // avg=(double)avg/arr.length;
        // System.out.println(avg);



        // int [][]arr={{2,3,4},{3,5,6},{3,45,6}};
        // int [][] matrix={{2,3,4},{3,5,6},{3,45,6}};
        // int addmatrix[][]={{0,0,0},{0,0,0},{0,0,0}};

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         addmatrix[i][j]=arr[i][j]+matrix[i][j];
        //     }
        // }

        // for(int i=0;i<addmatrix.length;i++){
        //     for( int j=0;j<addmatrix[i].length;j++){
        //         System.out.print(addmatrix[i][j]);

        //     }
        //   System.out.println("");  

        // }


        

        int [] arr={2,3,4,6,5};
        int l=arr.length;
    int n=Math.floorDiv(l, 2);


    for(int i=0;i<n;i++){
        int temp=arr[i];
        arr[i]=arr[l-i-1];
        arr[l-i-1]=temp;

    }
    for(int x :arr){
        System.out.println(x);
        
    }

      





    }
}
