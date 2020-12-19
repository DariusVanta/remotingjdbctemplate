package ro.ubb.jdbctemplate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.ubb.jdbctemplate.ui.ClientConsole;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        "ro.ubb.jdbctemplate.config"
                );

        ClientConsole clientConsole = context.getBean(ClientConsole.class);
        clientConsole.runConsole();

        System.out.println("bye");
    }
}
