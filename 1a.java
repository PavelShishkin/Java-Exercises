import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Pavel on 10.08.16.
 */

public class Array {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[] array_number = {a,b,c,d};
        int count = 0;

        for(int number : array_number)
        {
            if(number > 0)
            {
                count++;
            }
        }

        if(count == 2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

    }

}
