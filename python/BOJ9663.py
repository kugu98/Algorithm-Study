import sys
import copy
input = sys.stdin.readline

n = int(input())

a = [0] * 1000

def check(l,i,j):
    for k in range(n):
        a[l][i][k] = 1
        a[l][k][j] = 1
    abs_num = abs(i-j)
    q = n-abs_num
    for w in range(q):
        if i >= j:
            a[l][abs_num+w][w] = 1
        else:
            a[l][w][abs_num+w] = 1
    sum = i + j
    if sum >= n:
        result = 2*n - sum -1
        x = sum - (n-1)
        y = sum -x
    else:
        result = sum + 1
        x = 0
        y = sum
    
    for i in range(result):
        a[l][x+i][y-i] = 1


def turn(m,v):
    global count_result,check_count
    for j in range(v,n):
        for i in range(n):
            if v == (n-1) and m[i] == 0:
                count_result += 1
                continue
            
            if m[i] == 0:
                check_count += 1
                a[check_count] = copy.deepcopy(a[check_count-1])
                check(check_count,j,i)
                turn(a[check_count][j+1],j+1)
                check_count -= 1
            if i == (n-1):
                return

count_result = 0
check_count = 0
for i in range(n):
    if n == 1:
        count_result = 1
        break
    
    a1 = [[0 for i in range(n)]for i in range(n)]
    check_count += 1
    a[check_count] = a1
    check(check_count,0,i)
    turn(a[check_count][1],1)

print(count_result)