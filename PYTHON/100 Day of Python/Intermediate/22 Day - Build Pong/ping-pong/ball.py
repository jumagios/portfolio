from turtle import Turtle
STARTER_SPEED = 5
INCREASE_SPEED = 2
class Ball(Turtle):

    def __init__(self):
        super().__init__()
        self.color("green")
        self.shape("circle")
        self.penup()
        self.dx = STARTER_SPEED
        self.dy = STARTER_SPEED

    def move(self):
        new_x = self.xcor() + self.dx
        new_y = self.ycor() + self.dy
        self.goto(new_x, new_y)

    def bounce_y(self):
        self.dy *= -1

    def bounce_x(self):
        self.dx *= -1

    def reset_position(self):
        self.hideturtle()
        self.goto(0, 0)
        self.showturtle()
        self.bounce_x()
        self.dx = STARTER_SPEED
        self.dy = STARTER_SPEED

    def increase_speed(self):
        self.dx *= INCREASE_SPEED
        self.dy *= INCREASE_SPEED

