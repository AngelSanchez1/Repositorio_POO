from user import User
from payment import Payment
from efectivo import Efectivo
from car import Car
from account import Account

if __name__ == '__main__':
    print("Hola mundo")

    car = Car("BCSPN-69", Account("Angelc","ASDASDWEFE","ASsa@hgasgh2","ASDASD21231"))

    car2 = Car("JDK-689", Account("Anecode","ASASD","ASsa@hgasgh2","ASDASD21231"))

    pago =Efectivo(1)

    user1 =User("Angel", "INE", "asda@dbdhsdh2", "wqe12241s")
 
    print(vars(car))
    print(vars(car.driver))
    print(vars(car2))
    print(vars(car2.driver))
    print(vars(pago))
    print(vars(user1))