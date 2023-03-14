#include <cstdio>
int k = 0;
int num = 0;
void merge(int* arr, int p, int q, int r) {
	static int save_count = 0;
	int i = p;
	int j = q + 1;
	int t = 0;
	int* tmp = new int[r+1];
	while (i <= q && j <= r) {
		if (arr[i] <= arr[j])
		{
			tmp[t++] = arr[i++]; // tmp[t] < -A[i]; t++; i++;
		}
		else
		{
			tmp[t++] = arr[j++]; // tmp[t] < -A[j]; t++; j++;
		}
	}
	while (i <= q) // 왼쪽 배열 부분이 남은 경우
		tmp[t++] = arr[i++];
	while (j <= r)  // 오른쪽 배열 부분이 남은 경우
		tmp[t++] = arr[j++];
	i = p;
	t = 0;
	while (i <= r)  // 결과를 A[p..r]에 저장 여기서 보면댐
	{
		save_count++;
		if (save_count == k)
			num = tmp[t];
		arr[i++] = tmp[t++];
	}
	delete[] tmp;
}

void merge_sort(int* arr, int p, int r)
{
	if (p < r)
	{
		int q = (p + r) / 2;
		merge_sort(arr, p, q);
		merge_sort(arr, q + 1, r);
		merge(arr, p, q, r);

	}
}


int main()
{
	int n;
	int* arr;
	scanf("%d %d", &n, &k);
	arr = new int[n];
	for (int i = 0; i < n; i++)
	{
		scanf("%d", &arr[i]);
	}

	merge_sort(arr, 0, n-1);


	if (num == 0)
		printf("-1");
	else
		printf("%d", num);
	delete[] arr;
}