package ru.alishev.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Neil Alishev
 */
public class JazzMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    // Для Prototype бинов не вызывается destroy-метод!
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Jazz Rhapsody";
    }
}
