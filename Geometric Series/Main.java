#include<stdio.h>
int main()
{
  int n,r,a,t_s1,t_s2,n_terms;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=1;r=2;
    t_s1=(n+1)/2;
    n_terms=a* pow(r,t_s1-1);
    printf("%d",n_terms);
  }
  else
  {
      a=1;r=3;
     t_s2=n/2;
    n_terms=a* pow(r,t_s2-1);
    printf("%d",n_terms);
  }
  return 0;
}