public class GallBladderMeridian {
    private static final String sickMeridian = "Gallbladder";
    private static final String s1 = "Triple Burner";
    private static final String s2 = "Heart";
    private static final String s3 = "Liver";
    private static final String s4 = "Heart";
    private static final String s5 = "Triple Burner";

    //GETTERS
    public String getSickMeridian() { return sickMeridian; };

    public String getS1(){
        return s1;
    }

    public String getS2() {
        return s2;
    }

    public String getS3(){
        return s3;
    }

    public String getS4(){
        return s4;
    }

    public String getS5(){
        return s5;
    }


    //METHODS
    public static void gallBladderSystems() {
        Systems.printTreatingSystems(sickMeridian, s1, s2, s3, s4, s5);
    }
}
