## Part A

For Part A, I cannot implement the Singleton design pattern completely in Python because Python has a privacy limitation. First, Python does not enforce string access control even though we used name mangling (__instance) to hide the instance variable. Additionally, if the user were to catch and suppress the exception, they can still bypass the private modifier by directly invoking the Configuration() constructor or by accessing the mangled name directly such as _Configuration__instance.


## Part B

For Part B, yes, there is a disadvantage to using Python's decorator annotation over implementing the pattern myself because using Python's @log syntax applies the decorator at definition time. This would not be ideal because every single instance of AdminUser would be forced to log its method calls since this statically couples the logging behavior to the class itself. However, if I were to implement the pattern myself, I would apply the decoration at runtime instead. This would leave other instances of the same class unchanged since the OOP pattern would allow me to wrap specific instances of a class when needed.
