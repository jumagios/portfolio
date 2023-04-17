from turtle import Screen
from paddle import Paddle
from ball import Ball
from scoreboard import ScoreBoard
import time

screen = Screen()
screen.setup(800, 600)
screen.title("PPong")
screen.bgcolor("black")

r_paddle = Paddle((350, 0))
l_paddle = Paddle((-350, 0))
scoreboard = ScoreBoard()
ball = Ball()

# Keyboard listening
screen.listen()
screen.onkey(r_paddle.up, "Up")
screen.onkey(r_paddle.down, "Down")
screen.onkey(l_paddle.up, "w")
screen.onkey(l_paddle.down, "s")

# Game loop
game_is_on = True
while game_is_on:
    time.sleep(0.1)
    screen.update()
    ball.move()



    # Border checking
    if ball.ycor() > 285 or ball.ycor() < -285:
        ball.bounce_y()

    # paddle misses
    if ball.xcor() > 385:
        ball.reset_position()
        scoreboard.add_score('l')
        scoreboard.refresh()

    if ball.xcor() < -385:
        ball.reset_position()
        scoreboard.add_score('r')
        scoreboard.refresh()


    # Detect collision with paddle
    if (ball.distance(r_paddle) < 40 and ball.xcor() > 320) or (ball.distance(l_paddle) < 40 and ball.xcor() < -320):
        ball.increase_speed()
        ball.bounce_x()

































screen.exitonclick()