import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Pavel on 28.10.16.
 */

public class Brackets
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        char[] arrayChar = line.toCharArray();
        Stack<Character> stackChar = new Stack();
        boolean error = false;

        for (char Char : arrayChar)
        {
            if (Char == '(' || Char == '[' || Char == '{' || Char == '<')
            {
                stackChar.push(Char);
            }
            else if (Char == ')' || Char == ']' || Char == '}' || Char == '>')
            {
                if(stackChar.empty()) 
                {
                    error = true;
                    break;
                } 
                else 
                {
                    if(Char == ')') {
                        if (stackChar.peek() == '(') {
                            stackChar.pop();
                        } else {
                            error = true;
                            break;
                        }
                    } else if(Char == ']') {
                        if (stackChar.peek() == '[') {
                            stackChar.pop();
                        } else {
                            error = true;
                            break;
                        }
                    } else if(Char == '}') {
                        if (stackChar.peek() == '{') {
                            stackChar.pop();
                        } else {
                            error = true;
                            break;
                        }
                    } else if(Char == '>') {
                        if (stackChar.peek() == '<') {
                            stackChar.pop();
                        } else {
                            error = true;
                            break;
                        }
                    }
                }
            }
        }

        if (error == false)
        {
            if(stackChar.empty())
            {
                System.out.print("Все норм!");
            }
            else
            {
                System.out.print("Ошибка!");
            }
        }
        else
        {
            System.out.print("Ошибка!");
        }
    }
}
