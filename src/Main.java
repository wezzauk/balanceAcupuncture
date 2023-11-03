import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int chooseAgain = 1;
        do {
            printOptions();

            // TO DO - put check if entry is 1 or 2, else keep asking to enter valid option
            System.out.println("\nWould you like to choose again? 1 - Yes, 2 - No");
            chooseAgain = scanner.nextInt();
            if (chooseAgain != 1) {
                break;
            }
        } while (chooseAgain == 1);

        System.out.println("Thank you for using the Balance Acupuncture App");
    }


    //METHODS
    public static void printOptions(){
        System.out.println("MERIDIANS");
        SickMeridians.printSickMeridians();

        System.out.print("\nPlease select the sick meridian: ");
        int sickMeridian = scanner.nextInt();
        SickMeridians.pickSickMeridianOptions(sickMeridian);
    }
}
