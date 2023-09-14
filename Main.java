import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Lista de personas
        List<Person> persons = new ArrayList<>();
        //Agregar personas a la lista
        persons.add(new Person("Roberti", "Peña"));
        persons.add(new Person("Mario", "Fuentes"));
        persons.add(new Person("Alejanro", "Castillo"));
        persons.add(new Person("Alexaners", "INoguera"));
        persons.add(new Person("Alucard", "Tempest"));

        //Imprimir personas por Nombres
        System.out.println("Orden por nombre");
        Orden.ordenarPorName(persons);
        Print.mostrarPersons(persons);

        System.out.println("-------");

        //Imprimir personas por Apellidos
        System.out.println("Orden apellido");
        Orden.ordenarPorApellido(persons);
        Print.mostrarPersons(persons);

        System.out.println("-------");

        //Imprimir personas por Apellidos Invertidos
        System.out.println("Orden invertido por apellido");
        Orden.ordenarInversamentePorApellido(persons);
        Print.mostrarPersons(persons);
    }
}