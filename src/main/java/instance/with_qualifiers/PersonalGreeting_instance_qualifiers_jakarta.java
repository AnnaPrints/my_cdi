package instance.with_qualifiers;

/**
 * @author Radim Hanus
 */
@Personal_jakarta
public class PersonalGreeting_instance_qualifiers_jakarta implements Greeting_for_qualifiers_jakarta {
    @Override
    public String greet(String name) {
        return "Good morning " + name;
    }
}
