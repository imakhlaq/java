
import java.util.*;

class Game{
   private int genrated_num;
   private int user_number;
   private int score=1;
   


	
    public Game(){
        Random r=new Random();
		genrated_num=r.nextInt(100);
    }



    public int getGenrated() {
        return genrated_num;
    }

    public void userInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        user_number=sc.nextInt();
        
        
    }
    public int getUser_number() {
        return user_number;
    }
    public int inputHighNumber(int user_num){
        System.out.print("Choose small value : ");
                Scanner sc=new Scanner(System.in);
                user_num=sc.nextInt();
                return user_num;


    }
    public int inputLowNumber(int user_num){
        System.out.print("Choose High value : "); 
                Scanner sc=new Scanner(System.in);
                user_num=sc.nextInt();
                return user_num;
    }
    public void gussNumber(int user_num,int gen_num){
        while(user_num!=gen_num){
            if(user_num>gen_num){
                user_num=inputHighNumber(user_num);            
            }
            else{
                user_num=inputLowNumber(user_num);

        }
        score++;

        }

    }
    public int getScore() {
        return score;
    }
    
}
public class GussingGame {
    public static void main(String[] args) {

        Game newgame=new Game();
        System.out.println("====================Begain==================");
        newgame.userInput();
        newgame.gussNumber(newgame.getUser_number(),newgame.getGenrated());
        System.out.println("====================End====================");
        System.out.println("Your score is " + newgame.getScore());
        
        
        
        
    }


   

    
}
