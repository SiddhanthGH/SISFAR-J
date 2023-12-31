import org.math.plot.*;
import javax.swing.*;
import java.util.ArrayList;

public class Plotter {

    public static void Plot(ArrayList<Double> x, ArrayList<Double> y, int type){

        String fig = "";
        String name = "";
        String namex = "";
        String namey = "";

        double[] X = new double[x.size()];
        for (int i = 0; i < x.size(); i++)
            X[i] = x.get(i);

        double[] Y = new double[y.size()];
        for (int i = 0; i < y.size(); i++)
            Y[i] = y.get(i);

        switch (type){

            case 0:
                namex = "Downrange / m";
                namey = "Altitude / m";
                name = "Path";
                fig = "Figure 1";
                break;

            case 1:
                namex = "Time / s";
                namey = "Velocity / ms^-1";
                name = "Velocity";
                fig = "Figure 2";
                break;

            case 2:
                namex = "Time / s";
                namey = "Acceleration / ms^-2";
                name = "Acceleration";
                fig = "Figure 3";
                break;

            case 3:
                namex = "Time / s";
                namey = "Angle / rad";
                name = "Angle";
                fig = "Figure 4";
                break;

        }

        Plot2DPanel plot = new Plot2DPanel();

        plot.addLegend("EAST");
        plot.addLinePlot(name, X, Y);

        plot.setAxisLabel(0, namex);
        plot.getAxis(0).setLabelPosition(.50, -.1);

        plot.setAxisLabel(1, namey);
        plot.getAxis(1).setLabelPosition(0, 1.05);

        JFrame frame = new JFrame(fig);
        frame.setSize(600, 600);
        frame.setContentPane(plot);
        frame.setVisible(true);

    }

}
