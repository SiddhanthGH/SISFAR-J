public class Earth {
    static void Simulation() {

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

    }
}
