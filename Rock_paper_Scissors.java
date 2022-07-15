package com.company;

import java.util.Random;
import java.util.Scanner;

public class Rock_paper_Scissors {
    public static void main(String[] args) {



        Random rand = new Random();         // Random number generation
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissor game !");
        System.out.print("Enter no. of Matches  want to play : ");
        byte time = sc.nextByte();
        System.out.println("Enter 0 to choose Rock .");
        System.out.println("Enter 1 to choose Paper .");
        System.out.println("Enter 2 to choose Scissor .");
        //byte choose = sc.nextByte();
        int win = 0;
        int loose = 0;


        while(time>0)
        {
            System.out.print("Enter your choice : ");
            byte choose = sc.nextByte();
           // int take = rand.nextInt(3);         // It can choose any number between 0 to 2
            if(choose==0)
            {
                System.out.println("You chooses : Rock");
            }
            else if(choose==1)
            {
                System.out.println("You chooses : Paper");
            }
            else if(choose==2)
            {
                System.out.println("You chooses : Scissor");
            }
            else
            {
                System.out.println("Invalid choice !");
                break;
            }

            int take = rand.nextInt(3);         // It can choose any number between 0 to 2
            System.out.println("Computer choose "+take);
            if(take == 0)
            {
                System.out.println("Computer chooses : Rock");
            }
            else if(take == 1)
            {
                System.out.println("Computer chooses : Paper");
            }
            else if(take == 2)
            {
                System.out.println("Computer chooses : Scissor");
            }

            if((choose == 0 && take==0) ||(choose==1 && take==1)||(choose==2 && take==2) )
            {
                System.out.println("Match TIE !");
            }
            else if((choose == 0 && take==1) ||(choose==1 && take==2)||(choose==2 && take==0))
            {
                System.out.println("Computer Win !");
                loose++;
            }
            else if((choose == 0 && take==2) ||(choose==1 && take==0)||(choose==2 && take==1))
            {
                System.out.println("You Win !");
                win++;
            }
            time-- ;
        }
        if(win == loose && win != 0)
        {
            System.out.println("Overall Match TIE !");
        }
        else if(win>loose)
        {
            System.out.println("Overall you Win !");
        }
        else if(win<loose)
        {
            System.out.println("Overall you Loose !");
        }



/*
        // Method 2
    Scanner s = new Scanner(System.in);
    Random rand = new Random();

        System.out.print("No. of matches wants to play : ");
        byte time = s.nextByte();
        System.out.println("Enter 0 to choose : Rock");
        System.out.println("Enter 1 to choose : Paper");
        System.out.println("Enter 2 to choose : Scissor");
        int win = 0;
        int loose = 0;


        while(time>0)
        {
            System.out.print("Enter your choice : ");
            byte choice = s.nextByte();
            if(choice == 0)
            {
                System.out.println("Your choice is : Rock");
            }
            else if(choice == 1)
            {
                System.out.println("Your choice is : Paper");
            }
            else if(choice == 2)
            {
                System.out.println("Your choice is : Scissor");
            }
            else
            {
                System.out.println("Invalid Choice !");
                break;                                  // Out of the while loop
            }

            int type = rand.nextInt(3);
            if(type == 0)
            {
                System.out.println("Bot chooses : Rock");
            }
            else if(type == 1)
            {
                System.out.println("Bot chooses : Paper");
            }
            else if(type == 2)
            {
                System.out.println("Bot chooses : Scissor");
            }

            if ((choice == 0 && type == 0 )||(choice == 1 && type == 1 )||(choice == 2 && type == 2 ))
            {
                System.out.println("Match TIE !");
            }
            else if ((choice == 0 && type == 1 )||(choice == 1 && type == 2 )||(choice == 2 && type == 0 ))
            {
                System.out.println("You Loose  !");
                loose++;
            }
            else if ((choice == 0 && type == 2 )||(choice == 1 && type == 0 )||(choice == 2 && type == 1 ))
            {
                System.out.println("You Win  !");
                win++;
            }
            time--;

        }
        if((win == loose) && win!=0)
        {
            System.out.println("Overall Match TIE !");
        }
        else if(win>loose)
        {
            System.out.println("Overall you Win !");
        }
        else if(win<loose)
        {
            System.out.println("Overall You loose !");
        }


 */

    }
}
