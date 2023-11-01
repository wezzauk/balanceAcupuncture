public class SickMeridians {
    private static String bladder = "Bladder";
    private static String stomach = "Stomach";
    private static String gallBladder = "Gallbladder";
    private static String liver = "Liver";
    private static String kidney = "Kidney";
    private static String largeIntestine = "Large Intestine";
    private static String smallIntestine = "Small Intestine";
    private static String lung = "Lung";
    private static String heart = "Heart";
    private static String tripleBurner = "Triple Burner";

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
}