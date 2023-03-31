package ua.lviv.iot.algo.part1.lab2;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TransportManager {
  public List<Transport> findAllWithSpeedGreaterThan(final int speed){
      return transports.stream()
              .filter(transport -> transport.getMaxSpeed() > speed)
              .collect(Collectors.toList());
  }

    public List<Transport> findAllWithQuantityOfPassengersGreaterThan(final int quantityOfPassengers) {
        return transports.stream()
                .filter(transport -> transport.getMaxQuantityOfPassengers() > quantityOfPassengers)
                .collect(Collectors.toList());
    }

    private final List<Transport> transports = new LinkedList<>();
    private void addTransport(Transport transportList){
        this.transports.add(transportList);
    }
    public static void main(String[] args) {

        Transport tram1 = new Tram(45, 90, 25, 50);
        Transport tram2 = new Tram(56, 95, 17, 45);
        Transport train1 = new Train(19, 80, 6, 100);
        Transport train2 = new Train(34, 70, 5, 80);
        Transport trolleybus1 = new Trolleybus(40, "Naukova", 27, 10, 35, 6, 60);
        Transport trolleybus2 = new Trolleybus(2, "Stryyska", 30, 15, 42, 5, 50);
        Transport car1 = new Car(4, 250,500, 230, 70, 5);
        Transport car2 = new Car(8, 500,600, 260, 65, 8);

        TransportManager transportManager =  new TransportManager();

        transportManager.addTransport(tram1);
        transportManager.addTransport(tram2);
        transportManager.addTransport(train1);
        transportManager.addTransport(train2);
        transportManager.addTransport(trolleybus1);
        transportManager.addTransport(trolleybus2);
        transportManager.addTransport(car1);
        transportManager.addTransport(car2);

        for (Transport transport : transportManager.transports){
            System.out.println(transport);
        }
        List<Transport> filteredList = transportManager.findAllWithSpeedGreaterThan(60);
        System.out.println(filteredList);

        List<Transport> filteredLists = transportManager.findAllWithQuantityOfPassengersGreaterThan(30);
        System.out.println(filteredLists);



    }
}