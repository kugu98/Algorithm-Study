#include <cstdio>
#include <stack>
#include <cstring>

bool IsVPS(const char* str)
{
	int len = strlen(str);
	std::stack<char> st;
	for (int i = 0; i < len; i++)
	{
		if (str[i] == '(')
			st.push('(');
		else if (str[i] == ')' && !st.empty() && st.top() == '(')
			st.pop();
		else
			st.push(')');
	}
	if (st.empty())
		return true;
	return false;
}

int main()
{
	std::stack<char> stack;
	int len = 0;
	char input[50];
	bool* result;

	scanf_s("%d", &len);
	result = new bool[len];
	
	for (int i = 0; i < len; i++)
	{
		scanf_s("%s", input,sizeof(input));
		result[i] = IsVPS(input);
	}

	for (int i = 0; i < len; i++)
	{
		if (result[i])
			printf("YES\n");
		else
			printf("NO\n");
	}

	delete[] result;
	return 0;
}