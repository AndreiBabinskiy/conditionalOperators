import java.util.Scanner;

class Task22 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Enter Figure:");
        String strInput = scanner.nextLine();        
        
        switch (strInput) {
            case "rectangle": {
                System.out.println("Enter the first variable");   
                double a = scanner.nextDouble();
                
                System.out.println("Enter the second variable");   
                double b = scanner.nextDouble();
                
                double S = a * b;
                
                System.out.println("Square figure " + S + " sm2");   
                break;
            }
            case "trapeze": {
                System.out.println("Enter the first variable");   
                double a = scanner.nextDouble();
                
                System.out.println("Enter the second variable");   
                double b = scanner.nextDouble();
                
                System.out.println("Enter the three variable");   
                double h = scanner.nextDouble();
                
                double S = 1.0 / 2.0 * (a + b) * h;
                
                System.out.println("Square figure " + S + " sm2");
                break;
            }
            case "polygon": {
                System.out.println("Enter side of a regular polygon");   
                double a = scanner.nextDouble();
                
                System.out.println("Enter the radius of the inscribed circle of a regular polygon");   
                double r = scanner.nextDouble();
                
                System.out.println("Enter number of sides of a regular polygon");   
                double n = scanner.nextDouble();  
                
                double S = 1.0 / 2.0 * r * n * a;
                
                System.out.println("Square figure " + S + " sm2");
                break;
            }
            case "circle": {
                System.out.println("Enter the radius circle");   
                double r = scanner.nextDouble();
                
                double S = Math.PI * Math.pow(r, 2);
                
                System.out.println("Square figure " + S + " sm2");
                break;
            }
            default: 
                System.out.println("unknown figure: " + strInput);   
        }
        
    }
}