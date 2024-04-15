package cdi_beans_list_jakarta;

import javax.inject.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({FIELD,METHOD,PARAMETER,TYPE})
@Qualifier
public @interface DbType {


}
