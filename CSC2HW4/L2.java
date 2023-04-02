package CSC2HW4;
import java.util.Scanner;
public class L2 extends Tools {
public L2() {
    System.out.println("Start Level 2");
        int score = 0;
        int num1 = Tools.randomNum();
        int num2 = Tools.randomNum();
        int answer = num1 + num2;
        int attempt = 0;

        if (answer >= 0) {
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
                if (answer >= 0){
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
                System.out.println("Welcome to Level 3!");
                L3 level3 = new L3();}
            }
        else 
        {
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
    
