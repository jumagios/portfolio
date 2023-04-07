
# Game of which instagram account has more followers
# first the computer choose a random account from the data and compare it
# with another random asking the user if this las has more
# follorwers than the first
# if user guess right add one point to the score and pass to next question
# another vs random with the last winner
# when the user guess wrong the game is over and the score is showed
from art import logo, vs
from game_data import data
import random
import os


a_choice = random.choice(data)
b_choice = random.choice(data)
if a_choice == b_choice:
  a_choice = random.choice(data)
score = 0

def get_random():
  return random.choice(data)
  

def get_vs(a_char, b_char):
  print(logo)
  print(f"Compare A: {a_char['name']}, a {a_char['description']} from {a_char['country']}")
  print()
  print(vs)
  print()
  print(f"Against B: {b_char['name']}, a {b_char['description']} from {b_char['country']}")

def greater_than(guess, a, b):
  a_follower_count = a['follower_count']
  b_follower_count = b['follower_count']

  if a_follower_count >= b_follower_count:
    return guess == 'a'
  elif b_follower_count >= a_follower_count:
    return guess == 'b'
  

  

get_vs(a_choice, b_choice)
guess = input("Who has more followers? Type 'A' or 'B'\n").lower()
while greater_than(guess, a_choice, b_choice):
  os.system("cls")
  score = score + 1
  print(f"You're right! Current score: {score}")
  a_choice = b_choice
  b_choice = get_random()
  get_vs(a_choice, b_choice)
  guess = input("Who has more followers? Type 'A' or 'B'\n").lower()


if not greater_than(guess, a_choice, b_choice):
  os.system("cls")
  print(logo)
  print(f"Sorry, that's wrong. Final score: {score}")

  
  

