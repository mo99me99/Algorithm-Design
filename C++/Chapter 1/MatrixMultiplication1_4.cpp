#include <iostream>
using namespace std;
const int n = 3;
void matrixMult(const int a[][n], const int b[][n], int c[][n]);
void printMatrix(const int a[][n]);

int main()
{
	int a[][n] ={{1,2,3},{4,5,6},{7,8,9}};
	int b[][n] ={{1,2,3},{4,5,6},{7,8,9}};
	int c[n][n];
	matrixMult(a,b,c);
	printMatrix(c);
	
}
void matrixMult(const int a[][n],const int b[][n], int c[][n])
{
	for(int i = 0; i < n; i++)
		for(int j = 0; j < n; j++)
		{
			c[i][j] = 0;
			for(int k = 0; k < n; k++)
				c[i][j] += a[i][k] * b[k][j];	
		}	
}
void printMatrix(const int a[][n])
{
	for(int i = 0; i < n; i++)
	{
		for(int j = 0; j < n; j++)
			cout << a[i][j] << " ";	
		cout << endl;	
	}
}