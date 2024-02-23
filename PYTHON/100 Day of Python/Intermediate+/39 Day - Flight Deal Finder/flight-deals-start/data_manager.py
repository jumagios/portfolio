SHEETY_ENDPOINT = "https://api.sheety.co/a55695ea36d7a5c278807fc503ad0dde/flightDeals/prices"
import requests
from pprint import pprint


class DataManager:

    def __init__(self):
        self.destination_data = {}

    def get_destination_data(self):
        response = requests.get(url=SHEETY_ENDPOINT)
        data = response.json()
        self.destination_data = data["prices"]
        pprint(data)
        return self.destination_data


