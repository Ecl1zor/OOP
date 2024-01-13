package HomeWorkOOP.Aircraft;

public class Quadcopter extends Aircraft {
    private int numberOfPropellers;


    public Quadcopter(String model, int seatingCapacity, double cargoCapacity, double flightRange, int numberOfPropellers) {
        super(model, seatingCapacity, cargoCapacity, flightRange);
        this.numberOfPropellers = numberOfPropellers;
    }



    public int getNumberOfPropellers() {
        return numberOfPropellers;
    }

    public void setNumberOfPropellers(int numberOfPropellers) {
        this.numberOfPropellers = numberOfPropellers;
    }
}