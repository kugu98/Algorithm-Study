#include <cstdio>
#include <stack>
#include <cstring>
#include <queue>
#include <deque>
int main()
{
	std::stack<int> st;
	int len = 0;

	int* arr;
	int f[1000001] = { 0, }; // index : number / value : count
	int* resultarr;

	scanf_s("%d", &len);
	arr =		new int[len] {0, };
	resultarr = new int[len] {0, };

	for (int i = 0; i < len; i++) // 숫자 입력
	{
		scanf_s("%d", &arr[i]);
		f[arr[i]] += 1;
	}		

	for (int i = len-1; i >= 0;i--) // 스택에 저장 오른쪽수가 더작으면 안넣음
	{
		while (!st.empty() && f[st.top()] <= f[arr[i]])
			st.pop();

		if (st.empty())
			resultarr[i] = -1;
		else
			resultarr[i] = st.top();

		st.push(arr[i]);
	}

	for (int i = 0; i <len ; i++)
		printf("%d ", resultarr[i]);

	

	delete[] arr;
	delete[] resultarr;
	return 0;
}