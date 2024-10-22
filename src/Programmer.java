import java.util.ArrayList;
import java.util.List;


public class Programmer {

    private String name;
    private List<Task> tasks;
    private List<String> technologies;

    // Konstruktor
    public Programmer(String name, List<String> technologies) {
        this.name = name;
        this.technologies = technologies;
        this.tasks = new ArrayList<>();
    }

    // Überschreiben der toString-Methode zur Ausgabe von Programmierer-Informationen
    @Override
    public String toString() {
        return name + " " + technologies + " Aufgaben=" + tasks;
    }

    // Methode zum Hinzufügen einer Aufgabe
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Gibt die Liste der Aufgaben zurück
    public List<Task> getTasks() {
        return tasks;
    }

    // Überprüft, ob der Programmierer eine Aufgabe mit einer bestimmten Nummer hat
    public boolean checkTaskByNumber(int number) {
        for (Task task : tasks) {
            if (task.getNumber() == number) {
                return true;
            }
        }
        return false;
    }
}
