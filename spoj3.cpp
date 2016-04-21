#include<iostream>
#include<string>
using namespace std;
int main()
{
string str,str1[100];
int i,j,k,b,n,r=0,ab=0;
cin>>b;
n=b;
do
{
++ab;
cin>>str;
for(i=1;i<=n;i++)
{
	for(j=0;j<(str.length()/n);j++)
	{
		if((j%2==0)&&(j==0))
		{
			str1[r]+=str[i-1];
		}
		else if((j%2==0)&&(j!=0))
		{
			str1[r]+=str[(((j+1)*n)-(n-i))-1];
		}
		else
		{
			str1[r]+=str[(((j+1)*n)-(i-1))-1];
		}
	}
}
++r;
cin>>n;
}while(n!=0);
for(b=0;b<ab;b++)
{
	cout<<str1[b]<<endl;
}
return 0;
}
