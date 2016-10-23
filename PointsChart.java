import java.util.Arrays;

public class PointsChart
{
    public static double avg(double a, double b)
    {
        double c = (a + b) / 2;
        return c;
    }

    public static void main(String[] args)
    {
        double[] number  = {1,2,4,3};
        double[] number2 = new double[number.length];
        int minusIndex;
        int plusIndex;

        for (int i = 0; i < number.length; i++)
        {
            minusIndex = i - 1;
            plusIndex  = i + 1;

            if(i == 0)
            {
                number2[i] = number[i];
                number2[number.length - 1] = number[number.length - 1];
            }
            else if(plusIndex < number.length)
            {
                number2[i] = avg(number[minusIndex], number[plusIndex]);
            }
        }

        System.out.print(Arrays.toString(number2));
    }

}
