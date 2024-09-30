import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempC = 0.00;
        double tempF = 0.00;
        boolean done = false;

        do {
            System.out.print("Enter your C temperature value or Exit to quit: ");

            if (in.hasNextDouble()) {
                tempC = in.nextDouble();
                tempF = 9 / 5.0 * tempC + 32;
                System.out.println("Your temperature in F is: " + tempF);

                if (tempF <= 32) {
                    System.out.println("The temp F is freezing point: " + tempF);

                }
                if (tempF >= 212) {
                    System.out.println("The temp F is at the boiling point: " + tempF);
                }
            }else
            {
                String input = in.next();
                if (input.equalsIgnoreCase("exit")) {
                    done = true;
                } else {
                    System.out.println("You gave bad input: " + input);
                }
            }
            in.nextLine();
        } while (!done);
    }
}
