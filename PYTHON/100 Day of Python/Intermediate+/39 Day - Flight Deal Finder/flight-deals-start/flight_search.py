TEQUILA_ENDPOINT = "https://api.tequila.kiwi.com"
TEQUILA_API_KEY = "8lE6aPMCBTHC7wKmnzk720xuQt62lqEF"
import requests
from pprint import pprint


class FlightSearch:

    def __init__(self):
        self.flightSearch = {}

    def get_code(self, city_name):
        # print("get destination codes triggered")
        location_endpoint = f"{TEQUILA_ENDPOINT}/locations/query"
        headers = {"apikey": TEQUILA_API_KEY}
        query = {"term": city_name, "location_types": "city"}
        response = requests.get(url=location_endpoint, headers=headers, params=query)
        results = response.json()["locations"]
        code = results[0]["code"]
        return code

    def get_price(self, city_name):
        location_endpoint = f"{TEQUILA_ENDPOINT}/search"
        headers = {"apikey": TEQUILA_API_KEY}
        query = {"fly_from": "EZE", "fly_to": f"{city_name}", "date_from": "25/02/2024", "date_to": "25/08/2024"}
        response = requests.get(url=location_endpoint, headers=headers, params=query)
        res = response.json()["data"][0]['price']
        self.flightSearch = response.json()["data"][0]
        return res

