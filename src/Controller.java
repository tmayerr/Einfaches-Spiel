import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Das ist die Controller Klasse für das Spiel
 * Diese Klasse verbinden view und model und macht das Spiel
 * @author Tim Mayer
 * @version 2026-09-16
 */
public class Controller implements ActionListener {
    private Model model;
    private View view;

    public static void main(String... args){
        new Controller();
    }

    public Controller(){
        model = new Model();
        view = new View(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        if(command.equals("spielerE")){
            rundeS();
        }
        if(command.equals("button")){
            view.neueRunde();
        }
    }

    public void rundeS(){
        int zahl;
        zahl = view.getSpielerText();
        if(zahl < 1 || zahl > 9){
            return;
        }
        model.berechneComputerZahl();
        model.berechneRunde(zahl);

        view.setComputerText(model.getComputerZahl());
        view.setRundenErgebnis(ergebnis());
        view.setGesamtPunkte(model.getGesamtPunkte());
    }

    /**
     * überprüft ob er Spieler gewonnen oder verloren hat
     * @return etweder gewonnen oder verloren, oder wie viele Punkte er dazu/verloren hat
     */
    public String ergebnis(){
        if(model.hatGewonnen()){
            return "Gewonnen";
        }
        if(model.hatVerloren()){
            return "Verloren";
        }
        int punkte = model.getRundenErgebnis();
        if(punkte > 0){
            return "+" + punkte;
        }
        return String.valueOf(punkte);
    }

}
