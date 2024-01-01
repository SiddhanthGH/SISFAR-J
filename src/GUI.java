import javax.swing.*;
import java.awt.*;

public class GUI {

    public static void main(String[] args){//SISFAR(){

        JLabel Title = new JLabel();
        Title.setText("SISFAR");
        Title.setHorizontalTextPosition(JLabel.CENTER);
        Title.setVerticalTextPosition(JLabel.CENTER);
        Title.setFont(new Font("Copperplate Gothic", Font.ITALIC + Font.BOLD,26));
        Title.setVerticalAlignment(JLabel.CENTER);
        Title.setHorizontalAlignment(JLabel.CENTER);
        Title.setForeground(Color.white);
        Title.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JLabel Mass = new JLabel();
        Mass.setText("Mass (kg):");
        Mass.setHorizontalTextPosition(JLabel.CENTER);
        Mass.setVerticalTextPosition(JLabel.CENTER);
        Mass.setFont(new Font("Copperplate Gothic", Font.ITALIC + Font.BOLD,14));
        Mass.setVerticalAlignment(JLabel.CENTER);
        Mass.setHorizontalAlignment(JLabel.CENTER);
        Mass.setForeground(Color.white);
        Mass.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel Drag = new JLabel();
        Drag.setText("Drag:");
        Drag.setHorizontalTextPosition(JLabel.CENTER);
        Drag.setVerticalTextPosition(JLabel.CENTER);
        Drag.setFont(new Font("Copperplate Gothic", Font.ITALIC + Font.BOLD,14));
        Drag.setVerticalAlignment(JLabel.CENTER);
        Drag.setHorizontalAlignment(JLabel.CENTER);
        Drag.setForeground(Color.white);
        Drag.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel Lift = new JLabel();
        Lift.setText("Lift:");
        Lift.setHorizontalTextPosition(JLabel.CENTER);
        Lift.setVerticalTextPosition(JLabel.CENTER);
        Lift.setFont(new Font("Copperplate Gothic", Font.ITALIC + Font.BOLD,14));
        Lift.setVerticalAlignment(JLabel.CENTER);
        Lift.setHorizontalAlignment(JLabel.CENTER);
        Lift.setForeground(Color.white);
        Lift.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel Radius = new JLabel();
        Radius.setText("Radius (m):");
        Radius.setHorizontalTextPosition(JLabel.CENTER);
        Radius.setVerticalTextPosition(JLabel.CENTER);
        Radius.setFont(new Font("Copperplate Gothic", Font.ITALIC + Font.BOLD,14));
        Radius.setVerticalAlignment(JLabel.CENTER);
        Radius.setHorizontalAlignment(JLabel.CENTER);
        Radius.setForeground(Color.white);
        Radius.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel InitialAlt = new JLabel();
        InitialAlt.setText("InitialAlt (m):");
        InitialAlt.setHorizontalTextPosition(JLabel.CENTER);
        InitialAlt.setVerticalTextPosition(JLabel.CENTER);
        InitialAlt.setFont(new Font("Copperplate Gothic", Font.ITALIC + Font.BOLD,14));
        InitialAlt.setVerticalAlignment(JLabel.CENTER);
        InitialAlt.setHorizontalAlignment(JLabel.CENTER);
        InitialAlt.setForeground(Color.white);
        InitialAlt.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel InitialVel = new JLabel();
        InitialVel.setText("InitialVel (ms^-1):");
        InitialVel.setHorizontalTextPosition(JLabel.CENTER);
        InitialVel.setVerticalTextPosition(JLabel.CENTER);
        InitialVel.setFont(new Font("Copperplate Gothic", Font.ITALIC + Font.BOLD,14));
        InitialVel.setVerticalAlignment(JLabel.CENTER);
        InitialVel.setHorizontalAlignment(JLabel.CENTER);
        InitialVel.setForeground(Color.white);
        InitialVel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel InitialAoA = new JLabel();
        InitialAoA.setText("InitialAoA (rad):");
        InitialAoA.setHorizontalTextPosition(JLabel.CENTER);
        InitialAoA.setVerticalTextPosition(JLabel.CENTER);
        InitialAoA.setFont(new Font("Copperplate Gothic", Font.ITALIC + Font.BOLD,14));
        InitialAoA.setVerticalAlignment(JLabel.CENTER);
        InitialAoA.setHorizontalAlignment(JLabel.CENTER);
        InitialAoA.setForeground(Color.white);
        InitialAoA.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField m = new JTextField(5);
        JTextField b = new JTextField(5);
        JTextField l = new JTextField(5);
        JTextField r = new JTextField(5);
        JTextField alt = new JTextField(5);
        JTextField vel = new JTextField(5);
        JTextField AoA = new JTextField(5);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.LINE_AXIS));
        panel.setOpaque(false);
        panel.add(Box.createRigidArea(new Dimension(5,0)));
        panel.add(Mass);
        panel.add(Box.createRigidArea(new Dimension(10,0)));
        panel.add(m);
        panel.add(Box.createRigidArea(new Dimension(5,0)));

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1,BoxLayout.LINE_AXIS));
        panel1.setOpaque(false);
        panel1.add(Box.createRigidArea(new Dimension(5,0)));
        panel1.add(Drag);
        panel1.add(Box.createRigidArea(new Dimension(10,0)));
        panel1.add(b);
        panel1.add(Box.createRigidArea(new Dimension(5,0)));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2,BoxLayout.LINE_AXIS));
        panel2.setOpaque(false);
        panel2.add(Box.createRigidArea(new Dimension(5,0)));
        panel2.add(Lift);
        panel2.add(Box.createRigidArea(new Dimension(10,0)));
        panel2.add(l);
        panel2.add(Box.createRigidArea(new Dimension(5,0)));

        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3,BoxLayout.LINE_AXIS));
        panel3.setOpaque(false);
        panel3.add(Box.createRigidArea(new Dimension(5,0)));
        panel3.add(Radius);
        panel3.add(Box.createRigidArea(new Dimension(10,0)));
        panel3.add(r);
        panel3.add(Box.createRigidArea(new Dimension(5,0)));

        JPanel panel4 = new JPanel();
        panel4.setLayout(new BoxLayout(panel4,BoxLayout.LINE_AXIS));
        panel4.setOpaque(false);
        panel4.add(Box.createRigidArea(new Dimension(5,0)));
        panel4.add(InitialAlt);
        panel4.add(Box.createRigidArea(new Dimension(10,0)));
        panel4.add(alt);
        panel4.add(Box.createRigidArea(new Dimension(5,0)));

        JPanel panel5 = new JPanel();
        panel5.setLayout(new BoxLayout(panel5,BoxLayout.LINE_AXIS));
        panel5.setOpaque(false);
        panel5.add(Box.createRigidArea(new Dimension(5,0)));
        panel5.add(InitialVel);
        panel5.add(Box.createRigidArea(new Dimension(10,0)));
        panel5.add(vel);
        panel5.add(Box.createRigidArea(new Dimension(5,0)));

        JPanel panel6 = new JPanel();
        panel6.setLayout(new BoxLayout(panel6,BoxLayout.LINE_AXIS));
        panel6.setOpaque(false);
        panel6.add(Box.createRigidArea(new Dimension(5,0)));
        panel6.add(InitialAoA);
        panel6.add(Box.createRigidArea(new Dimension(10,0)));
        panel6.add(AoA);
        panel6.add(Box.createRigidArea(new Dimension(5,0)));

        JButton run = new JButton();
        run.setText("Simulate");
        run.setFont(new Font("Copperplate Gothic", Font.ITALIC + Font.BOLD,10));
        run.setVerticalAlignment(JButton.CENTER);
        run.setHorizontalAlignment(JButton.CENTER);

        JPanel panel7 = new JPanel();
        panel7.setLayout(new BoxLayout(panel7,BoxLayout.LINE_AXIS));
        panel7.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel7.setOpaque(false);
        panel7.add(run);

        JFrame frame = new JFrame();
        frame.setTitle("SISFAR-J");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(300,450);
        ImageIcon image = new ImageIcon("SISFAR.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));

        frame.add(Box.createRigidArea(new Dimension(0,15)));
        frame.add(Title);
        frame.add(Box.createRigidArea(new Dimension(0,20)));
        frame.add(panel);
        frame.add(Box.createRigidArea(new Dimension(0,20)));
        frame.add(panel1);
        frame.add(Box.createRigidArea(new Dimension(0,20)));
        frame.add(panel2);
        frame.add(Box.createRigidArea(new Dimension(0,20)));
        frame.add(panel3);
        frame.add(Box.createRigidArea(new Dimension(0,20)));
        frame.add(panel4);
        frame.add(Box.createRigidArea(new Dimension(0,20)));
        frame.add(panel5);
        frame.add(Box.createRigidArea(new Dimension(0,20)));
        frame.add(panel6);
        frame.add(Box.createRigidArea(new Dimension(0,20)));
        frame.add(panel7);
        frame.add(Box.createRigidArea(new Dimension(0,15)));

        frame.setVisible(true);

        double mass = 100;
        double drag_co = 2.2;
        double lift_co = 0.55;
        double radius = 2;
        double initial_alt = 100000;
        double initial_vel = 7700;
        double initial_angle = 0.393;

        double[] params = new double[7];
        params[0] = mass;
        params[1] = drag_co;
        params[2] = lift_co;
        params[3] = radius;
        params[4] = initial_alt;
        params[5] = initial_vel;
        params[6] = initial_angle;

        //EarthSim.run(params);

    }

}
