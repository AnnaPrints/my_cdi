package alternatives_priority;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;

/**
 * @author Radim Hanus
 */
@Priority(3000)
public class ProducerMethodGreeting_priority_jakarta {

    @Produces
    @Alternative
    public Greeting_priority_jakarta getGreeting() {
        return new SimpleGreetingPriorityJakarta();
    }
}
