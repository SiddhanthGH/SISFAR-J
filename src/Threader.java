import java.util.ArrayList;

public class Threader implements Runnable{

    private final ArrayList<Double> X;
    private final ArrayList<Double> Y;
    private final int Type;

    public Threader(ArrayList<Double> x, ArrayList<Double> y, int type){

        X = x;
        Y = y;
        Type = type;

    }

    @Override
    public void run() {
        Plotter.Plot(X,Y,Type);
    }
}
