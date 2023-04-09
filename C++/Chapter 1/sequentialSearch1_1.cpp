#include <iostream>
using namespace std;
void seqSearch(int n,const int s[], int x, int& location);
int main()
{
	int a[] = {2,3,6,1};
	int location = 0;
	seqSearch(4,a,1,location);
	cout << location;
}
void seqSearch(int n,const int s[], int x, int& location)
{
	location = 0;
	while (location < n && s[location] != x)
		location += 1;
	if(location == n)
		location = -1;
	else
		location++;	
}