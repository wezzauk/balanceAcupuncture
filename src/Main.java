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
        int sickMeridian;

        while(true) {
            try {
                System.out.print("\nPlease select the sick meridian: ");
                sickMeridian = scanner.nextInt();
                if(sickMeridian >= 1 && sickMeridian <= 11){
                    break;
                }
                System.out.println("Please enter an option between 1 - 11");
            }
            catch(InputMismatchException e){
                System.out.println("Invalid entry");
                scanner.nextLine();
            }
        }
        SickMeridians.pickSickMeridianOptions(sickMeridian);
    }
}
