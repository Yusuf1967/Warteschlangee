// Generische Klasse 'Stack', die einen Stack (Stapel) für beliebige Datentypen implementiert
public class Stack<T> {

    // Das private Feld 'top' verweist auf das oberste Element im Stack (der erste Knoten)
    private KnotenStack<T> top;

    // Innere statische Klasse 'KnotenStack', die die Knoten im Stack repräsentiert
    private static class KnotenStack<T> {
        // Der Inhalt des Knotens (kann beliebiger Typ T sein)
        T content;

        // Der Verweis auf den nächsten Knoten im Stack
        KnotenStack<T> next;

        // Konstruktor für einen Knoten, der den Inhalt setzt und den Verweis auf den nächsten Knoten auf 'null' setzt
        public KnotenStack(T content) {
            this.content = content;
            this.next = null;
        }
    }

    // Konstruktor der Stack-Klasse, initialisiert den Stack als leer (top = null)
    public Stack() {
        top = null;
    }

    // Gibt den Inhalt des obersten Elements des Stacks zurück
    // Falls der Stack leer ist, wird eine Nachricht ausgegeben und 'null' zurückgegeben
    public T getContent() {
        if (top == null) {
            System.out.println("Stack ist leer!");
            return null;
        }
        return top.content;
    }

    // Fügt ein neues Element oben auf den Stack hinzu
    public void add(T content) {
        // Erstellt einen neuen Knoten mit dem angegebenen Inhalt
        KnotenStack<T> neuerKnoten = new KnotenStack<>(content);

        // Der 'next'-Verweis des neuen Knotens zeigt auf das aktuelle oberste Element
        neuerKnoten.next = top;

        // Das neue Element wird jetzt das oberste Element
        top = neuerKnoten;
    }

    // Entfernt das oberste Element des Stacks
    public void remove() {
        if (top == null) {
            System.out.println("Stack ist leer!");
        } else {
            // Das oberste Element wird entfernt, indem der 'top'-Verweis auf das nächste Element zeigt
            top = top.next;
        }
    }

    // Prüft, ob der Stack leer ist
    public boolean isEmpty() {
        return top == null;
    }
}