package p1;

public class Main {

    public static void main(String[] args) {
        //create an array of balloons
        balloon[] thing = new balloon[5];

        //build balloon
        thing[0] = new balloon();

        thing[1] = new balloon(14, "camo");

        thing[2] = new balloon(12, "yellow");
        //print the number of balloons made today
        System.out.printf("Number of balloons made = %d%n", balloon.getQuantity());
        //show the balloon's characteristics
        for (balloon each : thing)
            //only show object if it's defined
            if (each != null)
                System.out.printf("size = %d inches; color = %s%n", each.getSize(), each.getColor());
    }
}

class balloon {
    //properties
    private int size;
    private String color;
    private static int quantity = 0;

    //default constructor
    balloon() {
        size = 10;
        color = "moab";
        quantity++;
    }
    //custom constructor
    balloon(int arg1, String arg2) {
        size = arg1;
        color = arg2;
        quantity++;
    }
     //return color of the object
    String getColor (){
        return color;
    }
    //return size of the object
    int getSize(){
        return size;
    }
    //return quantity of balloons produced
    static int getQuantity(){
        return quantity;
    }
}