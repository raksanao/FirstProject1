package day27;

public class Array {
    public static void main(String[] args) {
        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testersTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalysitsTeam = {"Lisa", "Ershad", "Naila"};
        String[][] scrumTeam = {developersTeam, testersTeam, businessAnalysitsTeam};
        int maxLength = scrumTeam[0][0].length();
        for (String[] eachArray : scrumTeam) {
            for (String eachElemnt : eachArray) {
                if (maxLength < eachElemnt.length()) {
                    maxLength = eachElemnt.length();

                }
            }
        }
        System.out.println(maxLength);

    }
}
