#include <stdio.h>
int main() {
	//Type your code
  int i,n,count=0;
  scanf("%d",&n);
  
  for(i=1;count<n;i++)
  {
    
    if(i%2==1)
    {
      printf("%d\n",i);
        count=count+1;
    }
   
  }
 
	return 0;
}