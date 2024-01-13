package HomeWorkOOP.Aircraft;

public class Helicopter extends Aircraft {
    private int rotorDiameter;

    public Helicopter(String model, int seatingCapacity, double cargoCapacity, double flightRange, int rotorDiameter) {
        super(model, seatingCapacity, cargoCapacity, flightRange);
        this.rotorDiameter = rotorDiameter;
    }


    public int getRotorDiameter() {
        return rotorDiameter;
    }

    public void setRotorDiameter(int rotorDiameter) {
        this.rotorDiameter = rotorDiameter;
    }
}
