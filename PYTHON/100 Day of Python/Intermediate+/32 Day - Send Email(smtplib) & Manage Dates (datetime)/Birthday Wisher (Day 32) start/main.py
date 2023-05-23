# import smtplib
#
# my_email = "pedropascalito45@gmail.com"
# password = "mtfiiycciewxrinw"
#
# with smtplib.SMTP("smtp.gmail.com") as connection:
#     connection.starttls()
#     connection.login(user=my_email, password=password)
#     connection.sendmail(
#         from_addr=my_email,
#         to_addrs="juniorpascalito@yahoo.com",
#         msg="Subject:Hello\n\nThis is the body of my email."
#     )

#
# import datetime as dt
#
# now = dt.datetime.now()
# year = now.year
# month = now.month
# day_of_week = now.weekday()
#
# date_of_birth = dt.datetime(year=1994, month=2, day=19, hour=19)
# print(date_of_birth)

import datetime as dt
import random
import smtplib

my_email = "pedropascalito45@gmail.com"
password = "mtfiiycciewxrinw"


now = dt.datetime.now()
actual_day = now.weekday() 
list_of_quotes = []
if actual_day == 6:
    with open("quotes.txt", "r") as new_file:
        list_of_quotes = [line.rstrip() for line in new_file]

    new_quote = random.choice(list_of_quotes)

    with smtplib.SMTP("smtp.gmail.com") as connection:
        connection.starttls()
        connection.login(user=my_email, password=password)
        connection.sendmail(
            from_addr=my_email,
            to_addrs="juniorpascalito@yahoo.com",
            msg=f"Subject:This is the quote of the day!\n\n{new_quote}"
        )

