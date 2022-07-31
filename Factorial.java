/*import java.util.Scanner;
public class Factorial {
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
*/
import java.util.Scanner;
public class Factorial{
    static int fact(int a)
    {
        if (a==0)
        {
            return 1;
        }
        else
        {
           return a*fact(a-1); 
        }
    }
    public static void main(String args[])
    {
        int n=5;
        int fa=fact(n);
        System.out.println(fa);
    }
}
