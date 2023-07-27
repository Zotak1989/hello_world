import java.util.*;

public class PassportFormCreator {
    public void createForms() {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        int ageYears = scanner.nextInt();
        scanner.close();

        int ageMonth = ageYears*10;

        System.out.println(firstName + " " + secondName + " " + ageMonth);
        System.out.println(firstName.toUpperCase());
        System.out.println(secondName.toUpperCase());
        System.out.print(ageMonth);
    }
    public static void main (String agrs[]) {
        PassportFormCreator test = new PassportFormCreator();
        test.createForms();
    }
}