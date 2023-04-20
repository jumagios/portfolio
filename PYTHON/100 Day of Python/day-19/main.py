import random
from turtle import Turtle, Screen

screen = Screen()

# def move_forwards():
#     leo.forward(30)
# def move_backwards():
#     leo.backward(30)
# def counter_clockwise():
#     leo.left(5)
# def clockwise():
#     leo.right(5)
#
# def reset_screen():
#     screen.resetscreen()
#
#
# screen.listen()
# screen.onkey(key="w", fun=move_forwards)
# screen.onkey(key="s", fun=move_backwards)
# screen.onkey(key="a", fun=counter_clockwise)
# screen.onkey(key="d", fun=clockwise)
# screen.onkey(key="c", fun=reset_screen)

screen.setup(width=500, height=400)
is_race_on = False
user_bet = screen.textinput(title="Make your bet", prompt="Which turtle will win the race? Enter a color:")
colors = ["red", "orange", "yellow", "green", "blue", "purple"]
turtles = []
number_start = 60
for _ in range(0, 6):
    new_turtle = Turtle(shape="turtle")
    new_turtle.color(colors[_])
    new_turtle.penup()
    new_turtle.goto(x=-230, y=number_start)
    number_start -= 30
    turtles.append(new_turtle)

if user_bet:
    is_race_on = True

while is_race_on:

    for turtle in turtles:
        if turtle.xcor() > 230:
            is_race_on = False
            winning_color = turtle.pencolor()
            if winning_color == user_bet:
                print(f"You've won! The {winning_color} turtle is the winner!")
            else:
                print(f"You've lost! The {winning_color} turtle is the winner!")

        rand_distance = random.randint(0, 10)
        turtle.forward(rand_distance)

screen.exitonclick()
