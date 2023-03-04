import java.util.Scanner;

/**
 * Assignment4 : Conditionals
 */
public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1 - Write a program which takes the values of length and breadth from user and check if it is a square or not.
        System.out.println("Enter the Values of L & B");
        int l, b;
        l = sc.nextInt();
        b = sc.nextInt();
        if ( l==b ){
            System.out.println("Its Square");
        }   else{
            System.out.println("Its Rectangle");
        }

        // Q2 - Write a program to print absolute value of a number entered by the user.
        System.out.println("Enter a number.");
        int num = sc.nextInt();
        if(num<0){
            num *= -1;
        }
        System.out.println("Absolute value is :"+num);
        
        //Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and calculate Profit or Loss.
        System.out.println("Enter Cost Price And Selling Price");
        float cp, sp;
        cp = sc.nextFloat();
        sp = sc.nextFloat();
        if(sp>cp){
            Float Profit = sp-cp;
            System.out.println("Profit = "+ Profit);
        }
        else if (sp==cp){
            System.out.println("No loss and Profit.");
        } else{
            float Loss = cp-sp;
            System.out.println("Loss = "+ Loss);
        }

        // Q4 - - Write a program to print positive number entered by the user, if user enters a negative number, it is skipped.
        System.out.println("Enter an Integer.");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("The number is negative and skipped");
        }else
        System.out.println("Entered Positive Integer is = "+n);

        //Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication and division.
        System.out.println("Enter an operator (+, -, *, /):");
        String op;
        int n1, n2, cal;
        op = sc.next();
        System.out.println("Enter two Numbers :");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        switch(op){
            case "+" : 
                cal = n1+n2 ;
                System.out.println("Add = "+ cal);
                break;
            case "-" :
                cal = n1-n2;
                System.out.println("Sub = "+ cal);
                break;
            case "*" :
                cal = n1*n2 ;
                System.out.println("Product = "+ cal);
                break;
            case "/" :
                cal = n1/n2 ;
                System.out.println("Division = "+ cal);
                break;
            default : 
                System.out.println("Wrong Operation Choosed.");
                break;
        }

        // Q6 - Write a program to calculate marks to grades .
        int marks, q;
        System.out.println("Enter Marks :");
        marks = sc.nextInt();
        if(marks>=90){
            q = 1;
        }else if(marks<90 && marks>=80){
            q = 2;
        }else if(marks<80 && marks>=70){
            q = 3;
        }else if(marks<70 && marks>=60){
            q = 4;
        }else if(marks<60 && marks>=50){
            q = 5;
        }else if(marks<50 && marks>=40){
            q = 6;
        }else if(marks<40 && marks>=30){
            q = 7;
        }else if(marks<30){
            q = 8;
        }else{
            q = 10;
        }
        switch(q){
            case 1 : 
                System.out.println("Grade : A+");
                break;
            case 2 :
                System.out.println("Grade : A");
                break;
            case 3 :
                System.out.println("Grade : B+");
                break;
            case 4 :
                System.out.println("Grade : B");
                break;
            case 5 :
                System.out.println("Grade : C");
                break;
            case 6 :
                System.out.println("Grade : D");
                break;
            case 7 :
                System.out.println("Grade : E");
                break;
            case 8 :
                System.out.println("Grade : F");
                break;
            default : 
                System.out.println("Grade : F");
                break;
        }
        
        sc.close();
    }
}
