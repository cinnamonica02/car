public class Main {
    public static void main(String[] args) {

        // create another class with the main() method in which:


        // •we create object of the Car class by using the constructor


        Car Car = new Car("Tesla", "Tesla", 2022, 6000000, "Navy" , 1 );

        System.out.println(Car);

        // •we call and print what thetoString() method passes

        System.out.println(Car.toString());
        // •we call thesell() method



        // •we print all fields (using the previously declared „get”methods of the object field.


        System.out.println("Model: " + Car.getModel());
        System.out.println("Brand: " + Car.getBrand());
        System.out.println("Year: " + Car.getYear());
        System.out.println("Price: " + Car.getPrice());
        System.out.println("Color: " + Car.getColor());
        System.out.println("Quantity: " + Car.getQuantity());


        // •using the„set” methods we change some fields of the object

        Car.setModel("Panterarosa");
        Car.setYear(2020);






        // •we call and print again toString() method to notice the changes.

        System.out.println(Car.toString());


    }
}