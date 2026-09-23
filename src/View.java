import javax.swing.*;
import java.awt.*;

/**
 * Das ist die View Klasse für das Spiel
 * Diese Klasse fokusiert sich auf das Desgin des Spiels
 * @author Tim Mayer
 * @version 2026-09-16
 */
public class View extends JFrame {
    private Layout layout;

    public View(Controller controller){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Zahlen-Gewinnspiel (v1.0)");
        setSize(700, 400);

        layout = new Layout();

        layout.spielerText.setActionCommand("spielerE");
        layout.btnNochmal.setActionCommand("button");

        layout.spielerText.addActionListener(controller);
        layout.btnNochmal.addActionListener(controller);


        add(layout);
        setVisible(true);
    }

    /**
     * gibt die eingegebene Zahl vom Spieler zurück
     * @return die eingegebene Zahl
     */
    public int getSpielerText(){
        return Integer.parseInt(layout.spielerText.getText().trim());
    }

    /**
     * setzt die Zufallszahl in das entsprechende JLabel
     * @param rzahl ist die zufällig generierte Zahl
     */
    public void setComputerText(int rzahl){
        layout.computerText.setText(String.valueOf(rzahl));
    }

    /**
     * zeigt an ob man Verloren hat oder wie viel man plus gemacht hat
     * @param text der Text der das Ergebnis der Runde gespeichert hat
     */
    public void setRundenErgebnis(String text){
        layout.runde.setText(text);
    }

    /**
     * setzt die Punkte in das entsprechende JLabel
     * @param punkte wie viele Punkte es sind
     */
    public void setGesamtPunkte(int punkte){
        layout.gesamt.setText(String.valueOf(punkte));
    }

    /**
     * Bereitet die Oberfläche auf eine neue Runde vor
     */
    public void neueRunde(){
        layout.spielerText.setText("");
        layout.computerText.setText("");
        layout.spielerText.setEditable(true);
        layout.btnNochmal.setEnabled(false);
    }

    public void sperrenT(){
        layout.spielerText.setEditable(false);
        layout.btnNochmal.setEnabled(true);
    }

    public void farben(boolean gewonnen, boolean verloren){
        Color color;
        if(gewonnen){
            color = Color.GREEN;
        }
        else if(verloren){
            color = Color.RED;
        }
        else{
            color = Color.WHITE;
        }
        layout.runde.setBackground(color);
        layout.gesamt.setBackground(color);
    }


}
