import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char requestMore = 'y';

        do {
            Years.calculateYears();
            Scanner scn = new Scanner(System.in);
            System.out.println("Would you like more calculations? If yes press 'y' otherwise any key");
            requestMore = scn.next().charAt(0);
        } while (requestMore == 'y' || requestMore == 'Y');
    }
}
