N = int(input())
person = []
for i in range(N):
    age, name = input().split()
    person.append([int(age), name, i])

person.sort(key=lambda x: (x[0], x[2]))

for per in person:
    print(per[0], per[1], end='\n')