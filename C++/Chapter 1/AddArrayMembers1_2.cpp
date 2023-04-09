#include <iostream>
using namespace std;
int sum (int n,const int s[]);
int main()
{
	int s[] = {1,2,3,4};
	cout << sum(4,s)<<endl;
}
int sum (int n,const int s[])
{
	int result = 0;
	for(int i = 0 ; i < n ; i++)
		result += s[i];
	return result;	
}
