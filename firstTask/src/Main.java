import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NotBirthException, NotNameException {
        Scanner scanner = new Scanner(System.in);
        enterName(scanner);
    }

    public static void enterName(Scanner scanner) throws NotBirthException, NotNameException {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter your lastname: ");
        String lastName = scanner.nextLine().trim();
        if ((!name.isEmpty() && !lastName.isEmpty()) && (!checkNumberInNames(name) && !checkNumberInLastName(lastName)) && (name.length() > 1 && lastName.length() > 1)) {
            printNames(name, lastName);
            enterBirthDateAndJob(scanner);
        } else {
            System.out.println("You must enter correctly name, and lastname. Try to again!");
            throw new NotNameException("Error. look at names");
        }
    }

    public static boolean checkNumberInNames(String name) {
        boolean hasDigits = false;
        for (int i = 0; i < name.length() && !hasDigits; i++) {
            if (Character.isDigit(name.charAt(i))) {
                hasDigits = true;
            }
        }
        return hasDigits;
    }

    public static boolean checkNumberInLastName(String lastname) {
        boolean hasDigits = false;
        for (int i = 0; i < lastname.length() && !hasDigits; i++) {
            if (Character.isDigit(lastname.charAt(i))) {
                hasDigits = true;
            }
        }
        return hasDigits;
    }

    public static void enterBirthDateAndJob(Scanner scanner) throws NotBirthException {
        System.out.print("Enter your Year of birth: ");
        int birth = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter year of start of work: ");
        int start = Integer.parseInt(scanner.nextLine());
        LocalDate localDate = LocalDate.now();
        int getYear = localDate.getYear();
        int getBirthDate = getYear - birth;
        int getExperience = getYear - start;
        int get18 = getBirthDate - getExperience;
        checkBirthDateAndJob(start, localDate, getBirthDate, getYear, get18, getExperience, scanner);
    }

    public static void checkBirthDateAndJob(int start, LocalDate localDate, int getBirthDate, int getYear, int get18, int getExperience, Scanner scanner) throws NotBirthException {
        try {
            if ((start > localDate.getYear() || getBirthDate > getYear) || (get18 < 18)) {
                scanner.close();
                System.out.println("Enter correctly! like this \n year of birth \"1997\" \n and \n year of start of work \"2015\"");
            } else {
                printBirthDateAndJob(getBirthDate, getExperience);
            }
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("You have to enter only numbers!");
            throw new NotBirthException("Error. look at user's enter");
        }
    }

    public static void printNames(String name, String lastName) {
        System.out.println("Name of employee: " + name + "\nLastname of employee: " + lastName);
    }

    public static void printBirthDateAndJob(int birth, int experience) {
        System.out.println("Employee's age is: " + birth + "\n" + "Employee's experience is: " + experience);
    }
}

