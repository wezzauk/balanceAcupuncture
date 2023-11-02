public class TripleBurnerMeridian {
    private static final String sickMeridian = "Triple Burner";
    private static final String s1 = "Gallbladder";
    private static final String s2 = "Kidney";
    private static final String s3 = "Pericardium";
    private static final String s4 = "Spleen";
    private static final String s5 = "Gallbladder";

    //GETTERS
    public String getSickMeridian() { return sickMeridian; };

    public String getS1(){ return s1; }

    public String getS2() { return s2; }

    public String getS3(){ return s3; }

    public String getS4(){ return s4; }

    public String getS5(){ return s5; }


    //METHODS
    public static void TripleBurnerSystems() {
        Systems.printTreatingSystems(sickMeridian, s1, s2, s3, s4, s5);

    }


}