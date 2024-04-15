package instance.with_qualifiers;

/**
 * @author Radim Hanus
 */
@Business_jakarta
public class BuisnessGreeting_instance_qualifiers_jakarta implements Greeting_for_qualifiers_jakarta {
    @Override
    public String greet(String name) {
        return "Good morning " + name;
    }
}
