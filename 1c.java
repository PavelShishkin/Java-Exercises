import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
/**
 * Created by Pavel on 10.08.16.
 * Task href: http://informatics.mccme.ru/mod/statements/view3.php?chapterid=262#1
 */
 
public class Array {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = 0;
        int f = 0;
 
        a = (a * 100) + b;
        c = (c * 100) + d;
        int ac = c - a;
 
        if(ac < 100)
        {
            e = 0;
            f = ac;
        }
        else
        {
            e = ac / 100;
            f = ac % 100;
        }
 
        System.out.println(e + " " + f);
 
 
    }
 
}
