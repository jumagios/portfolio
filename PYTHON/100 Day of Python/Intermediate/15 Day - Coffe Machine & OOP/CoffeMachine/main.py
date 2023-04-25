MENU = {
    "espresso": {
        "ingredients": {
            "water": 50,
            "coffee": 18,
        },
        "cost": 1.5,
    },
    "latte": {
        "ingredients": {
            "water": 200,
            "milk": 150,
            "coffee": 24,
        },
        "cost": 2.5,
    },
    "cappuccino": {
        "ingredients": {
            "water": 250,
            "milk": 100,
            "coffee": 24,
        },
        "cost": 3.0,
    }
}

resources = {
    "water": 300,
    "milk": 200,
    "coffee": 100,
}

coins = {
    "quarter": 0.25,
    "dime": 0.10,
    "nickle": 0.05,
    "penny": 0.01,
}

is_on = True
money = 0


def report():
    print(f"Water: {resources.get('water')}")
    print(f"Milk: {resources.get('milk')}")
    print(f"Coffee: {resources.get('coffee')}")
    print(f"Money: ${money}")


def resource_enough(drink_ingredients):
    for item in drink_ingredients:
        if drink_ingredients[item] >= resources[item]:
            print(f"Sorry there is not enough {item}")
            return False
        return True


def money_enough(coffee, money_u):
    price_coffee = coffee['cost']
    if money_u >= price_coffee:
        give_change(coffee, money_u)
        discount_resources(coffee["ingredients"])
        return True
    else:
        print("Not enough money")
        return False


def insert_coins():
    print("Please insert coins.")

    total = int(input("How many quarters?:")) * 0.25
    total += int(input("How many dimes?:")) * 0.10
    total += int(input("How many nickles?:")) * 0.05
    total += float(input("How many pennies?:")) * 0.01

    return total


def give_change(coffee, coins_u):
    global money
    price_coffee = coffee['cost']
    change = round(coins_u - price_coffee, 2)
    money = money + price_coffee
    print(f"Here is ${change} in change")


def discount_resources(drink_ingredient):

    for i in resources:
        if i in drink_ingredient:
            resources[i] = resources[i] - drink_ingredient[i]


while is_on:
    choice = input("What would you like? (espresso/latte/cappuccino):\n")

    if choice == "off":
        is_on = False
    elif choice == "report":
        report()
    else:
        drink = MENU[choice]
        if resource_enough(drink["ingredients"]):
            coins = insert_coins()
            if money_enough(drink, coins):
                print(f"Here is your {choice}! Enjoy")
