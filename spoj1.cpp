#include<iostream>

using namespace std;
int main()
{
int a[50],i;
for(i=0;i<50;i++)
cin>>a[i];
for(i=0;i<50;i++)
{
if(a[i]==42)
break;
else
cout<<"\n"<<a[i];
}
return 0;
}