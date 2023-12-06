import java.util.Scanner;
public class Palindrome{
    public static void main(String []args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the String:");
        String string=scanner.nextLine();
        int i=0,j=string.length()-1;
        while(i<j){
            if(string.charAt(i)!=string.charAt(j))
            {System.out.print("it is not palindrome");
            System.exit(0);                                                                                          
        }i++;
        j--;
        }
            System.out.print("it is palindrome");
        
    }
}