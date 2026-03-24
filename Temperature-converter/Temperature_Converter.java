package package1;
import java.util.*;

public class Temperatureconverter {
	
	static double Fahrenheit(double C) {
		return (C * 9/5) + 32;
	}
	static double Celsius(double F) {
		return (F - 32) * 5/9;
	}
	static double CelsiustoKelvin(double C) {
		return C + 273.15;	
	}
	static double KelvintoCelsius(double Ke) {
		return Ke - 273.15;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
            System.out.println("\n--- Temperature Converter ---");
            System.out.println("1. Celsius -> Fahrenheit");
            System.out.println("2. Fahrenheit ->  Celsius");
            System.out.println("3. Celsius -> Kelvin");
            System.out.println("4. Kelvin->Celsius");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
         

            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid choice! Enter number only.");
                sc.nextLine();
                continue;
            }
                     

            if (choice >= 1 && choice <= 4) {
                try {
                    double result = 0;
                   switch(choice) {
                   case 1:
                	   System.out.println("enter the celsius:");
                	   double C = sc.nextDouble();
                	   result = Fahrenheit(C);
                	   break;
                   case 2:
                	   System.out.println("enter the Fahrenheit:");
                	   double F = sc.nextDouble();
                	   result = Celsius(F);
                	   break;
                   case 3:
                	   System.out.println("enter the celsius:");
                	   double Ce = sc.nextDouble();
                	   result = CelsiustoKelvin(Ce);
                	   break;
                   case 4:
                	   System.out.println("enter the kelvin:");
                	   double Ke = sc.nextDouble();
                	   result = KelvintoCelsius(Ke);
                	   break;
                   }
                    System.out.println("Result: " + result);

                } catch (Exception e) {
                    System.out.println("Invalid number input!");
                    sc.nextLine(); // clear buffer
                }
            }

        
			
		}
		while(choice!=5);
		sc.close();
	}

}
