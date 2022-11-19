
public class Star extends CelestialBody{

    private int index=0;
    private Planet planets[] = new Planet[10];

    public Star(String name){
        super(name);
    }

    public void addPlanet(Planet p){
        if(this.index<10){
            this.planets[index] = p;
            this.index++;
            p.star = this;
        }
    }
    public Planet getPlanet(int i){
        return this.index < 10 ? this.planets[i] : null;

    }

}
