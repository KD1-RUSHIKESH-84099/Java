import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        if (input.hasNextDouble()) {
            double n1 = input.nextDouble();
            if (input.hasNextDouble()) {
                double n2 = input.nextDouble();
                double avg = (n1 + n2) / 2;
                System.out.println(avg);
            } else {
                System.out.println("Not Type of Double");
            }
        } else {
            System.out.println("Not Type of Double");
        }

        input.close();
    }
}
