import sys
input = sys.stdin.readline

a= [[]for i in range(3)]
b=[[0 for i in range(9)] for i in range(9)]

a[1] = b
a[0].append(1)
a[0].append(2)

print(a)

