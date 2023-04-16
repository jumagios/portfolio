import turtle
from turtle import Turtle, Screen, colormode
import random

timmy = Turtle()
colours = ["medium slate blue", "red", "medium violet red", "lime", "medium blue", "spring green", "dark orange",
           "dodger blue"]
positions = [90, 180, 270, 0]

#
# for _ in range(50):
#     timmy.pendown()
#     timmy.forward(5)
#     timmy.penup()
#     timmy.forward(5)
# starter_number = 3
# full_circle = 360
# timmy.pensize(4)
# for _ in range(8):
#     for shape in range(starter_number):
#         timmy.forward(100)
#         timmy.color(random.choice(colours))
#         angle = full_circle / starter_number
#         timmy.right(angle)
#     starter_number += 1
#

timmy.pensize(2)
timmy.speed(10)
colormode(255)

def random_color():
    r = random.randint(0, 255)
    g = random.randint(0, 255)
    b = random.randint(0, 255)
    color_tuple = (r, g, b)
    return color_tuple


# for _ in range(200):
#     timmy.color(random_color())
#     timmy.forward(40)
#     timmy.right(random.choice(positions))
#
# screen = Screen()
# screen.exitonclick()

#
# for _ in range(72):
#     timmy.color(random_color())
#     timmy.circle(100)
#     timmy.right(5)



def draw_spirograph(gap):
    for _ in range(int(360 / gap)):
        timmy.color(random_color())
        timmy.circle(100)
        timmy.setheading(timmy.heading() + gap)

draw_spirograph(5)
