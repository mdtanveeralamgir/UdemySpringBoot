package com.in28minutes.spring.learn_spring_framework.game;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
