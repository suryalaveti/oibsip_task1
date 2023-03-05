import java.util.*;
class Guess{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        boolean game=true;
        int trails=0;
        int rounds=0;
        int total_score=0;
        while(game){
            rounds++;
            System.out.println("choose number between 1 to 100 and guess the number within 5 trails");
            int tr=5;
            int i=0;
            int score=10;
            int number=1+(int)(100*Math.random());
            int user=0;
            for(i=0;i<tr;i++){
                System.out.print("Guess the number  :  ");
                user=sc.nextInt();
                if(user<1 || user>100)
                {
                    System.out.println("Please enter valid number");
                    i=i-1;
                    continue;
                }
                if(user==number){
                    System.out.println("Congratulations! you guessed the number");
                    System.out.println(" -------------------- ");
                    System.out.println("| trails  |  score   |");
                    System.out.println(" -------------------- ");
                    System.out.println("|     "+i+"   |    "+score+"     |");
                    System.out.println(" ---------------------");
                    break;
                }
                else if(user<number){
                System.out.println("The number is greater than "+user);
                score-=2;
                }
                else if(user>number){
                System.out.println("The number is less than "+user);
                score-=2;
                }
                System.out.println();
                trails++;
            }
            total_score+=score;
            if(i==tr && user!=number)
            {
                System.out.println("well try you almost reached to the number : "+number);
                System.out.println(" -------------------- ");
                System.out.println("| trails  |  score   |");
                System.out.println(" -------------------- ");
                System.out.println("|     "+i+"   |    "+score+"     |");
                System.out.println(" ---------------------");
            }
            System.out.print("you want to continue the game or not(1 or 0) : ");
            int con=sc.nextInt();
            if(con==1)
            game=true;
            else{
                game=false;

                //if user can quit the game then total game result
                System.out.println(" --------------------------------------------- ");
                System.out.println("| rounds  |  total_trail   |   total_score    |");
                System.out.println(" --------------------------------------------- ");
                System.out.println("|     "+rounds+"   |       "+trails+"       |        "+total_score+"         |");
                System.out.println(" ----------------------------------------------");
            }
        }
    }
}