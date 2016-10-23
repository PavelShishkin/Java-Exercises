import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
/**
 * Created by Pavel on 10.08.16.
 */
public class SumNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        char[] number = sc.nextLine().toCharArray();
        int sum = 0;
 
        for(char n: number)
        {
            sum = sum + Character.getNumericValue(n);
        }
 
        System.out.print(sum);
 
    }
}