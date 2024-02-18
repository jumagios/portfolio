import requests
from datetime import datetime, timedelta

STOCK = "TSLA"
COMPANY_NAME = "Tesla Inc"

STOCK_ENDPOINT = "https://www.alphavantage.co/query"
STOCK_API_KEY = "AZA08SDD3D0ZT64V"
NEWS_ENDPOINT = "https://newsapi.org/v2/everything"
NEWS_API_KEY = "a478c44b0ffa419a819c62b52342c262"
TELEGRAM_API_KEY = "6303625572:AAGB0eDO2wQ1mOA5NwHaBARVMrJYTq7qB0A"
telegram_bot_chat_id = '893694925'


today = datetime.today().date()
yesterday = today - timedelta(days=1)
day_before = yesterday - timedelta(days=1)


def telegram_bot(bot_message):
    bot_token = TELEGRAM_API_KEY
    bot_chatID = telegram_bot_chat_id
    send_text = 'https://api.telegram.org/bot' + bot_token + '/sendMessage?chat_id=' + bot_chatID + '&parse_mode=Markdown&text=' + bot_message

    r = requests.get(send_text)

    return r.json()

def get_difference_price():
    stock_params = {
        "function": "TIME_SERIES_DAILY",
        "symbol": STOCK,
        "apikey": STOCK_API_KEY,
    }

    response = requests.get(url=STOCK_ENDPOINT, params=stock_params)
    data = response.json()['Time Series (Daily)']
    data_list = [value for (key, value) in data.items()]

    today_data_closing_price = float(data_list[0]['4. close'])
    yesterday_data_closing_price = float(data_list[1]['4. close'])
    difference = ((today_data_closing_price - yesterday_data_closing_price) / yesterday_data_closing_price) * 100

    if abs(difference) >= 5:
        get_news()
    else:
        telegram_bot(get_news())

def get_news():
    parameters = {
        "q": '"Tesla Inc." and TSLA',
        "from": day_before,
        "to": today,
        "sortBy": "relevancy",
        "apiKey": NEWS_API_KEY,
    }
    response = requests.get(url=NEWS_ENDPOINT, params=parameters)

    data = response.json()["articles"]
    for article in data:
        return f'{STOCK}:\nHeadline: {article["title"]} \nBrief: {article["description"]}'



get_difference_price()

