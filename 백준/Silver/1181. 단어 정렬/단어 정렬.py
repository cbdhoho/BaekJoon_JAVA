N = int(input())
words = []
for _ in range(N):
    words.append(input())

words = list(set(words))
words.sort(key=lambda x: (len(x), x))

print(*words, sep='\n')