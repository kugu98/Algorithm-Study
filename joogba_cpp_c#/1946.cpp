#include <cstdio>
#include <vector>
#include <algorithm>



int main()
{
	int testcase = 0;
	int volunteer = 0;

	int answerArr[20]{ 0, };

	scanf_s("%d", &testcase);
	for (int i = 0; i < testcase; i++)
	{
		std::vector<std::pair<int, int>> vvec;
		scanf_s("%d", &volunteer);
		
		for (int j = 0; j < volunteer; j++) // input
		{
			int inputDoc, inputMeet;
			scanf_s("%d %d", &inputDoc, &inputMeet);
			vvec.push_back({ inputDoc, inputMeet });
		}

		std::sort(vvec.begin(), vvec.end());

		int meetCut = 0;
		answerArr[i] += 1;

		for (int j = 1; j < volunteer; j++)
		{
			if (vvec[j].second < vvec[meetCut].second) // 컷보다 순위가 낮으면
			{
				meetCut = j;
				answerArr[i] += 1;
			}
		}
		printf("%d\n", answerArr[i]);
	}
}