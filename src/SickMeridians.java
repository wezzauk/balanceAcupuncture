public class SickMeridians {
    private static final String bladder = "Bladder";
    private static final String stomach = "Stomach";
    private static final String gallBladder = "Gallbladder";
    private static final String liver = "Liver";
    private static final String kidney = "Kidney";
    private static final String largeIntestine = "Large Intestine";
    private static final String smallIntestine = "Small Intestine";
    private static final String lung = "Lung";
    private static final String heart = "Heart";
    private static final String pericardium = "Pericardium";
    private static final String tripleBurner = "Triple Burner";

    //GETTERS
    public String getBladder(){
        return bladder;
    }

    public static String getStomach() {
        return stomach;
    }

    public static String getGallBladder() {
        return gallBladder;
    }

    public static String getLiver() {
        return liver;
    }

    public static String getKidney() {
        return kidney;
    }

    public static String getLargeIntestine() {
        return largeIntestine;
    }

    public static String getSmallIntestine() {
        return smallIntestine;
    }

    public static String getLung() {
        return lung;
    }

    public static String getHeart() {
        return heart;
    }

    public static String getTripleBurner() {
        return tripleBurner;
    }

    // METHODS
    public static void printSickMeridians(){
        System.out.println(("1. " + bladder));
        System.out.println(("2. " + stomach));
        System.out.println(("3. " + gallBladder));
        System.out.println(("4. " + liver));
        System.out.println(("5. " + kidney));
        System.out.println(("6. " + largeIntestine));
        System.out.println(("7. " + smallIntestine));
        System.out.println(("8. " + lung));
        System.out.println(("9. " + heart));
        System.out.println(("10. " + tripleBurner));
    }

    public static void pickSickMeridianOptions(int sickMeridian){
        switch (sickMeridian) {
            case 1:
                BladderMeridian.bladderSystems();
                break;
            case 2:
                StomachMeridian.stomachSystems();
                break;
            case 3:
                GallBladderMeridian.gallBladderSystems();
                break;
            case 4:
                LiverMeridian.liverSystems();
                break;
            case 5:
                KidneyMeridian.kidneySystems();
                break;
            case 6:
                LargeIntestine.largeIntestineSystems();
                break;
            case 7:
                SmallIntestineMeridian.smallIntestineSystems();
                break;
            case 8:
                LungMeridian.lungSystems();
                break;
            case 9:
                HeartMeridian.heartSystems();
                break;
            case 10:
                TripleBurnerMeridian.TripleBurnerSystems();
                break;
            case 11:
                PericardiumMeridian.pericardiumSystems();
                break;
            default:
                System.out.println("Not a valid option");
                break;
        }
    }
}