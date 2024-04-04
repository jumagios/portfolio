# from bs4 import BeautifulSoup
# # import lxml
#
# with open('website.html', 'r', encoding="utf8") as file:
#     html_as_string = file.read()
#
# soup = BeautifulSoup(html_as_string, "html.parser")
#
# print(soup.title)
# print(soup.title.string)
#
# print(soup.prettify())
#
# for item in soup:
#     print(item.getText())
#
# all_anchor_tags = soup.findAll("a")
#
# for tag in all_anchor_tags:
#     print(tag.getText())
#     print(tag.get("href"))
#
# heading = soup.find(name="h1", id="name")
#
#
# head_in_all = soup.find_all(class_="heading")
# print(head_in_all)
#
# h3_head = soup.find_all("h3", class_="heading")
# print(h3_head)
#
# company_url = soup.select(selector="p a")
# print(company_url)

import requests
import http.server
import socketserver

PORT = 8000  # Change port if needed

class MockHandler(http.server.BaseHTTPRequestHandler):
    def do_GET(self):
        self.send_response(500)
        self.send_header('Content-type', 'text/html')
        self.end_headers()
        self.wfile.write(b"Internal Server Error")

with socketserver.TCPServer(("", PORT), MockHandler) as httpd:
    print("Serving at port", PORT)
    # Run the mock server in a separate thread
    import threading
    server_thread = threading.Thread(target=httpd.serve_forever)
    server_thread.start()

    # Simulate client requests (replace with your actual server address)
    for i in range(10000):
        requests.get("http://localhost:8080")  # Replace with your server address

    # Stop the mock server
    httpd.shutdown()
    server_thread.join()