import turtle
import pandas

screen = turtle.Screen()
screen.title("U.S. States Game")
img = "blank_states_img.gif"
screen.addshape(img)
us_img = turtle.Turtle()
us_img.shape(img)
state_word = turtle.Turtle()
state_word.hideturtle()
state_word.penup()

data = pandas.read_csv("50_states.csv")
all_states = data.state.to_list()
number_of_states = len(all_states)
correct = []
missing_states = []

while len(correct) < 50:

    answer_state = screen.textinput(title=f"{len(correct)}/{number_of_states} States correct",
                                    prompt="What's another state's name?").title()

    if answer_state == "Exit":
        break
    if answer_state in all_states:
        state_x = int(data[data.state == answer_state]["x"].iloc[0])
        state_y = int(data[data.state == answer_state]["y"].iloc[0])
        state_word.setposition(state_x, state_y)
        state_word.write(arg=answer_state)
        correct.append(answer_state)



for states in all_states:
    if states not in correct:
        missing_states.append(states)

df = pandas.DataFrame(missing_states)
df.to_csv("states_to_learn.csv")


