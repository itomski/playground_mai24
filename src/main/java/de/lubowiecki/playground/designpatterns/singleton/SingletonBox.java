package de.lubowiecki.playground.designpatterns.singleton;

public class SingletonBox { // Eager-Singleton

    private String content;

    private static SingletonBox instance = new SingletonBox();

    private SingletonBox() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static SingletonBox getInstance() {
        return instance;
    }
}
