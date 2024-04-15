package instance;

import javax.enterprise.context.RequestScoped;

/**
 * @author Arun Gupta
 * @author Radim Hanus
 */
@RequestScoped
public class FancyGreeting_instance_jakarta implements Greeting_instance_jakarta {
	@Override
	public String greet(String name) {
		return "Nice to meet you, hello" + name;
	}
}
