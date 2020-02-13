count = int(input("Enter size of list: "))
import random
f = open("sortingFile.txt", "w")
for x in range (count):
    num = random.randint(-10,10)*5
    f.write(str(num)+"\n")
f.close()
