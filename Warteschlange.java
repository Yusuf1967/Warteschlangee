// Generische Klasse 'Warteschlange' für die Implementierung einer Warteschlange (Queue)
public class Warteschlange <T> {

    // 'erster' verweist auf das erste Element in der Warteschlange (First-In)
    private Knoten erster;

    // 'letzter' verweist auf das letzte Element in der Warteschlange (Last-In)
    private Knoten letzter;

    // Konstruktor der Warteschlange, initialisiert die Warteschlange als leer
    public Warteschlange() {
        erster = null;
        letzter = null;
    }

    // Gibt den Inhalt des ersten Elements in der Warteschlange zurück
    public T gibErsten() {
        // Es wird der Inhalt des ersten Knotens zurückgegeben
        return (T) erster.getKontent();
    }

    // Entfernt das erste Element aus der Warteschlange (First-Out)
    public void entfernen() {
        Knoten aktuellerKunde = erster;

        // Wenn die Warteschlange nicht leer ist
        if (erster != null) {
            // Der erste Knoten wird entfernt, indem 'erster' auf das nächste Element gesetzt wird
            erster = aktuellerKunde.getNachfolger();
        }
    }

    // Fügt ein neues Element am Ende der Warteschlange hinzu
    public void einfuegen(T pKontent) {
        // Wir beginnen bei dem ersten Knoten
        Knoten ContentType = erster;

        // Wenn die Warteschlange leer ist
        if (erster == null) {
            // Der erste Knoten wird mit dem neuen Inhalt erstellt und gleichzeitig auch der letzte Knoten
            erster = new Knoten<>(pKontent);
            letzter = erster;
        }
        else {
            // Wenn die Warteschlange nicht leer ist, gehen wir zum letzten Knoten
            while (ContentType.getNachfolger() != null) {
                ContentType = ContentType.getNachfolger();
            }
            // Der Nachfolger des letzten Knotens wird auf den neuen Knoten gesetzt
            ContentType.setNachfolger(new Knoten<>(pKontent));
            // Der neue Knoten wird zum letzten Knoten
            letzter = ContentType.getNachfolger();
        }
    }
}
