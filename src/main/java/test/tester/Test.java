package test.tester;

import javax.annotation.PostConstruct;

public interface Test {


    void doSomething();

    @PostConstruct
    default void initFirst() {
        System.out.println("first init() called in Test interface");
    }

    @PostConstruct
    default void initSecond() {
        System.out.println("second init() called in Test interface");
    }

    @PostConstruct
    default void initThirdTime() {
        System.out.println("third init() called in Test interface");
    }
}
