package package1;

import java.util.Scanner;

public class Calculator {
	
	static double add(double a,double b) {
		return a+b;
	}
	static double sub(double a,double b) {
		return a-b;
	}
	static double mul(double a,double b) {
		return a*b;
	}
	static double div(double a,double b) {
		if(b==0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return a/b;
	}
	static double mod(double a,double b) {
		return a%b;
	}
	static double pow(double a,double b) {
		return Math.pow(a, b);
		
	}
	static double sqrt(double a){
	    if(a < 0){
	        throw new ArithmeticException("Negative number has no real square root");
	    }
	    return Math.sqrt(a);
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n--- Calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square root");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");

            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid choice! Enter number only.");
                sc.nextLine();
                continue;
            }
            if(choice == 7){
                try{
                    System.out.print("Enter a number: ");
                    double a = sc.nextDouble();

                    double result = sqrt(a);
                    System.out.println("Result: " + result);

                }catch(Exception e){
                    System.out.println("Invalid number input!");
                    sc.nextLine();
                }
            }
            

            else if (choice >= 1 && choice <= 6) {
                try {
                    System.out.print("Enter first number: ");
                    double a = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    double b = sc.nextDouble();

                    double result = 0;
                   switch(choice) {
                   case 1:
                	   result = add(a,b);
                	   break;
                   case 2:
                	   result =  sub(a,b);
                	   break;
                   case 3:
                	   result = mul(a,b);
                	   break;
                   case 4:
                	   result = div(a,b);
                	   break;
                   case 5:
                	   result = mod(a,b);
                	   break;
                   case 6:
                	   result = pow(a,b);
                	   break;
                
                   }
                    System.out.println("Result: " + result);

                } catch (Exception e) {
                    System.out.println("Invalid number input!");
                    sc.nextLine(); // clear buffer
                }
            }

        } while (choice != 8);

        System.out.println("Calculator closed");
        sc.close();
    }
}
