package HomeWorkOOP.HomeAppliance;

public class HomeAppliance {
        private String brand;
        private int powerConsumption;

        public HomeAppliance(String brand, int powerConsumption) {
            this.brand = brand;
            this.powerConsumption = powerConsumption;
        }

        public int calculatePowerConsumption() {
            return powerConsumption;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getPowerConsumption() {
            return powerConsumption;
        }

        public void setPowerConsumption(int powerConsumption) {
            this.powerConsumption = powerConsumption;
        }
    }

