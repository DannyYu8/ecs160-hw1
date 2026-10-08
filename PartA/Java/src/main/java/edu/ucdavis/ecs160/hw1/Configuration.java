package edu.ucdavis.ecs160.hw1;

public class Configuration {

    private static Configuration instance;

    private String appName;
    private String logLevel;
    private int maxConnections;
    private boolean debugMode;

    private Configuration() {
        this.appName = "ECS160-HW1";
        this.logLevel = "INFO";
        this.maxConnections = 32;
        this.debugMode = true;
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }
}
