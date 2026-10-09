#include "Configuration.h"

Configuration::Configuration()
    : appName("ECS160-HW1"), logLevel("INFO"), maxConnections(32), debugMode(true) {}

Configuration& Configuration::getInstance() {
    // ensures single initialization
    static Configuration instance;
    return instance;
}