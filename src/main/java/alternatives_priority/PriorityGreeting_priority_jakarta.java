package alternatives_priority;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

/**
 * @author Radim Hanus
 */
@Priority(2000)
@Alternative
public class PriorityGreeting_priority_jakarta implements Greeting_priority_jakarta {
    @Override
    public String greet(String name) {
        return "Hey " + name + " I should be selected since I've got the highest priority !";
    }
}
