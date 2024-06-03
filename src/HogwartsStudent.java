public class HogwartsStudent implements Comparable<HogwartsStudent> {

    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName, String house) {
        this.firstName = firstName;
        this.lastName = lastName;
        setHouse(house);
    }

    public void setHouse(String house) {
        String[] acceptedHouses = {"ravenclaw","slytherin","hufflepuff","gryffindor"};

        for (String acceptedHouse : acceptedHouses) {
            if(acceptedHouse.equalsIgnoreCase(house)) {
                this.house = house;
                return;
            }
        }

        throw new RuntimeException("This is not a correct House!");
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getHouse() {
        return house;
    }

    @Override
    public int compareTo(HogwartsStudent o) {
        return lastName.compareTo(o.getLastName());
    }
}
