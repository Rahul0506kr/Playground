#include <stdio.h>
int main() {
	int r,i,n,p,q,sum=0;
  scanf("%d",&n);
  r=n;
  while(n!=0)
  {
    p=n%10;
    q=p*p*p;
    sum=sum+q;
    n=n/10;
  }
 if(sum==r)
 {printf("Armstrong Number");
 }
  else
  {printf("Not an Armstrong Number");
  }
    
  
	return 0;
}