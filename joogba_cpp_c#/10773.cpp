#include <cstdio>
#include <stack>
#include <cstring>


int main()
{
	std::stack<int> st;
	int len = 0;
	int input = 0;
	int result=0;

	scanf_s("%d", &len);

	for (int i = 0; i < len; i++)
	{
		scanf_s("%d", &input);
		if (input != 0)
			st.push(input);
		else
			st.pop();
	}

	while(!st.empty())
	{
		result += st.top();
		st.pop();
	}
	printf("%d", result);
	return 0;
}