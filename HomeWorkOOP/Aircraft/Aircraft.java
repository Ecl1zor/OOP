package HomeWorkOOP.Aircraft;

    public abstract class Aircraft {
        private String model;
        private int seatingCapacity;
        private double cargoCapacity;
        private double flightRange;


        public Aircraft(String model, int seatingCapacity, double cargoCapacity, double flightRange) {
            this.model = model;
            this.seatingCapacity = seatingCapacity;
            this.cargoCapacity = cargoCapacity;
            this.flightRange = flightRange;
        }


        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getSeatingCapacity() {
            return seatingCapacity;
        }

        public void setSeatingCapacity(int seatingCapacity) {
            this.seatingCapacity = seatingCapacity;
        }

        public double getCargoCapacity() {
            return cargoCapacity;
        }

        public void setCargoCapacity(double cargoCapacity) {
            this.cargoCapacity = cargoCapacity;
        }

        public double getFlightRange() {
            return flightRange;
        }

        public void setFlightRange(double flightRange) {
            this.flightRange = flightRange;
        }
    }
