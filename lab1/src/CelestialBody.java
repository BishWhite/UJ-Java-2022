import java.util.HashMap;

public class CelestialBody{
    static int counter = 0;
    private int id;
    private String name;
    protected static HashMap<Integer,CelestialBody> celestialBodies = new HashMap<Integer, CelestialBody>();

    public CelestialBody(String name){
        this.id = counter;
        counter++;
        this.name = name;
        celestialBodies.put(this.id, this);
    }
    public int getId(){
        return this.id;

    }
    public static CelestialBody findById(int Id){
        return celestialBodies.get(Id);
    }
    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.getClass() +" " +  this.getName();
    }

}
