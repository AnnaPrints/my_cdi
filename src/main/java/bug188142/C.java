package bug188142;

import javax.inject.Inject;

public class C {
    @Inject
    B b; // IntelliJ shows error but works in Weld
}
