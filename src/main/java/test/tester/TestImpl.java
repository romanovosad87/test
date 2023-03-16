package test.tester;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class TestImpl implements Test {
    @Override
    public void doSomething() {
        System.out.println("Called in TestImpl class");
    }

    @PostConstruct
    void initTestImpl() {
        System.out.println("first init() was called in TestImpl class");
    }

    @PostConstruct
    void initSecondTestImpl() {
        System.out.println("second init() was called in TestImpl class");
    }
}
