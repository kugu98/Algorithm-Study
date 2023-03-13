#include <iostream>
#include <algorithm>
#include <set>


using namespace std;

int main()
{
	set<int> setA, setB;
	set<int> subLenA, subLenB;
	int lenA, lenB;
	
	std::cin >> lenA >> lenB;

	int input = 0;

	for (int i = 0; i < lenA; i++)
	{
		
		cin >> input;
		setA.insert(input);
	}

	for (int i = 0; i < lenB; i++)
	{
		cin >> input;
		setB.insert(input);
	}

	set_difference(setA.begin(), setA.end(), setB.begin(), setB.end(), inserter(subLenA,subLenA.begin()));
	set_difference(setB.begin(), setB.end(), setA.begin(), setA.end(), inserter(subLenB, subLenB.begin()));

	cout << subLenA.size() + subLenB.size();

	return 0;
}

