import java.lang.reflect.Array;
import  java.util.ArrayList;

public class EarthSim {

    private void Sim(){

    }
    public static void main(String[] args) {

        double mass = 100;
        double drag_co = 0.134;
        double surface_area = 6.28*2;
        double lift_co = 0.1;
        double initial_alt = 100000;
        double initial_vel = 7700;
        double initial_angle = 0.393;

        double grav = 9.81;
        double weight = mass * grav;
        double lift = lift_co/drag_co;
        double bal_co = weight/(drag_co*surface_area);
        double dt = 0.1;

        ArrayList<Double> t = new ArrayList<Double>();
        t.add(0.0);

        ArrayList<Double> down = new ArrayList<Double>();
        down.add(0.0);

        ArrayList<Double> alt = new ArrayList<Double>();
        alt.add(initial_alt);

        ArrayList<Double> vel = new ArrayList<Double>();
        vel.add(initial_vel);

        ArrayList<Double> accel = new ArrayList<Double>();
        accel.add(0.0);

        ArrayList<Double> AoA = new ArrayList<Double>();
        AoA.add(initial_angle);

        double curr_alt = initial_alt;
        double curr_vel = initial_vel;
        double curr_angle = initial_angle;
        double curr_range = 0.0;

        System.out.println(alt.get(0));

    }
}
