my_list = [1,2,3]
for item in my_list:
    print(item)
    continue

i = 0
while i < len(my_list):
    print(my_list[i])
    i +=1
    continue

while True:
    response = input('say something: ')
    if(response == 'bye'):
        break
     