
public class Moon extends CelestialBody{

    protected String name;
    protected Planet planet;
    public Moon(String name){
        super(name);
    }
    public String getName(){
        return this.name;

    }
    public Planet getPlanet(){
        return this.planet;

    }
}
