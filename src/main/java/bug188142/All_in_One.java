package bug188142;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.Serializable;


public class All_in_One {
}




class A1 {}

interface IB1{}

@ApplicationScoped
class B1 implements IB1, Serializable {
    @Inject
    B1(A1 a) {}
}

class C1 {
    @Inject B1 b; // IntelliJ shows error but works in Weld
}
