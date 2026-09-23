import javax.swing.*;
import java.awt.*;

/**
 * Das ist die View Klasse für das Spiel
 * Diese Klasse fokusiert sich auf das Desgin des Spiels
 * @author Tim Mayer
 * @version 2026-09-16
 */

public class Layout extends JPanel {
    JLabel rundeTitel  = new JLabel("Rundenergebnis:", SwingConstants.CENTER);
    JLabel gesamtTitel = new JLabel("Gesamtpunkte:", SwingConstants.CENTER);
    JLabel runde = new JLabel("Tippe eine Zahl von 1 bis 9", SwingConstants.CENTER);
    JLabel gesamt = new JLabel("Gesamtpunkte: 30", SwingConstants.CENTER);
    JLabel deineZahl = new JLabel("Deine Zahl:", SwingConstants.CENTER);
    JLabel computer = new JLabel("Computer:", SwingConstants.CENTER);

    JTextField spielerText = new JTextField();
    JTextField computerText = new JTextField();

    JButton btnNochmal = new JButton("Noch einmal!");



    public Layout(){
        setLayout(new BorderLayout(5, 5));

        //North Layout:
        JPanel oben = new JPanel(new GridLayout(3, 2, 5, 5));
        oben.add(rundeTitel);
        oben.add(gesamtTitel);
        //ist standartmäßig auf false --> heißt durchsichtig
        runde.setOpaque(true);
        runde.setBackground(Color.WHITE);
        runde.setFont(new Font("Arial", Font.BOLD, 20));

        oben.add(runde);
        gesamt.setOpaque(true);
        gesamt.setBackground(Color.WHITE);
        gesamt.setFont(new Font("Arial", Font.BOLD, 20));

        oben.add(gesamt);
        oben.add(deineZahl);
        oben.add(computer);

        add(oben, BorderLayout.NORTH);

        //Center Layout
        JPanel mitte = new JPanel(new GridLayout(1, 2));
        spielerText.setFont(new Font("Arial", Font.BOLD, 50));
        spielerText.setHorizontalAlignment(JTextField.CENTER);
        mitte.add(spielerText);

        computerText.setFont(new Font("Arial", Font.BOLD, 50));
        computerText.setHorizontalAlignment(JTextField.CENTER);
        computerText.setEditable(false); //damit man es nicht mehr bearbeiten kann
        computerText.setBackground(Color.WHITE);
        mitte.add(computerText);

        add(mitte, BorderLayout.CENTER);

        //South Layout
        JPanel unten = new JPanel();
        btnNochmal.setEnabled(false);
        unten.add(btnNochmal);

        add(unten, BorderLayout.SOUTH);
    }
}
