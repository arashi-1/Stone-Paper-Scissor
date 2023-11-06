import java.util.*;
import java.util.Random;
public class SPS {
    public static void main(String[] args) {
        int round, pl=0,opp=0, replay;
        System.out.println("Welcome to minimalistic simulation of Stone Paper Scissor");
        System.out.println("Enter player's name: " );
        Scanner sc = new Scanner(System.in);
        String playernameString = sc.nextLine();
        
        do{
            System.out.println("Choose the number of rounds you wanna play...\n");
            round = sc.nextInt();
            for(int i=1;i<=round;i++){
                System.out.println("Round"+i+"Begins");
                System.out.println("Stone Paper Scissor");
                System.out.println("1-Stone \n 2-Paper \n 3-Scissor");
                System.out.println("Enter your choice");
                pl = sc.nextInt();
                Random rand = new Random();
                opp = rand.nextInt(1,4);
                if(pl==1 && opp==1){
                    System.out.println("You Choose Stone Opponent Choose Stone \n Its draw");
                }
                else if(pl==2 && opp==2){
                    System.out.println("You Choose Paper Opponent Choose Paper \n Its draw");
                }
                else if(pl==3 && opp==3){
                    System.out.println("You Choose Scissor Opponent Choose Scissor \n Its draw");
                }
                else if(pl==1 && opp==2){
                    System.out.println("You Choose Stone Opponent Choose Paper \n You loose");
                    opp +=1;
                }
                else if(pl==1 && opp==3){
                    System.out.println("You Choose Stone Opponent Choose Scissor \n You Win");
                    pl +=1;
                }
                else if (pl==2 && opp==1){
                    System.out.println("You Choose Paper Opponent Chosse Stone \n YOu Win");
                    pl +=1;
                }
                else if (pl==2 && opp==3){
                    System.out.println("You Chosse Paper Opponent Chosse Scissor \n YOU Loose");
                    opp +=1;
                }
                else if (pl==3 && opp==1){
                    System.out.println("You Choose Scissor Opponent Choose Stone \n YOu Loose");
                    opp +=1;
                }
                else if (pl==3 && opp==2){
                    System.out.println("You Choose Scissor Opponent Choose Paper \n You Win");
                    pl +=1;
                }
                else{System.out.println("Invalid Choice");}
            } 
            System.out.println("After Round "+round+" Opponent Score "+opp);
            System.out.println("After "+round +" "+ "round "+playernameString+" Score "+pl);
            /*if(opp>pl){
                System.out.println("YOU LOSE");
            }
            else{
                System.out.println("YOU WIN");
            }*/
            System.out.println("Press 0 to exit , Press 1 to replay");
            replay = sc.nextInt();




        }
        while(replay==1);
        System.out.println("Thanks for playing/n Creator --> Anoop");
    }
}
