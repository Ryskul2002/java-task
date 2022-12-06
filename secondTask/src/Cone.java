import Exceptions.NotCone;
import Exceptions.NotParallelepiped;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cone extends Figure{

    @Override
    public void calculateFigure() throws NotCone {
        Cone c = new Cone();
        try {
            questionForUser(c);
            checkNumForMinus(c);
        } catch (NumberFormatException | InputMismatchException e) {
            e.printStackTrace();
            throw new NotCone("You have to enter only num");
        }
    }

    public void checkNumForMinus(Cone c) {
        if (c.getRadius() > 0 && c.getHeight() > 0) {
            double volume = (Math.PI * Math.pow(c.getRadius(), 2) * c.getHeight()) / 3;
            System.out.println("Volume of cone is: " + volume);
            double r1 = (Math.sqrt(Math.pow(c.getRadius(),2) + Math.pow(c.getHeight(),2)));
            double space = (Math.PI * c.getRadius() * (c.getRadius() + r1));
            System.out.println("Space of cone is: " + space);
        } else {
            System.out.println("\nError! Num cannot be less than 1.");
        }
    }

    public void questionForUser(Cone c) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You need to enter radius of Cone: ");
        c.setRadius(scanner.nextInt());
        System.out.print("You need to enter height of Cone: ");
        c.setHeight(scanner.nextInt());
    }
}
