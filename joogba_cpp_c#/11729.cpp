#include <cstdio>
#include <cmath>

void hanoi(int num, int src, int dest, int temp)
{
    if (num == 1)
    {
        printf("%d %d\n", src, dest);
    }
    else
    {
        hanoi(num - 1, src , temp,dest);
        printf("%d %d\n", src, dest);
        hanoi(num - 1, temp, dest,src);
    }

}

int main()
{
    int n = 0;
    scanf_s("%d", &n);
    printf("%d\n", (int)pow(2,n)-1);
    hanoi(n, 1, 3, 2);
}