import com.clases.Tarea;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea("Tarea 1"));
        tareas.add(new Tarea("Tarea 2"));
    }
}