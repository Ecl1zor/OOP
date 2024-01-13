package HomeWorkOOP.bouquet;

class Flower {
    String color;
    double price;
    int daysToWither;

    public Flower(String color, double price, int daysToWither) {
        this.color  = color;
        this.price = price;
        this.daysToWither = daysToWither;
    }
    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getDaysToWither() {
        return daysToWither;
    }
}