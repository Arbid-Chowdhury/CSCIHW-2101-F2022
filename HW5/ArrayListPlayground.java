package HW5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPlayground {
    public static void main(String[] args) {
        System.out.println("Start of HW5");

        // Question 1
        // Write Java statements that do the following:
        // a) Declare an arrayList nums of 15 elements of type Integer.
        // b) Output the value of the tenth element of the array nums.
        // c) Set the value of the 5th element of the array nums to 99.
        // d) set the value of the 13th element to 15
        // d) set the value of the 2nd element to 6
        // d) Set the value of the 9th element of the array nums to the sum of the 13th
        // and 2nd elements of the array nums.



        //q: make an arraylist of 15 elements
        // ArrayList<Integer> nums = new ArrayList<Integer>(15);




        ArrayList<Integer> nums = new ArrayList<Integer>(15);
        // fill the arraylist nums with 0's
        for (int i = 0; i < 15; i++) {
            nums.add(0);
        }
        System.out.println(nums.get(10));
        nums.set(4, 99);
        nums.set(12, 15);
        nums.set(1, 6);
        nums.set(8, nums.get(12) + nums.get(1));
        System.out.println(nums.get(9));
        System.out.println(nums);

        // Question 2
        // a) create an arrayList of Strings that contain each day of the week.(starting
        // on monday)
        // b) output each of the days of the week
        // c) output the days of the week that we have class
        // d) change the arrayList to start on Sunday
        ArrayList<String> days = new ArrayList<String>(7);
        for (int i = 0; i < 7; i++) {
            days.add("");
        }
        days.set(0, "Monday");
        days.set(1, "Tuesday");
        days.set(2, "Wednesday");
        days.set(3, "Thursday");
        days.set(4, "Friday");
        days.set(5, "Saturday");
        days.set(6, "Sunday");
        System.out.println(days);
        System.out.println(days.get(1) + " and " + days.get(3));
        Collections.rotate(days, 1);
        System.out.println(days);

        // Question 3
        // a) create an ArrayList and prompt the user for numbers to add to it until the
        // number 0 is selected
        // b) return the largest and smallest number
        // c) return the ArrayList sorted smallest to largest
        // d) take that ArrayList see if its size is divisable by 3 and then output the
        // ArrayList in a matrix format
        // NOTE: make the matrix n X 3 so it can be n rows by 3 columns
        // EX. ArrayList [1,2,3,4,5,6,7,8,9]
        // 1 2 3
        // 4 5 6
        // 7 8 9
        // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers
        // and add them until it is
        // ArrayList Size: 7
        // Please enter 2 more numbers to create the matrix...
        //
        // Hint 1: use collections sort to sort the numbers
        // Hint 2: you can see if the size of the array list is divisible by 3 by
        // running:
        // numbers.size()%3==0
        // Hint 3: You can use this logic to print the array list in a 3x3 pattern once
        // its created:
        // for(int i=0;i<numbers.size();i++)
        // {
        // System.out.print(numbers.get(i)+" ");
        // if((i+1)%3==0)
        // {
        // System.out.println();
        // }
        // }
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        while (numbers.size() < 9) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            numbers.add(num);
            if (num == 0) {
                if (numbers.size()< 9){
                    System.out.println("Please enter " + (9 - numbers.size()) + "more numbers to create the matrix...");
                    Collections.sort(numbers);
                    System.out.println(numbers);
                    System.out.println("The smallest value is " + numbers.get(0));
                    System.out.println("The largest value is " + numbers.get(numbers.size() - 1));
                }
                else if (numbers.size() == 9){
                Collections.sort(numbers);
                System.out.println(numbers);
                System.out.println("The smallest value is " + numbers.get(0));
                System.out.println("The largest value is " + numbers.get(numbers.size() - 1));
                }
            }
            else if (num != 0) {
                Collections.sort(numbers);
                System.out.println(numbers);
                System.out.println("The smallest value is " + numbers.get(0));
                System.out.println("The largest value is " + numbers.get(numbers.size() - 1));
            }

            for(int i=0;i<numbers.size();i++)
            {
             System.out.print(numbers.get(i)+" ");
            if((i+1)%3==0)
            {
             System.out.println();
            }
            }
            }
        }


        //for (int i = 0; i < 9; i++) {
           // System.out.println("Enter a number: ");
            //int num = input.nextInt();
            //numbers.add(num);
            //if (num == 0){
              //  break;
            //}
            //if (numbers.size() < 9) {
            //System.out.println("Please enter " + (9 - numbers.size()) + "more numbers to create the matrix...");


        }
    

    
