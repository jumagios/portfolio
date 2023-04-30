numbers = [1, 2, 3]

# List comprehension
new_numbers = [n + 1 for n in numbers]

# String as List
name = "Angela"
letter_list = [letter for letter in name]

# Range as List
range_list = [num * 2 for num in range(1, 5)]

# Conditional List Comprehension
names = ["Alex", "Beth", "Caroline", "Dave", "Eleanor", "Freddie"]
short_names = [name for name in names if len(name) < 5]
long_names_upper = [name.upper() for name in names if len(name) > 5]

# Coding Rooms
# Ex 1
numbers = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
# 🚨 Do Not Change the code above 👆

# Write your 1 line code 👇 below:

squared_numbers = [number * number for number in numbers]

# Write your code 👆 above:

print(squared_numbers)

# Ex 2
numbers = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
# 🚨 Do Not Change the code above

# Write your 1 line code 👇 below:

result = [number for number in numbers if number % 2 == 0]

# Write your code 👆 above:

print(result)

# Ex 3
with open("file1.txt") as file1:
    list_file1 = file1.readlines()
with open("file2.txt") as file2:
    list_file2 = file2.readlines()

result = [int(number) for number in list_file1 if number in list_file2]

# Write your code above 👆

print(result)

# Dictionary Comprehension
import random

students_scores = {student: random.randint(1, 100) for student in names}

passed_students = {student: score for (student, score) in students_scores.items() if score >= 60}

#Ex 1
sentence = "What is the Airspeed Velocity of an Unladen Swallow?"
# Don't change code above 👆

# Write your code below:

new_list = sentence.split()

result = {word: len(word) for word in new_list}


print(result)


#Ex 2
weather_c = {
    "Monday": 12,
    "Tuesday": 14,
    "Wednesday": 15,
    "Thursday": 14,
    "Friday": 21,
    "Saturday": 22,
    "Sunday": 24,
}
# 🚨 Don't change code above 👆


# Write your code 👇 below:

weather_f = {key: (value * 1.8) + 32 for (key, value) in weather_c.items()}


print(weather_f)

