# Question-1
#include<stdio.h>
#include<string.h>
int main()
{
	char a[10];
	int i,j,length=0;
	gets(a);
	while(a[i]!='\0')
	
	{
		a[i]=tolower(a[i]);
		i++;
	}
	length=strlen(a);
	for(i=0;i<length;i++)
	{
		if(i==0||i==(length-1))
		{
			a[i]=toupper(a[i]);
		}
		else if(a[i]==' ')
		{
			a[i-1]=toupper(a[i-1]);
			a[i+1]=toupper(a[i+1]);		
		}
	}
		

	for(i=0;a[i]!='\0';i++)
	{
		while(!((a[i]>='a'&&a[i]<='z')||(a[i]>='A'&& a[i]<='z')||a[i]=='\0'))
		{
			for(j=i;a[j]!='\0';j++)
			{
				a[j]=a[j+1];
				
			}
			a[j]='\0';
		}
	}
		

		
	
	printf("%s ",a);
	return 0;
}
