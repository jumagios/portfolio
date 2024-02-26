from data_manager import DataManager
from flight_search import FlightSearch
from notification_manager import NotificationManager

data_manager = DataManager()
sheet_data = data_manager.get_destination_data()
flight_search = FlightSearch()
notification_manager = NotificationManager()

if sheet_data[0]["iataCode"] == "":

    for row in sheet_data:
        row["iataCode"] = flight_search.get_code(row["city"])
    print(f"sheet_data:\n {sheet_data}")

    data_manager.destination_data = sheet_data
    data_manager.update_destination_code()


for row in sheet_data:
    if flight_search.get_price(row["iataCode"]) < row["lowestPrice"]:
        notification_manager.send_text(f"Buy now this trip: {row['Country']}")

