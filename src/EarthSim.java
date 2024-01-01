import  java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EarthSim {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Mass (kg): ");
        double mass = Input.nextDouble(); //100
        System.out.println("Drag Coefficient: ");
        double drag_co = Input.nextDouble(); //2.2
        System.out.println("Body Radius (m): ");
        double radius = Input.nextDouble(); //2
        double surface_area = 3.14159265359*Math.pow(radius,2);
        System.out.println("Lift Coefficient: ");
        double lift_co = Input.nextDouble(); //0.55
        System.out.println("Initial Altitude (m): ");
        double initial_alt = Input.nextDouble(); //100000
        System.out.println("Initial Velocity (ms^-1): ");
        double initial_vel = Input.nextDouble(); //7700
        System.out.println("Initial Angle (rad): ");
        double initial_angle = Input.nextDouble(); //0.393

        double g = 9.81;
        double weight = mass * g;
        double lift = lift_co/drag_co;
        double bal_co = weight/(drag_co*surface_area);
        double dt = 0.01;
        double t = 0;

        ArrayList<Double> time = new ArrayList<>();
        time.add(0.0);

        ArrayList<Double> down = new ArrayList<>();
        down.add(0.0);

        ArrayList<Double> alt = new ArrayList<>();
        alt.add(initial_alt);

        ArrayList<Double> vel = new ArrayList<>();
        vel.add(initial_vel);

        ArrayList<Double> accel = new ArrayList<>();
        accel.add(0.0);

        ArrayList<Double> AoA = new ArrayList<>();
        AoA.add(initial_angle);

        double curr_alt = initial_alt;
        double curr_vel = initial_vel;
        double curr_angle = initial_angle;
        double curr_range = 0.0;
        double curr_accel;
        double P;
        double T;

        while (curr_alt >= 0){

            //clock
            t = t + dt;
            time.add(t);

            //atmosphere
            if (curr_alt>=25000){
                T = -131.21 + (0.00299*curr_alt);
                P = 2.488 * Math.pow(((T+273.1)/216.6), (-11.388));
            } else {
                if (curr_alt >= 11000){
                    T = -56.46;
                    P = 22.65 * (Math.exp(1.73-(0.000157*curr_alt)));
                } else {
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
        System.out.printf("%nTime to re-enter = %,.2f seconds %n", Collections.max(time));
        System.out.printf("Total downrange = %,.2f meters %n", Collections.max(down));

        int type = 0;
        Threader Plot0 = new Threader(down,alt,type);
        Thread PlotThread0 = new Thread(Plot0);
        type = 1;
        Threader Plot1 = new Threader(time,vel,type);
        Thread PlotThread1 = new Thread(Plot1);
        type = 2;
        Threader Plot2 = new Threader(time,accel,type);
        Thread PlotThread2 = new Thread(Plot2);
        type = 3;
        Threader Plot3 = new Threader(time,AoA,type);
        Thread PlotThread3 = new Thread(Plot3);

        PlotThread0.start();
        PlotThread1.start();
        PlotThread2.start();
        PlotThread3.start();

        System.out.println("Press Enter to exit.");
        Input.nextLine();
        Input.nextLine();
        System.exit(0);

    }

}
