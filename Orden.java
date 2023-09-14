import java.util.List;

public class Orden {
   
    //order by name
    public static void ordenarPorName(List<Person> persons) {
        persons.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
    }
    // order por apellido
    public static void ordenarPorApellido(List<Person> persons) {
        persons.sort((p1, p2) -> p1.getApellido().compareTo(p2.getApellido()));
    }
    // reverse order by apellidos
    public static void ordenarInversamentePorApellido(List<Person> persons) {
        persons.sort((p1, p2) -> p2.getApellido().compareTo(p1.getApellido()));
    }
}
