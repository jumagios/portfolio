from tkinter import *
from quiz_brain import QuizBrain

THEME_COLOR = "#375362"


class QuizInterface:

    def __init__(self, quiz_brain: QuizBrain):
        self.quiz = quiz_brain
        self.window = Tk()
        self.window.title("Quizzler")
        self.window.config(padx=20, pady=20, background=THEME_COLOR)

        self.canvas = Canvas(width=300, height=250, bg="white")
        self.question_text = self.canvas.create_text(
            150,
            125,
            width=280,
            fill=THEME_COLOR,
            font=("Arial", 20, "italic"),
            text="aca tenes papu")
        self.canvas.grid(row=1, column=0, columnspan=2, pady=50)

        # Buttons
        cancel_image = PhotoImage(file="images/false.png")
        self.cancel_button = Button(image=cancel_image, highlightthickness=0, command=self.cancel_question)
        self.cancel_button.grid(row=2, column=0)
        confirm_image = PhotoImage(file="images/true.png")
        self.confirm_button = Button(image=confirm_image, highlightthickness=0, command=self.confirm_question)
        self.confirm_button.grid(row=2, column=1)

        # Text
        self.score_label = Label(text="Score: 0", foreground="white", background=THEME_COLOR)
        self.score_label.grid(row=0, column=1)

        self.get_next_question()

        self.window.mainloop()

    def get_next_question(self):
        self.canvas.config(bg="white")
        if self.quiz.still_has_questions():
            self.score_label.config(text=f'Score: {self.quiz.score}')
            q_text = self.quiz.next_question()
            self.canvas.itemconfig(self.question_text, text=q_text)
        else:
            self.canvas.itemconfig(self.question_text, text="You've reached the end of the quiz")
            self.cancel_button.config(state="disabled")
            self.confirm_button.config(state="disabled")

    def cancel_question(self):
        self.give_feedback(self.quiz.check_answer("False"))

    def confirm_question(self):
        is_right = self.quiz.check_answer("True")
        self.give_feedback(is_right)

    def give_feedback(self, is_right):
        if is_right:
            self.canvas.config(bg="green")
        else:
            self.canvas.config(bg="red")
        self.window.after(1000, self.get_next_question)


