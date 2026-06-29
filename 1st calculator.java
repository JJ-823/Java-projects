import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {




        System.out.println("""
            ____________________________________________________________________
            |welcome to my calculator. pls select the function you want to use
            |by typing in and entering its correspondign number.
            ----------------------
            | 1 = adding         |
            | 2 = subtraction    |
            | 3 = multiplication |
            | 4 = division       |
            ----------------------       
        
        """);
        
        Scanner userINP = new Scanner(System.in);
        System.out.print("input your number here then enter: ");
        int INput = userINP.nextInt();
        
        Scanner firstNUM = new Scanner(System.in);
        System.out.print("\nenter your first number the press enter: ");
        int x = firstNUM.nextInt();

        Scanner secondNUM = new Scanner(System.in);
        System.out.print("\nenter your second number the press enter: ");
        int y = secondNUM.nextInt();


        if (INput == 1) {
            System.out.println(x + y);

        } else if (INput == 2) {
            System.out.println(x - y);
        
        } else if (INput == 3) {
            System.out.println(x * y);

        } else if (INput == 4){
            if (y == 0 ){
                System.out.println(0);        
            } else {
                System.out.println(x / y);
            }
            
        }

        userINP.close();
        firstNUM.close();
        secondNUM.close();
    }
}










