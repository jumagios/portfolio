
SHEETY_ENDPOINT = "https://api.sheety.co/a55695ea36d7a5c278807fc503ad0dde/flightDeals/prices"
import requests
from pprint import pprint

headers = {
    "Authorization": "Bearer sadsadasd21321312"
}

class DataManager:

    def __init__(self):
        self.destination_data = {}

    def get_destination_data(self):
        response = requests.get(url=SHEETY_ENDPOINT, headers=headers)
        data = response.json()
        # pprint(data)
        self.destination_data = data["prices"]

        return self.destination_data



    def update_destination_code(self):
        for city in self.destination_data:
            new_data = {
                "price": {
                    "iataCode": city["iataCode"]
                }
            }

            response = requests.put(
                url=f"{SHEETY_ENDPOINT}/{city['id']}",
                json=new_data,
                headers=headers
            )
            print(response.text)