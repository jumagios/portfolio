from turtle import Turtle
import random
COLORS = ["red", "orange", "yellow", "green", "blue", "purple"]
STARTING_MOVE_DISTANCE = 5
MOVE_INCREMENT = 10
CARS_IN_SCREEN = 30



class CarManager():

    def __init__(self):

        self.all_cars = []
        self.car_speed = STARTING_MOVE_DISTANCE




    def generate_car(self):
        random_chance = random.randint(1, 6)
        if random_chance == 1:
            new_car = Turtle("square")
            new_car.penup()
            new_car.shapesize(1, 2)
            new_car.color(random.choice(COLORS))
            ycor = random.randint(-250, 250)
            new_car.goto(300, ycor)
            self.all_cars.append(new_car)


    def move_car(self):
        for car in self.all_cars:
            car.backward(self.car_speed)

    def speed_up(self):
        self.car_speed += MOVE_INCREMENT