package inspections_by_assigning_value_to_injected_field;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Bar {
    @Inject
    private Foo foo = new Foo();


}
