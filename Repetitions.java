/**
 * Created by Pavel on 28.10.16.
 */
public class Java
{
    public static void main(String[] args)
    {
        String s = "num lam mip tex bal bod bal tex end";
        String[] str = s.split(" ");
        String str2 = "";

        for (int i = 0; i < str.length; i++)
        {
            for (int j = i + 1; j < str.length; j++)
            {
                if(str[i].equals(str[j]))
                {
                    str2 = str[i] + " " + str2;
                }
            }
        }

        System.out.println(str2);
    }
}
