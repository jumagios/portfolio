##################### Extra Hard Starting Project ######################

# 1. Update the birthdays.csv

# 2. Check if today matches a birthday in the birthdays.csv
import datetime as dt
import pandas as pd

now = dt.datetime.now()
actual_day = now.strftime("%d").replace('0', '')
actual_month = now.strftime("%m").replace('0', '')
df = pd.read_csv('birthdays.csv')
all_days = df.day.to_list()
all_months = df.month.to_list()
for _ in range(len(all_days)):
    if actual_day in all_days and actual_month in all_months:
        print("si hay cumple")
    else:
        print("no hay")


# 3. If step 2 is true, pick a random letter from letter templates and replace the [NAME] with the person's actual name from birthdays.csv

# 4. Send the letter generated in step 3 to that person's email address.




