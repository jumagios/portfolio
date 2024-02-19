import requests
from datetime import datetime

USERNAME = "juanmgo"
TOKEN = "dsa89d67as75f7sa86dsa7"
GRAPH_ID = "graph1"

pixela_endpoint = "https://pixe.la/v1/users"

user_params = {
    "token": TOKEN,
    "username": USERNAME,
    "agreeTermsOfService": "yes",
    "notMinor": "yes",
}

# response = requests.post(pixela_endpoint, json=user_params)
# print(response.text)


graph_endpoint = f'{pixela_endpoint}/{USERNAME}/graphs'

graph_config = {
    "id": GRAPH_ID,
    "name": "Cycling Graph",
    "unit": "Km",
    "type": "float",
    "color": "ajisai",
}

headers = {
    "X-USER-TOKEN": TOKEN
}

# response = requests.post(url=graph_endpoint, json=graph_config, headers=headers)
# print(response.text)

pixel_endpoint = f'{pixela_endpoint}/{USERNAME}/graphs/{GRAPH_ID}'

today = datetime.now()
another_day = datetime(year=2024, month=2, day=18)

pixel_data = {
    "date": another_day.strftime("%Y%m%d"),
    "quantity": input("How many Kilometers did you cycle today?"),
}

response = requests.post(url=pixel_endpoint, headers=headers, json=pixel_data)
print(response.text)

# pixel_update_endpoint = f'{pixela_endpoint}/{USERNAME}/graphs/{GRAPH_ID}/{another_day.strftime("%Y%m%d")}'
#
# pixel_update_date = {
#     "quantity": "2.45"
# }

# response = requests.put(url=pixel_update_endpoint, headers=headers, json=pixel_update_date)
# print(response.text)

# response = requests.delete(url=pixel_update_endpoint, headers=headers)
# print(response.text)