import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int chooseAgain = 1;
        do {
            printOptions();

             while(true){
                System.out.print("\nWould you like to choose again? 1 - Yes, 2 - No : ");

                try {
                    chooseAgain = scanner.nextInt();
                    if (chooseAgain == 1 || chooseAgain == 2) {
                        break;
                    }
                }
                catch(InputMismatchException e) {
                    System.out.print("Invalid option\n");
                    scanner.nextLine();
                }
            }

        } while (chooseAgain == 1);

        System.out.println("Thank you for using the Balance Acupuncture App");
        scanner.close();
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
