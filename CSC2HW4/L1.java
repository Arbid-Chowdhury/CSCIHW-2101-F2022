package CSC2HW4;
import java.util.Scanner;

public class L1 extends Tools{
    public L1 () {
        System.out.println("Start Level 1");
        int score = 0;
        int num1 = Tools.randomNum();
        int num2 = Tools.randomNum();
        int answer = num1 + num2;
        int attempt = 0;

        if (answer < 10) {
            System.out.println("\nQ: " + num1 + " + " + num2 + " = ?");
        }
        else {
            num1 = Tools.randomNum();
            num2 = Tools.randomNum();
            answer = num1 + num2;
            attempt = 0;
        }

        Scanner input = new Scanner(System.in);
        int response = input.nextInt();
        if (response == answer) {
            score++;
            attempt = 0;
            if (score <= 5){
            for (int i = 0; i < 5; i++) {
                i = score;
                num1 = Tools.randomNum();
                num2 = Tools.randomNum();
                answer = num1 + num2;
                if (answer < 10){
                    System.out.println("\nQ: " + num1 + " + " + num2 + " = ?");
                response = input.nextInt();
                if (response == answer) {
                    System.out.println("CORRECT!");
                    score++;
                    attempt = 0;
                    System.out.println("Score: " + score);
                    System.out.println("Attempt: " + attempt);
                } else {
                    System.out.println("WRONG!");
                    attempt++;
                    if (attempt < 2) {
                        System.out.println("\nQ: " + num1 + " + " + num2 + " = ?");
                        response = input.nextInt();
                    } else {
                        System.out.println("END GAME");
                        break;
                    }
                }
            }
        }
            }
            else
             {
                System.out.println("Level 1 COMPLETE!");
                System.out.println("Score: " + score);
                System.out.println("Attempt: " + attempt);
                System.out.println("Welcome to Level 2!");
                L2 level2 = new L2();}
            }
        else {
            System.out.println("WRONG!");
            attempt++;
            if (attempt < 2) {
                System.out.println("\nQ: " + num1 + " + " + num2 + " = ?");
                response = input.nextInt();
                if (response == answer) {
                    System.out.println("CORRECT!");
                    score++;
                    attempt = 0;
                    System.out.println("Score: " + score);
                    System.out.println("Attempt: " + attempt);
                } else {
                    System.out.println("WRONG!");
                    attempt++;
                    System.out.println("END GAME");
                }
            } else {
                System.out.println("END GAME");
            }

            input.close();
        }}}
        /*Scanner input = new Scanner(System.in);
        int attempt = 0;
            if (answer < 10) 
            {
                System.out.println("What is " + num1 + " + " + num2 + "?");
                int response = input.nextInt();
                if (response == answer){   
                    System.out.println("CORRECT!");
                            score++;
                            attempt = 0;
                            System.out.println("Score: " + score);
                            System.out.println("Attempt: " + attempt);
                            if (score < 5) {
                        while (score < 5) {
                        num1 = Tools.randomNum();
                        num2 = Tools.randomNum();
                        answer = num1 + num2;
                        response = input.nextInt();
                            System.out.println("What is " + num1 + " + " + num2 + "?");
                            response = input.nextInt();
                        if (response == answer){ 
                            System.out.println("CORRECT!");
                            score++;
                            attempt = 0;
                            System.out.println("Score: " + score);
                            System.out.println("Attempt: " + attempt);
                        }
                        else {
                            System.out.println("WRONG!");
                        attempt++;
                        if (attempt < 2) 
                        {
                            System.out.println(" TRY AGAIN! What is " + num1 + " + " + num2 + "?");
                            response = input.nextInt();
                            if (response == answer) {
                                System.out.println("CORRECT!");
                                score++;
                                System.out.println("Score: " + score);
                                System.out.println("Attempt: " + attempt);
                            } else {
                                System.out.println("WRONG!");
                                attempt++;
                                System.out.println("END GAME");
                            }}}
                    }}
                else 
                {
                System.out.println("Level 1 COMPLETE!");
                System.out.println("Score: " + score);
                System.out.println("Attempt: " + attempt);
                System.out.println("Welcome to Level 2!");
                L2 level2 = new L2();
                }}
                    else {
                        System.out.println("WRONG!");
                        attempt++;
                        if (attempt < 2) 
                        {
                            System.out.println(" TRY AGAIN! What is " + num1 + " + " + num2 + "?");
                            response = input.nextInt();
                            if (response == answer) {
                                System.out.println("CORRECT!");
                                score++;
                                System.out.println("Score: " + score);
                                System.out.println("Attempt: " + attempt);
                            } else {
                                System.out.println("WRONG!");
                                attempt++;
                                System.out.println("END GAME");
                            }
                        }
                    }
                }
            else {
         num1 = Tools.randomNum();
         num2 = Tools.randomNum();
         answer = num1 + num2;
         attempt = 0;
         
                     }
        input.close();
    }}
    */
    
