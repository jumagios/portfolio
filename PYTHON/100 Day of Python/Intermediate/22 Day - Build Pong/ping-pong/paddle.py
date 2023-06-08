from turtle import Turtle


class Paddle(Turtle):

    def __init__(self, position):
        super().__init__()
        self.color("white")
        self.penup()
        self.hideturtle()
        self.shape("square")
        self.position = position

        self.shapesize(5, 1)
        self.goto(position)
        self.showturtle()

    # def up(self):
    #     new_y = self.ycor() + 20
    #     self.goto(self.xcor(), new_y)
    #
    # def down(self):
    #     new_y = self.ycor() - 20
    #     self.goto(self.xcor(), new_y)


    def up(self):
        if self.heading() != 90:  self.setheading(90)
        self.forward(25)


    def down(self):
        if self.heading() != 270:  self.setheading(270)
        self.forward(25)
