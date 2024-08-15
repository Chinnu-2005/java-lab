import java.util.Scanner;

public class Recursion {
    
    public static void main(String[] args)
    {
            Scanner s = new Scanner(System.in); 
            int n;
            n=s.nextInt();
            int answer=Sum(n);
            System.out.println("Sum of " + n + " numbers is " + answer);
        
    }

    public static int Sum(int n)
    {
        if(n<=0)
            return 0;
        if(n==1)
            return 1;
        else
            return n+Sum(n-1);
    }




}










