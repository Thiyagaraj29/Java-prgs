public class Reverse{
    public static void main(String[]args){
        int n=2003,reverse=0;
        while(n!=0){
            int remainder = n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }
        System.out.print("Reverse of the number is:"+reverse);
    }
}