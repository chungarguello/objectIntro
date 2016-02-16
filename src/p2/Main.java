package p2;

/*
 * Created by carguell on 2/11/2016.
 */
import javafx.geometry.Point2D;

public class Main {
    public static void main(String[] joe){
        //define two points
        Point2D pt1 = new Point2D(4, 0);
        Point2D pt2 = new Point2D(0, 3);

        //print information about the points
        System.out.println(pt1);
        System.out.println(pt2);

        //find the hypotenuse
        double hyp = pt1.distance(pt2);

        //print hypotenuse
        System.out.printf("Hypotenuse = %.1f%n", hyp);
    }
}
