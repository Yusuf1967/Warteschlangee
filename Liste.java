// Generische Klasse 'Liste' für die Implementierung einer verketteten Liste
public class Liste <T> {

    // 'Erster' verweist auf das erste Element der Liste
    public KnotenListe <T> Erster;

    // 'Letzter' verweist auf das letzte Element der Liste
    public KnotenListe <T> Letzter;

    // 'Aktueller' verweist auf das aktuell ausgewählte Element (z. B. für Iteration)
    public KnotenListe <T> Aktueller;

    // 'next' ist ein zusätzliches Feld, das aktuell jedoch nicht genutzt wird
    public KnotenListe next;

    // Konstruktor für die Liste. Initialisiert alle Felder mit 'null'.
    public Liste() {
        // Keine Initialisierung im Konstruktor
    }

    // Entfernt das erste Element der Liste
    public void remove() {
        KnotenListe aktuellerKunde = Erster;

        // Wenn die Liste nicht leer ist
        if (Erster != null) {
            // Das erste Element wird entfernt, indem 'Erster' auf den Nachfolger gesetzt wird
            Erster = aktuellerKunde.getNachfolger();
        }
    }

    // Fügt ein neues Element am Ende der Liste hinzu
    public void append(T pKontent) {
        KnotenListe ContentType = Erster;

        // Wenn die Liste leer ist
        if (Erster == null) {
            // Erstellt das erste Element und setzt 'Letzter' und 'Aktueller' darauf
            Erster = new KnotenListe<>(pKontent);
            Letzter = Erster;
            Aktueller = Letzter;
        } else {
            // Geht zum letzten Element der Liste
            while (ContentType.getNachfolger() != null) {
                ContentType = ContentType.getNachfolger();
            }
            // Fügt das neue Element am Ende der Liste hinzu
            ContentType.setNachfolger(new KnotenListe<>(pKontent));
            // Aktualisiert 'Letzter' auf den neu hinzugefügten Knoten
            Letzter = ContentType.getNachfolger();
        }
    }

    // Fügt ein neues Element an der aktuellen Position in der Liste ein
    public void insert(T pContent) {
        // Überprüfen, ob wir auf den aktuellen Knoten zugreifen können
        if (hasAccess()) {
            // Erstellen eines neuen Knotens mit dem angegebenen Inhalt
            KnotenListe<T> neuerKnoten = new KnotenListe<>(pContent);

            // Wenn der aktuelle Knoten der erste Knoten in der Liste ist (Aktueller ist 'Erster')
            if (Aktueller == Erster) {
                // Der neue Knoten wird der neue erste Knoten
                neuerKnoten.setNachfolger(Erster);  // Der Nachfolger des neuen Knotens wird der alte erste Knoten
                Erster = neuerKnoten;               // Der neue Knoten wird nun der erste Knoten
            } else {
                // Der aktuelle Knoten ist nicht der erste, also müssen wir den vorherigen Knoten finden
                KnotenListe<T> vorherigerKnoten = Erster;

                // Durch die Liste iterieren, bis wir den Knoten vor dem aktuellen Knoten finden
                while (vorherigerKnoten.getNachfolger() != Aktueller) {
                    vorherigerKnoten = vorherigerKnoten.getNachfolger();
                }

                // Der neue Knoten wird zwischen dem vorherigen Knoten und dem aktuellen Knoten eingefügt
                vorherigerKnoten.setNachfolger(neuerKnoten); // Der vorherige Knoten zeigt jetzt auf den neuen Knoten
                neuerKnoten.setNachfolger(Aktueller);       // Der neue Knoten zeigt auf den aktuellen Knoten
            }

            // Der aktuelle Knoten wird nun der neue Knoten
            Aktueller = neuerKnoten;
        }
    }


    // Überprüft, ob die Liste leer ist
    public boolean isEmpty() {
        return Erster == null;
    }

    // Überprüft, ob auf das aktuelle Element zugegriffen werden kann
    public boolean hasAccess() {
        return Aktueller != null;
    }

    // Setzt den 'Aktuellen' Knoten auf den nächsten Knoten der Liste
    public void next() {
        Aktueller = Aktueller.getNachfolger();
    }

    // Gibt den Inhalt des 'next'-Knotens zurück (dies wird jedoch derzeit nicht korrekt genutzt)
    public T getNext() {
        return (T) next;
    }

    // Setzt den 'Aktuellen' Knoten auf den ersten Knoten der Liste
    public void toFirst() {
        Aktueller = Erster;
    }

    // Setzt den 'Aktuellen' Knoten auf den letzten Knoten der Liste
    public void toLast() {
        Aktueller = Letzter;
    }
}