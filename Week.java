//Create a program to find the day of the week based on a number input
//using a switch-case statement.
 import java.util.Scanner;
 public class Week{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7:");
        int day = input.nextInt();
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Invalid day");
            }
            }
            }


