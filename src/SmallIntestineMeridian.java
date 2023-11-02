public class SmallIntestineMeridian {
    private static final String sickMeridian = "Small Intestine";
    private static final String s1 = "Bladder";
    private static final String s2 = "Spleen";
    private static final String s3 = "Heart";
    private static final String s4 = "Liver";
    private static final String s5 = "Bladder";

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
    public static void smallIntestineSystems() {
        Systems.printTreatingSystems(sickMeridian, s1, s2, s3, s4, s5);
    }
}
