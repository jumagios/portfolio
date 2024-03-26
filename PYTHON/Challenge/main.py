# To take the next step, we kindly request that you solve the following code challenge as part of our evaluation process:


#
# - Start with the string "CitricSheep".

string = "CitricSheep"
# - Use the ASCII values of each character in the string and generate a list of these values.

list_of_ASCII = [ord(char) for char in string]
# - Multiply each value in the list by the number of characters in the string.

multiplied_values = [len(string) * value for value in list_of_ASCII]
# - Find the sum of all numbers in the resulting list.

total = sum(multiplied_values)
# - Use this sum to generate a SHA256 hash.

s_total = str(total).encode('utf-8')
print(s_total)
import hashlib
hash = hashlib.sha256(s_total)
print(hash)
# - Convert this hash to a hexadecimal string.

hexa = hash.hexdigest()
print(hexa)