from ast import Str


class Account:
    id = int
    nombre = Str
    document = str
    email = str
    password = str

    def __init__(self, nombre, document, email, password):
        self.nombre = nombre
        self.document = document
        self.email = email
        self.password = password