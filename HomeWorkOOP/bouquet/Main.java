package HomeWorkOOP.bouquet;

public class Main {
    public static void main(String[] args) {
        Rose rose = new Rose(2.5, 5);
        Carnation carnation = new Carnation( 1.8 , 4);
        Tulip tulip = new Tulip(1.2, 3);
        Lily lily = new Lily( 3.0, 6);
        Pion pion = new Pion(2.0, 7);
        Flower[] bouquet = {rose, carnation, tulip, lily, pion};
        double totalCost = 0;
        for (Flower price : bouquet) {
            totalCost += price.getPrice();
        }
        System.out.println("Стоимость букета: $" + totalCost);
        System.out.print("Цвета в букете: ");
        for (Flower color : bouquet) {
            System.out.print(color.getColor() + "  ");
        }
        int maxDaysToWither = 0;
        for (Flower flower : bouquet) {
            if (flower.getDaysToWither() > maxDaysToWither) {
                maxDaysToWither = flower.getDaysToWither();
            }
        }
        System.out.println();
        System.out.println("Букет завянет через " + maxDaysToWither + " дней");
    }
}
