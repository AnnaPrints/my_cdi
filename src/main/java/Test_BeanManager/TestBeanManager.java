package Test_BeanManager;

import interceptors.Greeting_jakarta;

import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;
import javax.inject.Inject;
import javax.naming.InitialContext;
import java.util.Set;

public class TestBeanManager {
    @Inject
    private BeanManager bm;

    public void testCurrent() throws Exception {
        // Second way to get BeanManager: current CDI container
        BeanManager bm1 = CDI.current().getBeanManager();
        BeanManager bm2 = InitialContext.doLookup("java:comp/BeanManager");
        Set<Bean<?>> beans = bm.getBeans(Greeting_jakarta.class);
    }
}
