import colorgram
from turtle import Turtle, Screen, colormode
import random

leo = Turtle()
colormode(255)
rgb_colors = []
screen = Screen()

# this way we can put the turtle in the corner
screen.setworldcoordinates(-1, -1, screen.window_width() - 1, screen.window_height() - 1)


colors = colorgram.extract('dot.jpg', 12)

for _ in colors:
    r = _.rgb.r
    g = _.rgb.g
    b = _.rgb.b
    new_tuple = (r, g, b)
    rgb_colors.append(new_tuple)

leo.hideturtle()

def draw(space, x, y):
    for i in range(x):
        for j in range(y):

            # Random color from rgb
            leo.color(random.choice(rgb_colors))

            # Dot
            leo.dot(20)


            # Distance for another dot
            leo.forward(space)
        leo.backward(space * y)

        # Direction
        leo.right(270)
        leo.forward(space)
        leo.left(270)


leo.penup()
draw(50, 10, 10)





screen.exitonclick()