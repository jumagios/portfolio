from turtle import Turtle
ALIGNMENT = "center"
L_SCORE_POS = (-100, 200)
R_SCORE_POS = (100, 200)
FONT = ('Courier', 80, 'normal')

class ScoreBoard(Turtle):

    def __init__(self):
        super().__init__()
        self.score_l = 0
        self.score_r = 0
        self.hideturtle()
        self.penup()
        self.color("white")
        self.refresh()

    def add_score(self, player):
        if player == "l":
            self.score_l += 1
        else:
            self.score_r += 1
        self.clear()
        self.refresh()

    def game_over(self):
        self.goto(0, 0)
        self.write(arg="GAME OVER", align=ALIGNMENT, font=FONT)
    def refresh(self):
        self.goto(L_SCORE_POS)
        self.write(arg=f"{self.score_l}", align=ALIGNMENT, font=FONT)
        self.goto(R_SCORE_POS)
        self.write(arg=f"{self.score_r}", align=ALIGNMENT, font=FONT)