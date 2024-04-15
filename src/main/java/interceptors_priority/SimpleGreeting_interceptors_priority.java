package interceptors_priority;

/**
 * @author Radim Hanus
 */
@MyInterceptorBinding_interceptors_priority
public class SimpleGreeting_interceptors_priority implements Greeting_interceptors_priority {
    private String greet;

    public String getGreet() {
        return greet;
    }

    public void setGreet(String greet) {
        this.greet = greet;
    }
}
