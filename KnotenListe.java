// Generische Klasse 'KnotenListe', die einen Knoten in einer Liste darstellt
public class KnotenListe <T> {

    // Der Inhalt des Knotens (der Wert des Knotens)
    private T Content;

    // Der Verweis auf den nächsten Knoten in der Liste
    private KnotenListe nachfolger;

    // Ein weiteres Feld für den "nächsten" Wert, was möglicherweise nicht zur Verkettung gehört, aber extra für andere Zwecke verwendet werden kann
    private T next;

    // Konstruktor, der einen neuen Knoten mit dem angegebenen Inhalt erstellt
    public KnotenListe(T pKontent){
        Content = pKontent;
        nachfolger = null;  // Anfangs hat der Knoten keinen Nachfolger
    }

    // Setzt den Nachfolger dieses Knotens auf den angegebenen Knoten
    public void setNachfolger(KnotenListe pKnoten) {
        this.nachfolger = pKnoten;
    }

    // Gibt den Nachfolger des aktuellen Knotens zurück
    public KnotenListe getNachfolger() {
        return nachfolger;
    }

    // Gibt den Inhalt dieses Knotens zurück
    public T getContent() {
        return Content;
    }

    // Setzt den Inhalt des Knotens auf den angegebenen Wert
    public void setContent(T content) {
        Content = content;
    }

    // Setzt den 'next'-Wert des Knotens (möglicherweise für andere Zwecke, nicht zwingend für Verkettung)
    public void setNext(T next) {
        this.next = next;
    }

    // Gibt den 'next'-Wert dieses Knotens zurück
    public T getNext() {
        return next;
    }
}
