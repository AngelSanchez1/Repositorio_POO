import numbers
from payment import Payment;

class Tarjeta(Payment):
    numbers = str;
    date = str;
    cvv = str;

    def __init__(self, id, numbers, date, cvv):
        super().__init__(id)
        self.numbers =  numbers
        self.date = date
        self.cvv = cvv