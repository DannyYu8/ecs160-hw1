import functools

def log(func):
    @functools.wraps(func)
    def wrapper(self, *args, **kwargs):
        class_name = self.__class__.__name__
        method_name = func.__name__

        formatted_args = []
        for a in args:
            if isinstance(a, str):
                formatted_args.append(f'"{a}"')
            else:
                formatted_args.append(str(a))
        args_str = ", ".join(formatted_args)

        print(f"[LOG] {class_name}.{method_name}({args_str})")
        return func(self, *args, **kwargs)
    return wrapper

class User():
    def get_name(self):
        pass

    def get_email(self):
        pass

    def set_email(self, email):
        pass


class AdminUser(User):
    def __init__(self, name, email):
        self._name = name
        self._email = email

    @log
    def get_name(self):
        return self._name

    @log
    def get_email(self):
        return self._email

    @log
    def set_email(self, email):
        self._email = email
