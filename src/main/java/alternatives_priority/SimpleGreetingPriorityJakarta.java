package alternatives_priority;

import javax.enterprise.inject.Alternative;

/**
 * @author Arun Gupta
 * @author Radim Hanus
 */
@Alternative
public class SimpleGreetingPriorityJakarta implements Greeting_priority_jakarta {
    @Override
    public String greet(String name) {
        return "Hello " + name;
    }
}
