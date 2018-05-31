public class PersonRunner {
    public static void main (String[] args) {
        Person person = new Person();

        person.setMoving(new Running());
        person.executeMoving();

        person.setMoving(new Staying());
        person.executeMoving();

        person.setMoving(new Walking());
        person.executeMoving();
    }
}
