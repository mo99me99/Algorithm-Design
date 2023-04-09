#include <iostream>
using namespace std;
void exchangeSort(int n,int s[]);
void exchange(int& a, int& b);
void printArr(int n,int s[]);
int main()
{
	int a[] = {2,3,6,1};
	exchangeSort(4,a);
	printArr(4,a);
	
}
void exchangeSort(int n,int s[])
{
	for(int i = 0; i < n;i++)
		for(int j = i+1 ; j < n; j++)
			if(s[j] < s[i])
				exchange(s[i],s[j]);
}
void exchange(int& a, int& b)
{
	int temp = a;
	a = b;
	b = temp;
}
void printArr(int n,int s[])
{
	for(int i = 0 ; i < n;i++)
		cout << s[i] << endl;
}