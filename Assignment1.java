import java.util.Scanner;

/**
* Assignment1 : Java Variables and Data Types
*/
 
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Q1 - Take 2 integer values in two variables x and y and print their product.
        System.out.println("Enter Any Two Number To print their product?");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int product=x*y;
        System.out.println("Product of Two Number is : "+product);

        // Q2 - Print the ASCII value of character U.
        int a='U';
        System.out.println("The ASCII value of U is : " + a);

        // Q3 - Write a Java program to take the length and breadth of a rectangle and print its area.
        System.out.println("Enter the length and Breadth to calculate and print the area of rectangle ?");
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int area=length*breadth;
        System.out.println("Area of Rectangle of length "+ length + " breadth "+ breadth + " is : "+area);

        // Q4 - Write a Java program to calculate the cube of a number.
        System.out.println("Enter a Number to calculate and print its cube ?");
        int c=sc.nextInt();
        int cube=c*c*c;
        System.out.println("Cube of "+c+" is : "+cube);
        
        // Q5 - Write a Java program to swap two numbers with the help of a third variable.
        System.out.println("Enter Any Two Number To Swap ?");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int temp = n1;
        n1=n2;
        n2=temp;
        System.out.println("On Swapping of Two Number:-"+ " First One Is : "+n1+" Second One Is : "+ n2);

    }
    
}