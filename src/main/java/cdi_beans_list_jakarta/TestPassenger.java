package cdi_beans_list_jakarta;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
@Named("passenger")
class TestPassenger implements Test {
}
