package Week3.Tasks;

import java.util.Scanner;

public class FindSeasonWithSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();

        String season;
        switch (month) {
            case 1:
            case 2:
            case 3:
                season = "Winter";
                break;
            case 4:
            case 5:
            case 6:
                season = "Spring";
                break;
            case 7:
            case 8:
            case 9:
                season = "Summer";
                break;
            case 10:
            case 11:
            case 12:
                season = "Fall";
                break;
            default:
                season = "Invalid month";
                break;
        }

        System.out.println("The season for month " + month + " is " + season);
        scanner.close();
    }
}
