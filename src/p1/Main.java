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

        //destroy a balloon
        balloon.destruct(1, thing);

        //print remaining balloon
        System.out.printf("Number of remaining balloon = %d%n", balloon.getQuantity());

        //show the balloon's characteristics
        for (balloon each : thing)
            //only show object if it's defined
            if (each != null)
                System.out.println(each);
    }
}

class balloon {
    //properties
    private int size;
    private String color;
    private boolean inflated;
    private static int quantity = 0;

    //default constructor
    balloon() {
        size = 10;
        color = "moab";
        inflated = false;
        quantity++;
    }

    public boolean isInflated() {
        return inflated;
    }

    public void setInflated(boolean arg) {
        inflated = arg;
    }

    //custom constructor
    balloon(int arg1, String arg2) {
        size = arg1;
        color = arg2;
        inflated = false;
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
    //destruct a balloon
    static void destruct(int i, balloon[] arg){
        arg[i] = null;
        quantity--;
    }
    @Override
    public String toString() {
        return "balloon{" +
                "size = " + size +
                ", color = " + color +
                ", inflated = " + (inflated ? " inflated" :  "not inflated") +
                '}';
    }
}