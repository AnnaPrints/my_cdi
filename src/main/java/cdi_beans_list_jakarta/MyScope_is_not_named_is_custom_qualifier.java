package cdi_beans_list_jakarta;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.inject.Scope;

@Named
@ApplicationScoped
@Scope
public @interface MyScope_is_not_named_is_custom_qualifier {

}
