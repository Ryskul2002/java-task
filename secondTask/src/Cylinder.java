import Exceptions.NotCylinder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cylinder extends Figure{

    @Override
    public void calculateFigure() throws NotCylinder {
        Cylinder c = new Cylinder();
        try {
            questionForUser(c);
            checkNumForMinus(c);
        } catch (NumberFormatException | InputMismatchException e) {
            e.printStackTrace();
            throw new NotCylinder("You have to enter only num");
        }
    }

    public void checkNumForMinus(Cylinder c) {
        if (c.getRadius() > 0 && c.getHeight() > 0) {
            double volume = (Math.PI * Math.pow(c.getRadius(),2) * c.getHeight());
            System.out.println("Volume of cylinder is: " + volume);
            double space = (2 * Math.PI * c.getRadius() * (c.getHeight() + c.getRadius()));
            System.out.println("Space of cylinder is: " + space);
        } else {
            System.out.println("\nError! Num cannot be less than 1.");
        }
    }

    public void questionForUser(Cylinder c) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You need to enter radius of cylinder: ");
        c.setRadius(scanner.nextInt());
        System.out.print("You need to enter height of cylinder: ");
        c.setHeight(scanner.nextInt());
    }
}
