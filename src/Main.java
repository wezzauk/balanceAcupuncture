import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MERIDIANS");
        SickMeridians.printSickMeridians();

        System.out.print("Please select the sick meridian: ");
        int sickMeridian = scanner.nextInt();

        switch(sickMeridian){
            case 1: BladderMeridian.bladderSystems(); break;
            case 2: StomachMeridian.stomachSystems(); break;
            case 3: GallBladderMeridian.gallBladderSystems(); break;
            case 4: LiverMeridian.liverSystems(); break;
            case 5: KidneyMeridian.kidneySystems(); break;
            case 6: LargeIntestine.largeIntestineSystems(); break;
            case 7: SmallIntestineMeridian.smallIntestineSystems(); break;
            case 8: LungMeridian.lungSystems(); break;
            case 9: HeartMeridian.heartSystems(); break;
            case 10: TripleBurnerMeridian.TripleBurnerSystems(); break;
            case 11: PericardiumMeridian.pericardiumSystems(); break;

        }

        /**
         * Pseudo code
         * user enters sick meridian(s)
         * meridian method called to print out corresponding Rx meridian
         * Do this for each sick meridian
         * Possibility to add option to pick from specific Balance system
         * or to print out Rx meridian for each Balance system in a chart type format
         */
    }
}
