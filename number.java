//Write a Java program to check whether a number is positive, negative,
//or zero using if-else.
import java.util.Scanner;
public class number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a >=0){
            System.out.println("a is positive and a is zero when a = 0");
        }else
        {
            System.out.println("a is negative ");
        }

    }
}