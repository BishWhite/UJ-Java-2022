import java.util.Optional;

public class MinMax {
    static  MinMax instance;
    private MinMax() {
    }

    public static MinMax getInstance() {
        if ( MinMax.instance == null) {
            MinMax.instance = new MinMax();
        }

        return MinMax.instance;
    }

    public boolean checkWin(){
        return false;
    }

    public void print(){
        System.out.println("We are fucked beyond repair");
    }

}
