package HomeWorkOOP.Aircraft;

import java.util.List;

public class Main {
    public static <List> void main(String[] args) {
        Airline airline = new Airline();

        Airplane airplane1 = new Airplane("Boeing 747", 416, 142000, 9800, 4);
        Helicopter helicopter1 = new Helicopter("Bell 206", 5, 1000, 400, 10);
        Quadcopter quadcopter1 = new Quadcopter("DJI Phantom 4", 0, 500, 5, 4);

        airline.addAircraft(airplane1);
        airline.addAircraft(helicopter1);
        airline.addAircraft(quadcopter1);

        int totalSeatingCapacity = airline.calculateTotalSeatingCapacity();
        double totalCargoCapacity = airline.calculateTotalCargoCapacity();
        System.out.println("Общая вместимость: " + totalSeatingCapacity);
        System.out.println("Общая грузоподъемность: " + totalCargoCapacity);

        airline.sortAircraftByFlightRange();
        System.out.println("Отсортированные летные средства по дальности полета:");
        for (Aircraft aircraft : airline.getFleet()) {
            System.out.println(aircraft.getModel() + " - " + aircraft.getFlightRange() + " км");
        }
        double minFlightRange = 300;
        double maxFlightRange = 1000;
        java.util.List<Airplane> airplanesInRange = airline.findAirplanesByParameters(minFlightRange, maxFlightRange);
        System.out.println("Самолеты в заданном диапазоне параметров (" + minFlightRange + " - " + maxFlightRange + " км):");
        for (Airplane airplane : airplanesInRange) {
            System.out.println(airplane.getModel() + " - " + airplane.getFlightRange() + " км");
        }
    }
}
