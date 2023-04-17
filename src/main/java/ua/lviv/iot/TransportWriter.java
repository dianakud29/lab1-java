package ua.lviv.iot;

import java.io.*;
import java.util.List;
public class TransportWriter {
    public void writeToFile(List<Transport> transport) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("FileForTransport.CSV"));

        for (Transport transport_value : transport) {
            bufferedWriter.write(transport_value.getHeaders());
            bufferedWriter.newLine();
            bufferedWriter.write(transport_value.toCSV());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public static void main(String[] args) throws IOException {

        TransportManager transportManager = new TransportManager();
        transportManager.addTransport(new Car("Car", 4, 4, 500, 230, 70, 5));
        transportManager.addTransport(new Tram("Tram",45, 90, 25, 50));
        transportManager.addTransport(new Train("Train",19, 80, 6, 100));
        transportManager.addTransport(new Trolleybus("Trolleybus", 40, "Naukova", 27, 10, 35, 6, 60));

        TransportWriter transportWriter = new TransportWriter();
        transportWriter.writeToFile(transportManager.getTransports());

        File cvsFile = new File("CvsFileTransport");
        PrintWriter out = new PrintWriter(cvsFile);

        for(Transport transport: transportManager.getTransports()){
            out.println(transport.getHeaders());
            out.println(transport.toCSV());
        }
        out.close();

    }
}

