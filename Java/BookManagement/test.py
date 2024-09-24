n = int(input())
sum_even = 0
sum_odd = 0

for i in range(1, n + 1):
    if i % 2 == 0:
        sum_even += i
        if i == n or i == n - 1:
            print(i)
        else:
            print(i, end=" ")
print(sum_even)

for i in range(1, n + 1):
    if i % 2 != 0:
        sum_odd += i
        if i == n or i == n - 1:
            print(i)
        else:
            print(i, end=" ")
print(sum_odd)