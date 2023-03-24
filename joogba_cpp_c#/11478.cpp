#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
int main()
{
	std::string str = std::string();
	std::cin >> str;
	std::vector<std::string> vec1 = std::vector<std::string>();

	for (int i = 0; i < str.length(); i++) // 갯수
	{
		for (int j = 0; j < str.length() - i; j++) // 시작위치
		{
			vec1.push_back(str.substr(j, i + 1));
		}
	}
	std::sort(vec1.begin(), vec1.end());
	std::vector<std::string>::iterator eit = std::unique(vec1.begin(), vec1.end());
	vec1.erase(eit, vec1.end());
	std::cout << vec1.size();

}