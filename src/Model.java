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

    public void berechneComputerZahl(){

    }

    public void berechneRunde(int spielerZahl){

    }

    public boolean hatGewonnen(){
        return true;
    }

    public boolean hatVerloren(){
        return true;
    }

}
