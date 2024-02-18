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


## STEP 1: Use https://newsapi.org/docs/endpoints/everything
# When STOCK price increase/decreases by 5% between yesterday and the day before yesterday then print("Get News").
# HINT 1: Get the closing price for yesterday and the day before yesterday. Find the positive difference between the two prices. e.g. 40 - 20 = -20, but the positive difference is 20.
# HINT 2: Work out the value of 5% of yerstday's closing stock price.


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
        get_news()
        telegram_bot("Hello WOrld")


## STEP 2: Use https://newsapi.org/docs/endpoints/everything
# Instead of printing ("Get News"), actually fetch the first 3 articles for the COMPANY_NAME. 
# HINT 1: Think about using the Python Slice Operator

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
        print(f'Headline: {article["title"]}')
        print(f'Brief: {article["description"]}')



get_difference_price()


## STEP 3: Use telegram bot
# Send a separate message with each article's title and description to your bot.
# HINT 1: Consider using a List Comprehension.







# Optional: Format the SMS message like this:
"""
TSLA: 🔺2%
Headline: Were Hedge Funds Right About Piling Into Tesla Inc. (TSLA)?. 
Brief: We at Insider Monkey have gone over 821 13F filings that hedge funds and prominent investors are required to file by the SEC The 13F filings show the funds' and investors' portfolio positions as of March 31st, near the height of the coronavirus market crash.
or
"TSLA: 🔻5%
Headline: Were Hedge Funds Right About Piling Into Tesla Inc. (TSLA)?. 
Brief: We at Insider Monkey have gone over 821 13F filings that hedge funds and prominent investors are required to file by the SEC The 13F filings show the funds' and investors' portfolio positions as of March 31st, near the height of the coronavirus market crash.
"""
