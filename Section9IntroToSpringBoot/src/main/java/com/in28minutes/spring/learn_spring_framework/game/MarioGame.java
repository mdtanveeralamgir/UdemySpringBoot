package com.in28minutes.spring.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{
    public void up() {
        System.out.println("Mario Game up");
    }
    public void down() {
        System.out.println("Mario Game down");
    }
    public void left() {
        System.out.println("Mario Game left");
    }
    public void right() {
        System.out.println("Mario Game right");
    }
}
