package task1;

public enum Vehicles {
    Car(10000, "white", "BMW"), Car2 (20000, "black", "Audi");

    int price;
    String color;
    String name;

    Vehicles(int price, String color, String name) {
        this.price = price;
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
return name() + "\nName is: " + name + "\nColor is: " + color + "\nPrice is: " + price;
    }
}

