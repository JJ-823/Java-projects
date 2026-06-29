import java.util.Scanner;

public class Calc {
    
    public static void main(String[] args) {
        System.out.println("""
            
            ___________________________________________________________________
            |welcome to my calculator. pls select the function you want to use
            |by typing in and entering its correspondign number.
            ----------------------
            | 1 = adding         |
            | 2 = subtraction    |
            | 3 = multiplication |
            | 4 = division       |
            ----------------------       

        """);
        
        Scanner INput = new Scanner(System.in);

        System.out.print("\n--input yourfirst number then press enter: ");

        int number = INput.nextInt();

        System.out.println("----" + number);

        INput.close();



    
    }
}
