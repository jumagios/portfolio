from bs4 import BeautifulSoup
# import lxml

with open('website.html', 'r', encoding="utf8") as file:
    html_as_string = file.read()

soup = BeautifulSoup(html_as_string, "html.parser")

print(soup.title)
print(soup.title.string)

print(soup.prettify())

for item in soup:
    print(item.getText())