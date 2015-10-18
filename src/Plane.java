
import java.util.HashMap;

public class Plane {
    
    private HashMap<String, Integer> planes;

    public Plane() {
        planes = new HashMap<String, Integer>();
    }

    public void addPlane(String ID, int cap) {
        planes.put(ID, cap);
    }
    
    
    
    public String printPlaneInfo(String ID) {
        return ID + " (" + planes.get(ID) + " ppl)";
    }
    
    public void printPlanes() {
        for (String item : planes.keySet()) {
            System.out.println(item + " (" + planes.get(item) + " ppl)");
        }
    }

}
