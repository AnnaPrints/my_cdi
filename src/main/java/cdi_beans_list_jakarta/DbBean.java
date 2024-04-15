package cdi_beans_list_jakarta;

@DbType
public class DbBean {
    public String greet(String name) {
        return "Hi, " + name + "!";
    }
}