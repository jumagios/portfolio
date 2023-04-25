import time
from turtle import Screen
from player import Player
from car_manager import CarManager
from scoreboard import Scoreboard

screen = Screen()
screen.setup(width=600, height=600)
screen.tracer(0)
player = Player()
cars = CarManager()
scoreboard = Scoreboard()
screen.listen()
screen.onkey(player.up, "Up")


game_is_on = True
while game_is_on:
    time.sleep(0.1)
    screen.update()

    cars.generate_car()
    cars.move_car()

    for car in cars.all_cars:
        if player.distance(car) < 25:
            scoreboard.game_over()
            game_is_on = False

    if player.finishline():
        player.go_to_start()
        cars.speed_up()
        scoreboard.level_up()


screen.exitonclick()