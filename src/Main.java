import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Task> taskList1 = new ArrayList<>();  // Erstellen einer leeren Liste für Task
        taskList1.add(new Task(1, "Aufgabe Nr. 1", "Aufgabe Nr. 1 umsetzen")); // Fügen Sie die Aufgabe zur Liste hinzu
        taskList1.add(new Task(2, "Aufgabe Nr. 2", "Aufgabe Nr. 2 umsetzen"));
        taskList1.add(new Task(3, "Aufgabe Nr. 3", "Aufgabe Nr. 3 umsetzen"));

        List<Task> taskList2 = List.of( // Erstellen einer Task-Liste direkt mit Daten
                new Task(4, "Aufgabe Nr. 4", "Aufgabe Nr. 4 umsetzen"),
                new Task(5, "Aufgabe Nr. 5", "Aufgabe Nr. 5 umsetzen"),
                new Task(6, "Aufgabe Nr. 6", "Aufgabe Nr. 6 umsetzen"),
                new Task(7, "Aufgabe Nr. 7", "Aufgabe Nr. 7 umsetzen")
        );

        List<String> technologies1 = List.of("java", "go", "mysql");
        List<String> technologies2 = List.of("java", "c++", "mysql", "go");

        List<Programmer> programmers = List.of(
                new Programmer("Jack", technologies1),
                new Programmer("Lena", technologies2),
                new Programmer("Nick", List.of("java", "go", "mysql"))
        );

        // Ausgabe aller Programmierer
        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }

        System.out.println("-------------------    Allen wurde Aufgabe Nr. 1 hinzugefügt");

        // Fügen Sie Aufgabe Nr. 1 allen Programmierern hinzu
        for (Programmer programmer : programmers) {
            programmer.addTask(taskList1.get(0));
        }

        // Ausgabe nach dem Hinzufügen von Aufgabe Nr. 1
        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }

        System.out.println("-------------------    Lena wurde Aufgabe Nr. 2 hinzugefügt");
        programmers.get(1).addTask(taskList1.get(1));  // Fügen Sie Aufgabe Nr. 2 nur Lena hinzu

        // Ausgabe nach dem Hinzufügen von Aufgabe Nr. 2
        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }

        // Überprüfen, ob Lena Aufgabe Nr. 2 hat
        System.out.println("Hat Lena Aufgabe Nr. 2?");
        System.out.println(programmers.get(1).checkTaskByNumber(2));

        // Überprüfen, ob Jack Aufgabe Nr. 2 hat
        System.out.println("Hat Jack Aufgabe Nr. 2?");
        System.out.println(programmers.get(0).checkTaskByNumber(2));
    }
}
