import requests
from datetime import datetime
import smtplib
import time

MY_LAT = -34.632754 # Your latitude
MY_LONG = -58.480502 # Your longitude
MY_EMAIL = "pedropascalito45@gmail.com"
MY_PASSWORD = "mtfiiycciewxrinw"

def within_5_degrees():
    response = requests.get(url="http://api.open-notify.org/iss-now.json")
    response.raise_for_status()
    data = response.json()

    iss_latitude = float(data["iss_position"]["latitude"])
    iss_longitude = float(data["iss_position"]["longitude"])

    #Your position is within +5 or -5 degrees of the ISS position.

    lat_diff = abs(MY_LAT - iss_latitude)
    lon_diff = abs(MY_LONG - iss_longitude)
    return lat_diff <= 5 and lon_diff <= 5

def if_currently_dark():
    parameters = {
        "lat": MY_LAT,
        "lng": MY_LONG,
        "formatted": 0,
    }

    response = requests.get("https://api.sunrise-sunset.org/json", params=parameters)
    response.raise_for_status()
    data = response.json()
    sunrise = int(data["results"]["sunrise"].split("T")[1].split(":")[0])
    sunset = int(data["results"]["sunset"].split("T")[1].split(":")[0])

    time_now = datetime.now()

    if time_now.hour <= sunrise or time_now.hour >= sunset:
        return True
    else:
        return False




#If the ISS is close to my current position

# and it is currently dark
while True:
    time.sleep(60)
    if within_5_degrees() and if_currently_dark():

        with smtplib.SMTP("smtp.gmail.com") as connection:
            connection.starttls()
            connection.login(MY_EMAIL, MY_PASSWORD)
            connection.sendmail(
                from_addr=MY_EMAIL,
                to_addrs="juangimenezos@hotmail.com",
                msg="ISS OVER HEAD"
            )



# Then send me an email to tell me to look up.
# BONUS: run the code every 60 seconds.



