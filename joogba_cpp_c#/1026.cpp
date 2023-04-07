#include <cstdio>
#include <vector>
#include <algorithm>

bool decs(int a, int b) { return a > b; }

int main()
{
	std::vector<int> A;
	std::vector<int> B;

	int N = 0;
	int answer = 0;
	scanf_s("%d", &N);

	for (int i = 0; i < N; i++)
	{
		int input;
		scanf_s("%d", &input);
		A.push_back(input);
	}
	for (int i = 0; i < N; i++)
	{
		int input;
		scanf_s("%d", &input);
		B.push_back(input);
	}

	sort(A.begin(), A.end(), decs);
	sort(B.begin(), B.end());

	for (int i = 0; i < N; i++)
		answer += A[i] * B[i];

	printf("%d\n", answer);
	return 0;
}