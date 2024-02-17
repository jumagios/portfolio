import os
import requests

api_key = os.environ.get("OMW_API_KEY")
omw_endpoint = "https://api.openweathermap.org/data/2.5/forecast"
telegram_bot_api_key = os.environ.get("TG_BOT_API_KEY")
telegram_bot_chat_id = '893694925'

pamarameters = {
    "appid": api_key,
    "lat": "-34.625430",
    "cnt": 4,
    "lon": "-34.625430",
}

response = requests.get(url=omw_endpoint, params=pamarameters)
response.raise_for_status()
weather_data = response.json()['list']


def telegram_bot_sendtext(bot_message):
    bot_token = telegram_bot_api_key
    bot_chatID = telegram_bot_chat_id
    send_text = 'https://api.telegram.org/bot' + bot_token + '/sendMessage?chat_id=' + bot_chatID + '&parse_mode=Markdown&text=' + bot_message

    r = requests.get(send_text)

    return r.json()


will_rain = False
for hour_data in weather_data:
    condition_code = hour_data['weather'][0]['id']
    if condition_code < 700:
        will_rain = True

if will_rain:
    telegram_bot_sendtext("It's going to rain today, bring an umbrella.")
