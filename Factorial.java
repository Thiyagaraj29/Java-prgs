import java.util.Scanner;
public class Factorial{
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        System.out.print("enter the number:");
        int number =in.nextInt();
        int i,fact=1;
        for(i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.print("Factorial of"+" "+number+" "+"is"+" "+fact);
        
    }
}