import java.util.ArrayList;

public class List {
    private Integer width; 
    private Integer lenght; 
    private ArrayList<Leg> legs = new ArrayList<>();
public List(Integer numlegs){
    for(int i = 0; i<numlegs; i++){
        legs.add(new Leg(25));    }
}

}
