import requests
from datetime import datetime
import os

WEIGHT_KG = 74
HEIGHT_CM = 187
AGE = 30

APP_ID = os.environ.get('APP_ID')
API_KEY = os.environ.get('API_KEY')
TOKEN_BEARER_SHEET = f"Bearer {os.environ.get('TOKEN_BEARER_SHEET')}"

exercise_endpoint = "https://trackapi.nutritionix.com/v2/natural/exercise"
sheet_endpoint = "https://api.sheety.co/a55695ea36d7a5c278807fc503ad0dde/workoutTracking/workouts"

exercise_text = input("Tell me which exercises you did: ")

headers = {
    "x-app-id": APP_ID,
    "x-app-key": API_KEY,
}

parameters = {
    "query": exercise_text,
    "weight_kg": WEIGHT_KG,
    "height_cm": HEIGHT_CM,
    "age": AGE
}

response = requests.post(exercise_endpoint, json=parameters, headers=headers)
result = response.json()

headers = {
    "Authorization": TOKEN_BEARER_SHEET,
}

today_date = datetime.now().strftime("%d/%m/%Y")
now_time = datetime.now().strftime("%X")

for exercise in result["exercises"]:
    sheet_inputs = {
        "workout": {
            "date": today_date,
            "time": now_time,
            "exercise": exercise["name"].title(),
            "duration": exercise["duration_min"],
            "calories": exercise["nf_calories"]
        }
    }

    sheet_response = requests.post(sheet_endpoint, json=sheet_inputs, headers=headers)

    print(sheet_response.text)
