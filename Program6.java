import java.util.Scanner;

class program6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter a radius please: ");
        double radius=myScanner.nextDouble();
        final double pi=3.14159;
        
        double d=2*radius;    
        d=((int)(d*1000));
        d=(d/1000);
        double c=2*pi*radius;
        c=((int)(c*1000));
        c=(c/1000);
        double a=pi*radius*radius;
        a=((int)(a*1000));
        a=(a/1000);

        System.out.println("The Radius of the circle is: " +radius);
        System.out.println("The Diameter of the circle is: " +d);
        System.out.println("The Area of the circle is: " +a);
        System.out.println("The Circumference of the circle is: " +c);
        }
  }
