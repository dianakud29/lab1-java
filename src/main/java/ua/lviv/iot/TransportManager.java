package ua.lviv.iot;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TransportManager {
    List<Transport> getTransports(){
        return transports;
    }
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

    final List<Transport> transports = new LinkedList<>();
    void addTransport(Transport transportList){
        this.transports.add(transportList);
    }

}