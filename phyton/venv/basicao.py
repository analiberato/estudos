####printa no terminal
print('oi')

####retorna o tipo
type(1)

####RETONAR UM INT
10 // 5

####RETORNA UM FLOAT
10/5

####IF
total = 101

if total > 100:
    print('greater than 100')
elif total <100:
    print('Other condition')
else:
    print('Opsss')


####DICT
cars = {}
cars['corola'] = "red"
cars['fit'] = "green"
cars['320'] = "black"

for key, value in cars.items():
    print(key + " = " + value)


####FOR
list = [2, 4, 6, 8, 10]

for item in list[0:3]:
    if item > 2:
        print("grater than 2")

list2 = ["Wesley", "Silva"]

for name in list2:
    if not name == "Wesley":
        print(name)


####WHILE
number = 5

while number < 10:
    print(number)
    number += 1
    '''
    if number == 8:
        print("Break!!!")
        break
        '''
else:
    print("not true anymore")


####FUNCTIONS
def call_numbers():
    for number in range(0,10):
        print(number)

def call_numbers_with_limit(limit):
    list = range(0,10)
    for number in range(limit):
        print(number)

def calculator(x=10, y=15):
    return x-y

result = calculator(5)
print("Result is", result)
