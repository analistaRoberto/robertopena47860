import java.util.List;

public class Print {
    //method to print on screen
    public static void mostrarPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
