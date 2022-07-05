package level4.lesson10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringUsage {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("level4.lesson10");

        context.getBean(Message.class);

    }
}
