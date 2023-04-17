from turtle import Turtle
ALIGNMENT = "center"
FONT = ('Courier', 24, 'bold')

class ScoreBoard(Turtle):

    def __init__(self):
        super().__init__()
        self.score = 0
        self.hideturtle()
        self.goto(0, 260)
        self.color("white")
        self.refresh()

    def add_score(self):
        self.score += 1
        self.clear()
        self.refresh()

    def game_over(self):
        self.goto(0, 0)
        self.write(arg="GAME OVER", align=ALIGNMENT, font=FONT)
    def refresh(self):
        self.write(arg=f"Score: {self.score}", align=ALIGNMENT, font=FONT)