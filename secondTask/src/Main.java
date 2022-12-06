import Exceptions.NotCone;
import Exceptions.NotCylinder;
import Exceptions.NotParallelepiped;
import Exceptions.NotSphere;

import java.util.Scanner;

public class Main {

    private static final String question = "What would you like to choose? You can choose with number. \n1-Parallelepiped. \n2-Sphere. \n3-Cylinder. \n4-Code.";

    public static void main(String[] args) throws NotParallelepiped, NotSphere, NotCylinder, NotCone {
        Scanner scanner = new Scanner(System.in);
        questionForUserChoosingFigure(scanner);
    }

    public static void questionForUserChoosingFigure(Scanner scanner) throws NotParallelepiped, NotSphere, NotCylinder, NotCone {
        System.out.println(question);
        String figure = scanner.nextLine().toLowerCase().trim();
        switch (figure) {
            case "1", "parallelepiped":
                getParallelepiped();
                break;
            case "2", "sphere":
                getSphere();
                break;
            case "3", "cylinder":
                getCylinder();
                break;
            case "4","cone":
                getCone();
                break;
            default:
                System.out.println("You must enter \n1 -> Parallelepiped. \n2 -> Sphere. \n3 -> Cylinder. \n4 -> Code");
        }
    }

    public static void getParallelepiped() throws NotParallelepiped {
        Parallelepiped p = new Parallelepiped();
        p.calculateFigure();
    }

    public static void getSphere() throws NotSphere {
        Sphere s = new Sphere();
        s.calculateFigure();
    }

    public static void getCylinder() throws NotCylinder {
        Cylinder c = new Cylinder();
        c.calculateFigure();
    }

    public static void getCone() throws NotCone {
        Cone c = new Cone();
        c.calculateFigure();
    }
}
