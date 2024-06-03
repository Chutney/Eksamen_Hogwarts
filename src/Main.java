import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<HogwartsStudent> hogwartsStudents = new ArrayList<>();
        hogwartsStudents.add(new HogwartsStudent("Noah","Aa dubble", "Gryffindor"));
        hogwartsStudents.add(new HogwartsStudent("Alex","Vanopslagh", "Hufflepuff"));
        hogwartsStudents.add(new HogwartsStudent("Hermione","Granger", "Slytherin"));
        hogwartsStudents.add(new HogwartsStudent("Robin","Madush", "Ravenclaw"));
        hogwartsStudents.add(new HogwartsStudent("The boss","Zerion", "Hufflepuff"));

        hogwartsStudents.sort(Comparator.naturalOrder());

        for(HogwartsStudent x : hogwartsStudents) {
            System.out.println(x.getFirstName() + " " + x.getLastName() + "\n" + "House: " + x.getHouse());
        }

    }

}
