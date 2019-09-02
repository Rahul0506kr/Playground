#include<stdio.h>

int main()
{
  int i,c,a[10];
  for(i=0;i<10;i++)
  {
    scanf("%d",&a[i]);
  }
  c=a[0];
  for(i=1;i<4;i++)
  {
    if(a[i]<c)
    {
      c=a[i];
    }}
    printf("%d",c);

return (0);
}