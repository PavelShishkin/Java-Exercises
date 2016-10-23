/**
 * Created by Pavel on 22.10.16.
 */

public class Sapper {

    //Поле 4 x 4
    public static String[][] field = new String[4][4];
    //Координаты бомб по x,y
    public static int[] bomb = {0,0,0,1,3,3};

    //Процедура заполняет ячейки вокруг бомбы
    public static void filling(int x, int y)
    {
        int startIndex;
        int endIndex;

        if(y == 0)
        {
            startIndex = 0;
        }
        else
        {
            startIndex = y - 1;
        }

        if(y == 3)
        {
            endIndex = 3;
        }
        else
        {
            endIndex = y + 1;
        }

        for(int i =  startIndex; i <= endIndex ; i++)
        {
            //x - 1
            if(x != 0)
            {
                if (field[x - 1][i] == null)
                {
                    field[x - 1][i] = "1";
                }
                else if (field[x - 1][i] != "b")
                {
                    field[x - 1][i] = Integer.toString(Integer.parseInt(field[x - 1][i]) + 1);
                }
            }

            //x
            if (field[x][i] == null)
            {
                field[x][i] = "1";
            }
            else if (field[x][i] != "b")
            {
                field[x][i] = Integer.toString(Integer.parseInt(field[x][i]) + 1);
            }

            //x + 1
            if(x != 3)
            {
                if (field[x + 1][i] == null)
                {
                    field[x + 1][i] = "1";
                }
                else if (field[x + 1][i] != "b")
                {
                    field[x + 1][i] = Integer.toString(Integer.parseInt(field[x + 1][i]) + 1);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        //Координаты
        int x,y;

        //Устанавливаю бомбы на игровое поле
        for (int i = 0; i < bomb.length; i+=2)
        {
            x = bomb[i];
            y = bomb[i+1];

            field[x][y] = "b";
        }

        //Заполняю поле
        for(x = 0; x < 4; x++)
        {
            for(y = 0; y < 4; y++)
            {
                if(field[x][y] == "b")
                {
                    filling(x,y);
                }
                else if(field[x][y] == null)
                {
                    field[x][y] = "0";
                }
            }
        }

        //Вывод поля
        for(x = 0; x < 4; x++)
        {
            System.out.println(field[x][0] + " " + field[x][1] + " " + field[x][2] +  " " + field[x][3]);
        }
    }
}
