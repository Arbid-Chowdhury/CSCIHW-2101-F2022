package HW4;
import java.util.Scanner;
public class Arrays {

    // CONVERT THE SUMS METHOD FROM HW3 TO ADD EACH VALUE TO AN ARRAY AND THEN OUTPUT THE 
    // ARRAY AND THE TOTAL.
    // SEE HW3 FOR SUMS METHOD
    // If you want to use an ArrayList for the inputs to be dynamic that is okay
    // Otherwise if you are using a regular array, assume the size is 10 total. 
    // EXAMPLE 
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 0
    // Total: 22
    // Array: {12,2,3,4,1,0}
    public static void Arraysums(){
        Scanner scan = new Scanner(System.in);
        int[] ary = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.println("Insert Number: ");
            ary[i] = scan.nextInt();
        }
        for (int i = 1; i < 10; i++){
        ary[i]= ary[i] + ary[i-1];
        }
        for(int i = 0; i < 10; i++)
        System.out.println(ary[i]);
        scan.close();
        }


    // Create a method that will brute force a password EX.
    // bruteForce("ZZZZ")
    // The program should then guess each char of the string and compare it to see if it is equal
    // to the index of the alphabet char array below
    // Output Example:
    // Z
    // ZZ
    // ZZZ
    // ZZZZ

    // Hint 1: using a char array for the password is helpful here 
    // Hint 2: using the method .toCharArray is a way to convert the password parameter to
    // a char array as well
    // From there creating for and while loops to compare the values is trivial

    public static String bruteForce(String password){
        String answer = "";
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        '!', '@', '#', '$', '%', '^', '&', '*', '(', ')','<','>','/','?'};
        int n = password.length();
        int m = 66;
        int index = 0;
        for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){
        if (password.charAt(index) == alphabet[j]){
        index ++;
        break;
        }
        }
        }
        return answer; 
    }

    // Create a method that will sort an Array of integers from smallest to greatest.
    // NOTE: You CANNOT use the built in Arrays.sort method
    // Ex. 
    // sorter([9,10,2,5,3,4,7,8]) -> [2,3,4,5,7,8,9,10]

    // Hint 1: a temp Array is a helpful way to store variables for comparing 
    // Hint 2: 2 nested For loops should be all thats needed for the swapping logic
    public static int[] sorter(int[] nums){
        int [] sortedArray = new int[nums.length];
        int n = nums.length;
        for (int i = 0; i < n - 1; i++){
        for (int j = 0; j < n - i - 1; j++){
        if (nums[j] > nums[j + 1]){
        int temp = nums[j];
        nums[j] = nums[j + 1];
        nums[j + 1] = temp;
        }
        }
        }
        sortedArray = nums;
        return sortedArray;
    }




    public static void main(String[] args) {
        // Tester main method for your methods
        System.out.println("Hello World!");
        Scanner scan2 = new Scanner(System.in);
        int n = scan2.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums [i] = scan2.nextInt();
        int[] sortedArray = sorter(nums);
        for (int i = 0; i < n; i++) System.out.println(sortedArray[i]);
        scan2.close();
        }
    }