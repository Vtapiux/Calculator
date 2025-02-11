import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean exit = true;
        int choice ;
        int x, y;

        System.out.println("Welcome");
        System.out.println("Insert your 'x' value: ");
        x = scan.nextInt();
        System.out.println("Insert your 'y' value: ");
        y = scan.nextInt();

        while (exit == true){
            System.out.println("Welcome to the calculator, this are our operation menu");
            System.out.println("1. Addition: x + y");
            System.out.println("2. Subtraction: x - y");
            System.out.println("3. Multiplication: x * y");
            System.out.println("4. Division: x / y");
            System.out.println("5. Change my values");
            System.out.println("0. Exit");
            System.out.println("Press the number of your selection: ");
            choice = scan.nextInt();

            switch(choice){
                case 1: 
                    System.out.println("ADDITION x + y");
                    int add = x + y;
                    System.out.println(x + " + "+ y +" = " + add);
                    break;

                case 2: 
                    System.out.println("SUBTRACTION x - y");;
                    int sub = x - y;
                    System.out.println(x + " - "+ y +" = " + sub);
                    break;
                
                case 3: 
                    System.out.println("MULTIPLICATION x * y");
                    int mul = x * y;
                    System.out.println(x + " * "+ y +" = " + mul);
                    break;

                case 4: 
                    System.out.println("DIVISION x / y");
                    int div = x / y;
                    System.out.println(x + " / "+ y +" = " + div);
                    break;

                case 5:
                    System.out.println("CHANGING VALUES");
                    System.out.println("Insert your new 'x' value: ");
                    x = scan.nextInt();
                    System.out.println("Insert your new 'y' value: ");
                    y = scan.nextInt();
                    break;

                case 0: 
                    System.out.println("GOODBYE!");
                    exit=false;
                    break;

                default:
                    System.out.println("Invalid input, select a valid option");
                    break;
            }
        }  
    }
}