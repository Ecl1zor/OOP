package HomeWorkOOP.Aircraft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Airline {
    private List<Aircraft> fleet;

    public Airline() {
        fleet = new ArrayList<>();
    }

    public void addAircraft(Aircraft aircraft) {
        fleet.add(aircraft);
    }

    public int calculateTotalSeatingCapacity() {
        int totalSeatingCapacity = 0;
        for (Aircraft aircraft : fleet) {
            totalSeatingCapacity += aircraft.getSeatingCapacity();
        }
        return totalSeatingCapacity;
    }

    public double calculateTotalCargoCapacity() {
        double totalCargoCapacity = 0;
        for (Aircraft aircraft : fleet) {
            totalCargoCapacity += aircraft.getCargoCapacity();
        }
        return totalCargoCapacity;
    }

    public void sortAircraftByFlightRange() {
        fleet.sort(Comparator.comparingDouble(Aircraft::getFlightRange));
    }

    public List<Airplane> findAirplanesByParameters(double minFlightRange, double maxFlightRange) {
        List<Airplane> airplanes = new ArrayList<>();
        for (Aircraft aircraft : fleet) {
            if (aircraft instanceof Airplane && aircraft.getFlightRange() >= minFlightRange && aircraft.getFlightRange() <= maxFlightRange) {
                airplanes.add((Airplane) aircraft);
            }
        }
        return airplanes;
    }

    public List<Aircraft> getFleet() {
        return fleet;
    }

    public void setFleet(Aircraft[] fleet) {
        this.fleet = List.of(fleet);
    }
}

