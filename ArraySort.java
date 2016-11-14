import java.util.Arrays;
/**
 * Created by Pavel on 10.11.16.
 * Task href: https://stepik.org/lesson/Управляющие-конструкции-условные-операторы-и-циклы-12762/step/9?course=Java-Базовый-курс&unit=3110
 */
public class ArraySort
{
    public static void main(String[] args)
    {
        int array1[] = {1, 2, 3, 3, 3, 3, 3, 3, 3, 4, 5, 6, 78};
        int array2[] = {0, 3, 3, 3, 9, 100};
        int sumArray[] = new int[array1.length + array2.length];
        int index  = 0;
        int indexJ = 0;
        int indexI = 0;

        while (sumArray.length != index)
        {
            if(indexI >= array1.length ) {

                for(int i = indexJ; i < array2.length; i++)
                {
                    sumArray[index] = array2[i];
                    index++;
                }
                break;

            } else if(indexJ >= array2.length ) {

                for(int i = indexI; i < array1.length; i++)
                {
                    sumArray[index] = array1[i];
                    index++;
                }
                break;
            }

            if(array1[indexI] < array2[indexJ]) {
                
                sumArray[index] = array1[indexI];
                indexI++;
                index++;
                
            } else {
                
                sumArray[index] = array2[indexJ];
                indexJ++;
                index++;
                
            }
        }
        
        System.out.println(Arrays.toString(sumArray));
    }
}