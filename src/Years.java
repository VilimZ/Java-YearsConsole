import java.util.Scanner;

public class Years {




    public static   void calculateYears() {
        int yearOfBirth;
        int yearInCalendar;


        System.out.println("Please input the year of your birth.");
        Scanner scan = new Scanner(System.in);
        yearOfBirth = scan.nextInt();

        System.out.println("Please, input the requested year.");
        yearInCalendar = scan.nextInt();

        System.out.println("in: " + yearInCalendar + " you were: " + (yearInCalendar - yearOfBirth) + " years old.");
    }
}
