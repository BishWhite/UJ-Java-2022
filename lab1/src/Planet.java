public class Planet extends CelestialBody{


    private int index=0;
    private Moon moons[] = new Moon[10];
    protected Star star;

    public Planet(String name){
        super(name);
    }

    public Star getStar(){
        return this.star;
    }

    public void addMoon(Moon m){
        if(this.index<10){
            this.moons[index] = m;
            this.index++;
            m.planet = this;
        }
    }
    public Moon getMoon(int i){
        return this.index<10 ? this.moons[i] : null;
    }

}
