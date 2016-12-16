import java.util.Scanner;

/**
 * Created by Pavel on 16.12.16.
 */

public class GuessingNumber
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("ОТ:");
        int from = in.nextInt();
        System.out.println("ДО:");
        int to   = in.nextInt();
        
        int min = from;
        int max = to;
        int avg = max / 2;

        char answer;
        
        //Если неправильно указали диапазон (от и до)
        if(max < min) {
            min = to;
            max = from;
            avg = max / 2;
        }
        
        while (true) {

            if(max == min) {

                System.out.println("Ответ: " + max);
                break;

            } else if(max - min == 1) {
                System.out.println("Ваше число < " + max);
                answer = in.next().charAt(0);

                if (answer == 'y') {
                    if(avg < 0) {
                        avg--;
                        System.out.println("Ответ: " + avg);
                    } else {
                        System.out.println("Ответ: " + avg);
                    }
                } else {
                    System.out.println("Ответ: " + max);
                }

                break;
            }

            System.out.println("Ваше число >= " + avg + " ? (y/n)");
            answer = in.next().charAt(0);

            if(answer == 'y') {
                min = avg;
                avg = (max + min) / 2;
            } else {
                max = avg;
                avg = (max + min) / 2;
            }
        }
    }
}
