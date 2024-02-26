
import requests
import os

TELEGRAM_API_KEY = os.envirob.get('tg_key')
telegram_bot_chat_id = os.environ.get('tg_id')


class NotificationManager:

    def __init__(self):
        self.bot = "Telegram Bot"

    def send_text(self, bot_message):
        send_text = f'https://api.telegram.org/bot{TELEGRAM_API_KEY}/sendMessage?chat_id={telegram_bot_chat_id}&parse_mode=Markdown&text={bot_message}'

        r = requests.get(send_text)

        return r.json()