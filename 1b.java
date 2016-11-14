import java.lang.Math;
import java.util.Scanner;
/**
 * Task href: http://informatics.mccme.ru/mod/statements/view3.php?chapterid=259#1
 **/
class Chips
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int chips = in.nextInt();
 
        if(chips % 4 == 0 || chips == 1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
