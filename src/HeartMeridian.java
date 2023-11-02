public class HeartMeridian {
    private static final String sickMeridian = "Heart";
    private static final String s1 = "Kidney";
    private static final String s2 = "Gallbladder";
    private static final String s3 = "Small Intestine";
    private static final String s4 = "Gallbladder";
    private static final String s5 = "Spleen";

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
    public static void heartSystems() {
        Systems.printTreatingSystems(sickMeridian, s1, s2, s3, s4, s5);
    }
}
