from turtle import Turtle
ALIGNMENT = "center"
FONT = ('Courier', 24, 'bold')

class ScoreBoard(Turtle):

    def __init__(self):
        super().__init__()
        self.score = 0
        with open("data.txt") as data:
            self.high_score = int(data.read())
        self.hideturtle()
        self.goto(0, 260)
        self.color("white")
        self.refresh()

    def add_score(self):
        self.score += 1
        self.refresh()

    def reset(self):
        if self.score > self.high_score:
            self.high_score = self.score
            with open("data.txt", mode="w") as file:
                file.write(f"{self.high_score}")
        self.score = 0
        self.refresh()

    def refresh(self):
        self.clear()
        self.write(arg=f"Score: {self.score} High Score {self.high_score}"
                   , align=ALIGNMENT, font=FONT)
