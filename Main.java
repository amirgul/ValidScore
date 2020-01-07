import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("pleasae enter a valid score");
        double score = keyboard.nextDouble();
        if((score < 101) && (score > 0))
        {
            System.out.println("score is valid");
        }
        else
        {
            System.out.println("Score is not valid \n please enter in range from 0-100");
        }


    }
}
