from account import Account

class Driver(Account):
    def __init__(self, nombre, document, email, password):
        super().__init__(nombre, document, email, password)