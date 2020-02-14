import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class ZorgApp {
    public ZorgApp() {
        Profile profile1 = new Profile("Jan Peter", "Balkenende", 63, 85.43, 1.86);

        JFrame frame = new JFrame();
        frame.setTitle("ZorgApp");
        frame.setSize(400, 600);
        frame.setResizable(false);
        frame.setLocation(600, 100);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setLayout(new GridLayout(1, 1));

        JTabbedPane patientPane = new JTabbedPane(JTabbedPane.TOP);

        JPanel panel1 = new JPanel();

        JLabel naam = new JLabel("Naam: " + profile1.getNaam());
        naam.setBounds(50, 50, 200, 30);

        JLabel achternaam = new JLabel("Achternaam: " + profile1.getAchternaam());
        achternaam.setBounds(50, 80, 200, 30);

        JLabel leeftijd = new JLabel("Leeftijd: " + String.valueOf(profile1.getLeeftijd()));
        leeftijd.setBounds(50, 110, 200, 30);

        JLabel gewicht = new JLabel("Gewicht: " + String.valueOf(profile1.getGewicht()));
        gewicht.setBounds(50, 140, 200, 30);

        JLabel lengte = new JLabel("Lengte: " + String.valueOf(profile1.getLengte()));
        lengte.setBounds(50, 170, 200, 30);

        JButton bewerk = new JButton("bewerk");
        bewerk.setBounds(50, 200, 100, 30);

        frame.add(patientPane);
        frame.add(naam);
        frame.add(achternaam);
        frame.add(leeftijd);
        frame.add(gewicht);
        frame.add(lengte);
        frame.add(bewerk);




    }

}
