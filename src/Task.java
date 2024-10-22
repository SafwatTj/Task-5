public class Task {
    private int number;
    private String title;
    private String description;

    // Konstruktor
    public Task(int number, String title, String description) {
        this.number = number;
        this.title = title;
        this.description = description;
    }

    // Überschreiben der toString-Methode zur schönen Ausgabe der Aufgabe
    @Override
    public String toString() {
        return String.format("%02d. %s [%s]", number, title, description);
    }

    // Getter für die Nummer der Aufgabe
    public int getNumber() {
        return number;
    }

}
