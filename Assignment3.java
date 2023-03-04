import java.util.Scanner;

/**
 * Assignment3 : Java operators and their precedence and associativity
 */
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.

        System.out.println("Enter a number ?");
        int num;
        num = sc.nextInt();
        System.out.println((((num+8)/3)%5)*5);

        // Q2 - Swap two numbers without the use of third variable.

        System.out.println("Enter Any Two Number To Swap ?");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("On Swapping of Two Number:-"+ " First One Is : "+n1+" Second One Is : "+ n2);

        //Q3 - Write a program to calculate the sum of the digits of a 3-digit number.
        System.out.println("Enter the number to calculate sum of digits. ");
        int a = sc.nextInt();
        int sum = 0;
        while(a!=0){
            sum += a%10;
            a /= 10;
        }
        System.out.println("Sum = "+ sum);

        // Q4 - Assign values of variables 'x' and 'y' as 55 and 70 respectively and then check if:
        //      1.both the conditions 'x < 50' and 'x < y' are true.
        //      2.at least one of the conditions 'x < 50' or 'x < y' is true.

        int x=55, y=70;
        System.out.println(x<50 && x<y);
        System.out.println(x<50 || x<y);

        //Q5 - Find the total number of bits needed to be flipped to convert x to y.

        System.out.println("Enter any two Number .");
        int m, n, count = 0;
        m = sc.nextInt();
        n = sc.nextInt();
        int o = m^n;
        while (o != 0) {
            count++;
            o &= (o - 1);
        }
        System.out.println("The total number of bits needed to be flipped = "+count);

        sc.close();
    }
    
}