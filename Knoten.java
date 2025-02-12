// Generische Klasse 'Knoten' für die Implementierung einer verketteten Liste
public class Knoten <T> {

    // Das private Feld 'Kontent' speichert den Inhalt des Knotens, welcher ein generischer Typ 'T' ist
    private T Kontent;

    // Das private Feld 'nachfolger' verweist auf den nächsten Knoten in der Liste (Verkettung)
    private Knoten nachfolger;

    // Konstruktor, um einen neuen Knoten mit einem bestimmten Inhalt zu erstellen
    public Knoten(T pKontent){
        // Setzt den Inhalt des Knotens auf den übergebenen Wert
        Kontent = pKontent;

        // Der Knoten hat anfangs keinen Nachfolger, daher wird 'null' gesetzt
        nachfolger = null;
    }

    // Setzt den Nachfolger des aktuellen Knotens auf den übergebenen Knoten
    public void setNachfolger(Knoten pKnoten) {
        this.nachfolger = pKnoten;
    }

    // Gibt den Nachfolger des aktuellen Knotens zurück
    public Knoten getNachfolger() {
        return nachfolger;
    }

    // Gibt den Inhalt des Knotens zurück
    public T getKontent(){
        return Kontent;
    }
}
