import Exceptions.NotParallelepiped;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Parallelepiped extends Figure {

    @Override
    public void calculateFigure() throws NotParallelepiped {
        Parallelepiped p = new Parallelepiped();
        try {
            questionForUser(p);
            checkNumForMinus(p);
        } catch (NumberFormatException | InputMismatchException e) {
            e.printStackTrace();
            throw new NotParallelepiped("You have to enter only num");
        }
    }

    public void checkNumForMinus(Parallelepiped p) {
        if (p.getWidth() > 0 && p.getHeight() > 0 && p.getLength() > 0) {
            int volume = (p.getLength() * p.getWidth() * p.getHeight());
            System.out.println("Volume of parallelepiped is: " + volume);
            int space = (2 * (p.getHeight() * p.getLength() + p.getLength() * p.getWidth() + p.getHeight() * p.getWidth()));
            System.out.println("Space of parallelepiped is: " + space);
        } else {
            System.out.println("\nError! Num cannot be less than 1.");
        }
    }

    public void questionForUser(Parallelepiped p) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You need to enter length of parallelepiped: ");
        p.setLength(scanner.nextInt());
        System.out.print("You need to enter width of parallelepiped: ");
        p.setWidth(scanner.nextInt());
        System.out.print("You need to enter height of parallelepiped: ");
        p.setHeight(scanner.nextInt());
    }
}
