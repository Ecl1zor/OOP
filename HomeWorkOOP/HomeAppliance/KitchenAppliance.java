package HomeWorkOOP.HomeAppliance;
    public class KitchenAppliance extends HomeAppliance {
        private int capacity;

        public KitchenAppliance(String brand, int powerConsumption, int capacity) {
            super(brand, powerConsumption);
            this.capacity = capacity;
        }
        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
    }


