##################### Extra Hard Starting Project ######################

# 1. Update the birthdays.csv

# 2. Check if today matches a birthday in the birthdays.csv
import pandas as pd
import datetime
import random
import os
import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText

# Read the CSV file
df = pd.read_csv('birthdays.csv')

# Get the current date
current_date = datetime.date.today()

# Convert the year, month, and day columns to datetime format
df['birthday'] = pd.to_datetime(df[['year', 'month', 'day']])

# Filter the DataFrame to find matches
matches = df[df['birthday'].dt.month == current_date.month]
matches = matches[matches['birthday'].dt.day == current_date.day]

# 3. If step 2 is true, pick a random letter from letter templates and replace the [NAME] with the person's actual name from birthdays.csv

# Directory containing letter templates
letter_template_dir = "letter_templates/"

# List letter templates in the directory
letter_templates = []
for filename in os.listdir(letter_template_dir):
    if filename.endswith(".txt"):
        with open(os.path.join(letter_template_dir, filename), 'r') as file:
            letter_templates.append(file.read())

# Pick a random letter template
letter_template = random.choice(letter_templates)

# 4. Send the letter generated in step 3 to that person's email address.


# Replace [NAME] with the person's actual name and send the email
if not matches.empty:
    for _, row in matches.iterrows():
        name = row['name']
        email = row['email']
        personalized_letter = letter_template.replace('[NAME]', name)

        # Set up the SMTP server
        smtp_server = "smtp.gmail.com"
        smtp_port = 587
        smtp_username = "pedropascalito45@gmail.com"
        smtp_password = "mtfiiycciewxrinw"

        # Create the email message
        message = MIMEMultipart()
        message['From'] = smtp_username
        message['To'] = email
        message['Subject'] = 'Birthday Greetings'
        message.attach(MIMEText(personalized_letter, 'plain'))

        # Send the email
        with smtplib.SMTP(smtp_server, smtp_port) as connection:
            connection.starttls()
            connection.login(smtp_username, smtp_password)
            connection.send_message(message)

        print(f"Email sent to {name} at {email}")
else:
    print("No birthdays today.")

