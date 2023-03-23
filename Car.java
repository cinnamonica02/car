public class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

// Please create a constructor of this class consisting
// of the previously mentioned fields.


    // We create constructor method and pass in the fields
    // as the parameter
    public Car (String model, String brand, int year, double price, String color , int quantity   ) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    // We also create methods to return each of the fields (we use return)e.g.:getMOdel()
// and methods to set value each of the fields (methods taking a new value in their
// parameters fields)e.g.:setModel(Stingmodel).


    // Wel use Getters and setters

    // The get method returns the variable value, and the set method sets the value.

    // Syntax for both is that they start with either get or set, followed by the name of the variable,
    // with the first letter in upper case. The 'this' keyword is used to refer to current object
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters

    public void setModel ( String newModel) {
        this.model = newModel;
    }

    public void setBrand ( String newBrand) {
        this.brand = newBrand;
    }

    public void setYear ( int newYear) {
        this.year = newYear;
    }

    public void setPrice (double newPrice) {
        this.price = newPrice;
    }

    public void setColor (String newColor) {
        this.color = newColor;
    }

    public void setQuantity (int newQuantity) {
        this.quantity = newQuantity;
    }

    // Additionally, we create a delivery()
    // method (simulating car delivery) and sell() (simulating car sales)
    // which changes the value of the quantity field.

    public void delivery(int quantity) {
        this.quantity += quantity;
    }


    //The last method we create is the toString() method that returns an object
    // of type String and prints itnames of all fields of a given object and their
    // state or value

    public String toString( ) {
        // return carObj = new carobj()
    }

 // System.out.println(carObj.name);
}


