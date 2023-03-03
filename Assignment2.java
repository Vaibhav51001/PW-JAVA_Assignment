import java.util.Scanner;

/**
* Assignment2 : Taking Input
*/
public class Assignment2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q1 - Input name, roll number and field of interest from user and print in the format below,
        // Name: xyz, Roll number: xyz, Field of interest: xyz.

        System.out.println("Enter Full-Name, Roll number and Field of interest. ");
        String f_name, l_name, f_intrest;
        long r_no;
        f_name = sc.next();
        l_name = sc.next();
        r_no = sc.nextLong();
        f_intrest = sc.nextLine();
        System.out.println("Name : "+f_name+" "+l_name);
        System.out.println("Roll Number = "+ r_no);
        System.out.println("Field Of Intrest : "+ f_intrest); 
        
        // Q2 - Input two different string and print them in same line.

        System.out.println("Input two different string ?");
        String s1, s2;
        s1 = sc.next();
        s2 = sc.next();
        System.out.println(s1+s2);

        // Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of
        // 100), write a program to calculate his total marks and percentage marks.

        System.out.println("Enter the Marks of 3 Subjects.");
        float m1, m2, m3, totalMarks, percentage;
        m1 = sc.nextFloat();
        m2 = sc.nextFloat();
        m3 = sc.nextFloat();

        totalMarks = m1+m2+m3;
        percentage = (totalMarks/300)*100;

        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Percentage: "+percentage);

        // Q4 - Given two numbers, return their sum in the following format:

        System.out.println("Enter the number of test Case ?");
        int t = sc.nextInt();
        while(t>0){
            System.out.println("Enter two numbers to Sum ?");
            int x, y, sum;
            x = sc.nextInt();
            y = sc.nextInt();
            sum = x+y;
            System.out.println(sum);
            t--;
        }

        // Q5 - Given few lines of input(number of lines unknown) where each line has two
        // strings, concatenate the strings.
        while(sc.hasNextLine()){
            String a = sc.next();
            String b = sc.next();
            System.out.println(a+b);
        }
        

        sc.close();
    }
}
