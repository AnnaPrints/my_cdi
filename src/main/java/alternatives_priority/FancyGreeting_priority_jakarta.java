package alternatives_priority;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

/**
 * @author Arun Gupta
 * @author Radim Hanus
 */
@Priority(1000)
@Alternative
public class FancyGreeting_priority_jakarta implements Greeting_priority_jakarta {
    @Override
    public String greet(String name) {
        return "Nice to meet you, hello" + name;
    }
}
