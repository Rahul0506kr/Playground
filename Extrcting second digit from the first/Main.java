#include <stdio.h>
int main() {
	//Type your code
  int n ;
  scanf("%d",&n);
  while(n/100!=0)
  {
    n/=10;
  }
  printf("%d",n%10);
    
	return 0;
}