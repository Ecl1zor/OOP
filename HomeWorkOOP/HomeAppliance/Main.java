package HomeWorkOOP.HomeAppliance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HomeAppliance appliance1 = new HomeAppliance("Samsung", 1000);
        KitchenAppliance kitchenAppliance1 = new KitchenAppliance("Bosch", 1200, 500);

        int totalPowerConsumption = appliance1.calculatePowerConsumption() + kitchenAppliance1.calculatePowerConsumption();
        System.out.println("Общая потребляемая мощность: " + totalPowerConsumption + " Вт");

        HomeAppliance[] appliances = {appliance1, kitchenAppliance1};
        Arrays.sort(appliances, Comparator.comparingInt(HomeAppliance::getPowerConsumption));
        System.out.println("Отсортированные приборы по мощности:");
        for (HomeAppliance appliance : appliances) {
            System.out.println(appliance.getBrand() + " - " + appliance.getPowerConsumption() + " Вт");
        }

        int minPower = 1000;
        int maxPower = 1500;
        List<KitchenAppliance> kitchenAppliances = new ArrayList<>();
        for (HomeAppliance appliance : appliances) {
            if (appliance instanceof KitchenAppliance) {
                kitchenAppliances.add((KitchenAppliance) appliance);
            }
        }
        System.out.println("Кухонные приборы в заданном диапазоне мощности (" + minPower + " - " + maxPower + " Вт):");
        for (KitchenAppliance kitchenAppliance : kitchenAppliances) {
            if (kitchenAppliance.getPowerConsumption() >= minPower && kitchenAppliance.getPowerConsumption() <= maxPower) {
                System.out.println(kitchenAppliance.getBrand() + " - " + kitchenAppliance.getPowerConsumption() + " Вт");
            }
        }
    }
}
