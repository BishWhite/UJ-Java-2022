
public class Main {
    public static void main(String[] args) {

        CelestialBody body;

        Star s1 = new Star("Star1");
        Star s2 = new Star("Star2");
        Star s3 = new Star("Star3");
        Star s4 = new Star("Star4");
        Planet p1 = new Planet("Planet1");
        Planet p2 = new Planet("Planet2");
        Planet p3 = new Planet("Planet3");
        Planet p4 = new Planet("Planet4");
        Moon m1 = new Moon("Moon1");
        Moon m2 = new Moon("Moon2");
        Moon m3 = new Moon("Moon3");
        Moon m4 = new Moon("Moon4");

        s1.addPlanet(p1);
        s1.addPlanet(p2);
        s4.addPlanet(p3);
        s4.addPlanet(p4);

        p1.addMoon(m1);
        p2.addMoon(m2);
        p3.addMoon(m3);
        p4.addMoon(m4);

        System.out.println(s1.getPlanet(0) + " "+ s1.getPlanet(1));

        System.out.println(CelestialBody.findById(11));
        System.out.println(CelestialBody.findById(13));

        body = CelestialBody.findById(11);
        if(body instanceof Moon){
            System.out.println(body);
        }
    }
}