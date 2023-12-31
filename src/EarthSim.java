import java.lang.reflect.Array;
import  java.util.ArrayList;
import java.util.Collections;

public class EarthSim {

    public static void main(String[] args) {

        double mass = 100;
        double drag_co = 2.2;
        double surface_area = 6.28*2;
        double lift_co = 0.55;
        double initial_alt = 100000;
        double initial_vel = 7700;
        double initial_angle = 0.393;

        double g = 9.81;
        double weight = mass * g;
        double lift = lift_co/drag_co;
        double bal_co = weight/(drag_co*surface_area);
        double dt = 0.01;
        double t = 0;

        ArrayList<Double> time = new ArrayList<Double>();
        time.add(0.0);

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
        double curr_accel = 0.0;
        double P = 0;
        double T = 0;

        while (curr_alt >= 0){

            //clock
            t = t + dt;
            time.add(t);

            //atmosphere
            if (curr_alt>=25000){
                T = -131.21 + (0.00299*curr_alt);
                P = 2.488 * Math.pow(((T+273.1)/216.6), (-11.388));
            } else if (curr_alt < 25000) {
                if (curr_alt >= 11000){
                    T = -56.46;
                    P = 22.65 * (Math.exp(1.73-(0.000157*curr_alt)));
                } else if (curr_alt < 11000) {
                    T = 15.04 - (0.00649*curr_alt);
                    P = 101.29 * Math.pow(((T+273.1)/288.08), 5.256);
                }
            }

            //Dynamic Pressure Sim
            double p = P/(0.2869*(T+273.1));
            double Q = (p*Math.pow(curr_vel, 2))/2;

            //Velocity Sim
            double past_vel = curr_vel;
            curr_vel = (dt*g*((-Q/bal_co)+Math.sin(initial_angle))) + past_vel;
            vel.add(curr_vel);
            curr_accel = (curr_vel-past_vel)/dt;
            accel.add(curr_accel);

            //Angle Sim
            double past_angle = curr_angle;
            curr_angle = dt*((((-(Q*g)/bal_co)*(lift))+(Math.cos(curr_angle)*(g-(Math.pow(curr_vel,2)/(6371000+curr_alt)))))/curr_vel) + past_angle;
            AoA.add(curr_angle);

            //Altitude Sim
            double past_alt = curr_alt;
            curr_alt = dt*(-curr_vel)*Math.sin(curr_angle) + past_alt;
            alt.add(curr_alt);

            //Range Sim
            double past_range = curr_range;
            curr_range = dt*((6371000*curr_vel*Math.cos(curr_angle))/(6371000+curr_alt)) + past_range;
            down.add(curr_range);

        }
        System.out.printf("%n Time to re-enter = %,.2f seconds %n", Collections.max(time));
    }

}
