class Configuration:

    __instance = None

    def __init__(self):
        self.appName = "ECS160-HW1"
        self.logLevel = "INFO"
        self.maxConnections = 32
        self.debugMode = True
        Configuration.__instance = self

    @classmethod
    def get_instance(cls):
        if cls.__instance is None:
            cls()
        return cls.__instance