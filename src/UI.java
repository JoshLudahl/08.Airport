
import java.util.Scanner;
import java.util.ArrayList;

public class UI {
    Scanner input = new Scanner(System.in);
    
    Plane plane;
    Flight flight;
    
    public UI() {
        plane = new Plane();
        flight = new Flight();
        
    }

    public void airportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();

        while (true) {

            System.out.println("Choose operation: ");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            String choice = input.nextLine();

            if (choice.equals("1")) {
                //add plane
                
                System.out.print("Give plane ID: ");
                String planeID = input.nextLine();
                System.out.print("Give plane capacity: ");
                int cap = Integer.parseInt(input.nextLine());
                plane.addPlane(planeID, cap);
                
                

            } else if (choice.equals("2")) {
                //add flight

                System.out.print("Give plane ID: ");
                String planeID = input.nextLine();
                System.out.print("Give departure airport code: ");
                String depCode = input.nextLine();
                System.out.print("Give destination airport code: ");
                String desCode = input.nextLine();
                flight.addFlight(planeID, depCode, desCode);

            } else if (choice.equals("x")) {
                break;

            } else {
                //error
            }
        }
    }

    public void flightPanel() {

        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();

        while (true) {

            System.out.println("Choose operation: ");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            String choice = input.nextLine();

            if (choice.equals("1")) {
                //print planes
                plane.printPlanes();
                
            }
            if (choice.equals("2")) {
                //print flights
                flight.printFlights(plane);
            }
            if (choice.equals("3")) {
                //print plane info
                System.out.print("Give plane ID: ");
                String ID = input.nextLine();
                System.out.println(plane.printPlaneInfo(ID));
                

            }
            if (choice.equals("x")) {
                //Quit
                
                break;
            }
        }
    }
}
