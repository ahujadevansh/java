#include<stdio.h>
#include<malloc.h>
typedef struct
{
    int n,k,*s;

}elim;
int main()
{
    int i,t,x,temp;
    scanf("%d",&t);
    elim e[t];
    for(x=0;x<t;x++)
    {
        scanf("%d",&e[x].n);
        scanf("%d",&e[x].k);
        e[x].s=(int*)malloc(e[x].n*sizeof(int));
        for(i=0;i<e[x].n;i++)
            scanf("%ld",&e[x].s[i]);

        quicksort(e[x].s,0,e[x].n-1);
        temp=e[x].s[e[x].k-1];
        for(i=e[x].k;i<e[x].n;i++)
        {
            if(e[x].s[i]==temp)
                e[x].k++;
        }
    }
    for(i=0;i<t;i++)
        printf("%d\n",e[i].k);
}
int quicksort(int x[], int lb, int ub)
{
	int key,i,j,temp;
	if (lb < ub)
	{
		i = lb;
		j = ub;
		key=x[lb];
		while (i < j)
		{
		    i++;
			while (i<=ub&&x[i]>key)
			{
				i++;
			}
			while (j>=lb&&x[j]<key)
			{
				j--;
			}
			if (i < j)
			{
				temp = x[i];
				x[i] = x[j];
				x[j] = temp;
			}
		}

		temp = x[j];
		x[j] = x[lb];
		x[lb] = temp;
		quicksort(x, lb, j - 1);
		quicksort(x, j + 1, ub);
	}
	return 1;
}
