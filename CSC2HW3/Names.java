package CSC2HW3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) throws FileNotFoundException
    {
    Scanner scan = new Scanner(System.in);

    System.out.println("Input file: ");
    String InputFilename = scan.next();

    System.out.println(" Boy Output file: ");
    String outputFileNameBoy = scan.next();

    System.out.print("Girl Output file: ");
    String outputFileNameGirl = scan.next();
    
    File input = new File("/Users/arbidchowdhury/Desktop/Git/CSCIHW-2101-F2022/CSC2HW3/babys.txt");
    Scanner in = new Scanner(input);
    PrintWriter outBoy = new PrintWriter(outputFileNameBoy);
    PrintWriter outGirl = new PrintWriter(outputFileNameGirl);
    double total = 0;
    double totalb = 0;
    double totalc = 0;
    double totalf = 0;
    
    while (in.hasNext())
    {
        String a = in.next();
        String b = in.next();
        String c = in.next();
        String d = in.next();
        String e = in.next();
        String f = in.next();
        String g = in.next();

        double c1 = Double.parseDouble(c);
        double f2 = Double.parseDouble(f);

        totalc += c1;
        totalf += f2;

        /*totalb = totalb + c;
        total = total + c;
        if (total > 1000000)
        {
        System.out.println(b);
        total = total + f;
    }
    if (total > 1000000)
    {
    System.out.println(e);
    }
    }*/
        outBoy.printf("%s\n", totalc);
        outGirl.printf("%s\n", totalf);


    in.close();
    outBoy.close();
    outGirl.close();
    }

}
}
