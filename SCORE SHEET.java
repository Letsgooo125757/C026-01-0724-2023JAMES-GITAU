public class Marksheet{
    public static void main(String[] args){
        String regNumber1 = "0160/2023";
        String fullName1 = "John Doe";
        int ccs2211_1 = 78; //Specific marks for CCS 2211
        int css2212_1 = 85; //Specific marks for CCS 2212
        int css2213_1 = 90; //Specific marks for CCS 2213
        int css2214_1 = 88; //Specific marks for CCS 2214

        String regNumber2 = "0724/2023";
        String fullName2 = "James Gitau";
        int ccs2211_2 = 92; //Specific marks for CCS 2211
        int css2212_2 = 87; //Specific marks for CCS 2212
        int css2213_2 = 84; //Specific marks for CCS 2213
        int css2214_2 = 91; //Specific marks for CCS 2214

        //print the scoresheet in tabular format
        System.out.println("Student Score Sheet");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("RegNo.\t\tFull Name\t\tCCS2211\t\tCCS2212\t\tCCS2213\t\tCCS2214");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println(regNumber1 + "\t\t" + fullName1 + "\t\t" + ccs2211_1 + "\t\t" + css2212_1 + "\t\t" + css2213_1 + "\t\t" + css2214_1);
        System.out.println(regNumber2 + "\t\t" + fullName2 + "\t\t" + ccs2211_2 + "\t\t" + css2212_2 + "\t\t" + css2213_2 + "\t\t" + css2214_2);
    }
}
