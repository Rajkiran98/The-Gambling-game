//On the top of your Program File you are submitting:
//use comments:
//Name: RAJ KIRAN
//Student ID:201905722
//Date Submitted: 19/03/2021
//Class IN2203 Section Number G1
//Name of work: Assignment 1: The gambling Game
import java.util.*;
import java.lang.Math;


public class MainApplicaton {
    public static void main(String[] args){
    Casino c= new Casino();
    c.OrganizeNewGame();
    }
}
class Casino{
    Player p1= new Player();
    Game g1= new Game();
    String userAnswer;
        Scanner s= new Scanner(System.in);
        public void OrganizeNewGame(){
            System.out.println("Welcome to the Casino: Would you like to play a game? (y/n)");
        userAnswer= s.nextLine();
        if(userAnswer.equals("y")){
            System.out.println("let's get started");
                    g1.PlayGame();
                    p1.PlayerInput();
                    p1.DecidingWinner();
}
else
{System.out.println("Good bye");}
}
}
class Game{
    Random r= new Random();
    int ComputerGuess= r.nextInt(100) ;
    
    public void PlayGame(){
        System.out.println("Guess a number from 1 to 100");
        System.out.println("I'll guess a game ");
        System.out.println("If your guess is within 20 of my guess: then you win . Else i will win ");
        ComputerGuess= ComputerGuess();
        
        
    }
     public int ComputerGuess(){
      int programGuess;
       programGuess = r.nextInt(100);
      return programGuess;
     }
}
class Player extends Game{
    String userName;
    int userAge;
    Game g2= new Game();
    int guessNumber;
    Scanner sc= new Scanner(System.in);
    
    
    public void PlayerInput()
    {
         System.out.println("Enter Player's name");
      userName= sc.nextLine();
        System.out.println("Enter player's Age");
        userAge= sc.nextInt();
         System.out.println("Enter a guess");
            guessNumber= sc.nextInt();
    }
    
    public void DecidingWinner()
    {
        int trials= 10;
        
        int a=1;
        
      while(a<=trials)
        { a++;
           
            
            if(Math.abs(guessNumber - g2.ComputerGuess)<20 )
            {System.out.println("Victory! User WIN ");
                System.out.println("Number is  " + g2.ComputerGuess );
                break;
            }
            else 
            {
                System.out.println(" wrong guess, Enter your guess again");
            }
            if(a==trials)
            {
                System.out.println("User Lost");
                System.out.println("The number was"+ ComputerGuess);
            }
            
        }
        
        
    }
    
}