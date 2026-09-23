import javax.swing.*;

/**
 * Das ist die View Klasse für das Spiel
 * Diese Klasse fokusiert sich auf das Desgin des Spiels
 * @author Tim Mayer
 * @version 2026-09-16
 */
public class View extends JFrame {
    private Layout layout;

    public View(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Zahlen-Gewinnspiel (v1.0)");
        setSize(700, 400);

        layout = new Layout();

        add(layout);

        setVisible(true);
    }

}
