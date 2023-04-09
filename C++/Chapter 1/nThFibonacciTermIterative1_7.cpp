#include <iostream>
using namespace std;

int fib2(int n)
{
	int f[n+1];
	f[0] = 0;
	if(n > 0)
	{
		f[1] = 1;
		for(int i = 2; i < n+1; i++)
			f[i] = f[i-1] + f[i-2];
	}
	return f[n];
}
int main()
{
	cout << fib2(5);
	
}

