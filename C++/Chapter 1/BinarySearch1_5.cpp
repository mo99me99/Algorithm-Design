#include <iostream>
using namespace std;

void binSearch(int n, const int s[], int x, int& location)
{
	int low = 0, high = n-1, mid;
	location = -1;
	while(low <= high && location == -1)
	{
		mid = (low + high) / 2;
		if(x == s[mid])
			location = mid;
		else if(x < s[mid])
			high = mid - 1;
		else
			low = mid + 1;
	}
}
int main()
{
	int a[] = {1,2,3,4}; // must be nondecreasing order array
	int location;
	binSearch(4,a,4,location);
	cout << location;
}