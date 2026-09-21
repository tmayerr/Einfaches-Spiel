import java.util.Random;

/**
 * Das ist die Model Klasse für das Spiel
 * Diese Klasse fokusiert sich auf die Logik des Spiels
 * @author Tim Mayer
 * @version 2026-09-16
 */
public class Model {
    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public Model() {
       this.gesamtPunkte = 30;
    }

    public int getGesamtPunkte(){
        return this.gesamtPunkte;
    }

    public int getComputerZahl(){
        return this.computerZahl;
    }

    public int getRundenErgebnis(){
        return this.rundenErgebnis;
    }

    /**
     * berechnet eine zufällige Zahl von 1–9
     * für den Computer und speichert sie
     */
    public void berechneComputerZahl(){
        Random zahl = new Random();
        int zufall = zahl.nextInt(9) + 1;
        this.computerZahl = zufall;
    }

    /**
     * berechnet das Rundenergebnis (+20, +5 oder −10)
     * sowie den neuen Gesamtpunktestand und speichert diese Werte samt Spielerzahl
     * @param spielerZahl ist die eingetippte Zahl
     */
    public void berechneRunde(int spielerZahl){
        this.spielerZahl = spielerZahl;
        if(this.computerZahl == spielerZahl){
            this.gesamtPunkte += 20;
            this.rundenErgebnis = 20;
        }
        else if(this.computerZahl == spielerZahl - 1 || this.computerZahl == spielerZahl + 1){
            this.gesamtPunkte += 5;
            this.rundenErgebnis = 5;
        }
        else{
            this.gesamtPunkte -= 10;
            this.rundenErgebnis = -10;
        }
    }

    public boolean hatGewonnen(){
        return this.gesamtPunkte >= 100;
    }

    public boolean hatVerloren(){
        return this.gesamtPunkte <= 0;
    }

}
