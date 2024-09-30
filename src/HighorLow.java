import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random Generator = new Random();
        int val = Generator.nextInt(10)+1;
        int userGuess = 0;
        boolean done = false;

        do{
            System.out.print("Guess the number [1-10] or QUIT to stop: ");

            if(in.hasNextInt())
            {
                userGuess = in.nextInt();
                System.out.println("Your guess is: " + userGuess);

                if(userGuess < 1 || userGuess > 10)
                {
                    System.out.println("Your guess is out of the range of the allowed value: " + userGuess);
                    continue;
                }

                else if(userGuess < val)
                {
                    System.out.println("Your guess was lower than the secret value: " + val);
                }

                else if(userGuess > val)
                {
                    System.out.println("Your guess was higher than the secret value: " + val);
                }

                else if(userGuess == val)
                {
                    System.out.println("Your guess: " + userGuess + " was right on the money! ");
                }

            }else
            {
                String input = in.next();
                if(input.equalsIgnoreCase("quit"))
                {
                    done = true;
                } else {
                    System.out.println("You gave bad input: " + input);
                }
            }
        }while (!done);
    }
}
