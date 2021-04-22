import java.util.Scanner;
class Fibonacci 
{
    public static void main(String[] args) 
    {
        int n, a = 0, b = 0, c = 1;
        int numAGenerar = Integer.parseInt(args[0]);
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= numAGenerar; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }
}