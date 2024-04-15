package bug188142;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.Serializable;

@ApplicationScoped
class B implements IB, Serializable {
    @Inject
    B(A a) {}
}
