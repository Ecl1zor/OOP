package HomeWorkOOP.Aircraft;

public class Airplane extends Aircraft {
    private int numberOfEngines;


    public Airplane(String model, int seatingCapacity, double cargoCapacity, double flightRange, int numberOfEngines) {
        super(model, seatingCapacity, cargoCapacity, flightRange);
        this.numberOfEngines = numberOfEngines;
    }



    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }
}

