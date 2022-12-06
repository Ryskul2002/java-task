import Exceptions.NotSphere;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sphere extends Figure {

    @Override
    public void calculateFigure() throws NotSphere {
        Sphere s = new Sphere();
        try {
            questionForUser(s);
            checkNumForMinus(s);
        } catch (NumberFormatException | InputMismatchException e) {
            e.printStackTrace();
            throw new NotSphere("You have to enter only num");
        }
    }

    public void checkNumForMinus(Sphere s) {
        if (s.getRadius() > 0) {
            double volume = (4 * Math.PI * Math.pow(s.getRadius(),3)) / 3;
            System.out.println("Volume of sphere is: " + volume);
            double space = (4 * Math.PI * s.getRadius()) * 2;
            System.out.println("Space of sphere is: " + space);
        } else {
            System.out.println("\nError! Num cannot be less than 1.");
        }
    }

    public void questionForUser(Sphere s) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You need to enter radius of sphere: ");
        double num = scanner.nextDouble();
        s.setRadius(num);
    }
}

