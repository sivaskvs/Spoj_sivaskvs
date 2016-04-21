#include<iostream>
using namespace std;
int afunc(int n)
{
int x,y=0;
while(n!=0)
{
x=n%10;
n=n/10;
y=(10*y)+x;
}
return y;
}
int main()
{
int n,a[10000],b[10000],c[10000],i;
cin>>n;
for(i=0;i<n;i++)
{
cin>>a[i]>>b[i];
}
for(i=0;i<n;i++)
{
a[i]=afunc(a[i]);
b[i]=afunc(b[i]);
c[i]=a[i]+b[i];
cout<<"\n"<<afunc(c[i]);
}
return 0;
}

