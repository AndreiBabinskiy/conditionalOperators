import java.util.Scanner;

class Task21 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
               
        System.out.println("Number a:");
        String strDouble = scanner.nextLine(); 
        
        double a = Double.parseDouble(strDouble);
        System.out.println(a);
        
        System.out.println("Number b:");
        String str = scanner.nextLine(); 
        
        double b = Double.parseDouble(str);
        System.out.println(b);
        
        System.out.println("Number c:");
        String strD = scanner.nextLine(); 
        
        double c = Double.parseDouble(strD);
        System.out.println(c);
        
        double smallest = Math.min(a, Math.min(b, c));
        
        if (a <= b && a <= c) {
            System.out.println("smallest = a");
        } else if (b <= c && b <= a) {
            System.out.println("smallest = b");
        } else {
            System.out.println("smallest = c");
        }
        
        double largest = Math.max(a, Math.max(b, c));
        
        if (a >= b && a >= c) {
            System.out.println("largest = a");
        } else if (b >= c && b >= a) {
            System.out.println("largest = b");
        } else {
            System.out.println("largest = c");
        }
    }
}
