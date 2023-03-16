package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.config.AppConfig;
import test.tester.Test;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Test test = context.getBean(Test.class);
        System.out.println(test.getClass());
    }
}
