
import java.util.HashMap;
import java.util.ArrayList;

public class Flight {

private HashMap<String, String> flights;
    

    public Flight() {
        flights = new HashMap<String, String>();
    }

    public void addFlight(String flightID, String origin, String destination) {
       String path = "(" + origin + "-" + destination + ")";
       flights.put(path, flightID);
       
    }

    public void printFlights(Plane plane) {
            for (String item : flights.keySet()) {
                
                System.out.println(plane.printPlaneInfo(flights.get(item)) + " " +item);
            }
        }
    

}
