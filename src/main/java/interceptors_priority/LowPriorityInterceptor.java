package interceptors_priority;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * Interceptors with smaller priority values are called first.
 *
 * @author Radim Hanus
 */
@Interceptor
@MyInterceptorBinding_interceptors_priority
@Priority(Interceptor.Priority.APPLICATION + 200)
public class LowPriorityInterceptor {
    @AroundInvoke
    public Object log(InvocationContext context) throws Exception {
        Object[] parameters = context.getParameters();
        if (parameters.length > 0 && parameters[0] instanceof String) {
            String param = (String) parameters[0];
            parameters[0] = param + " Nice to meet you.";
            context.setParameters(parameters);
        }
        return context.proceed();
    }
}
