// Swapping Min Max

public classs swappingminmax
{
	public static void swap(int[] a,int[] b)
	{
		int j=0;
		int l=a.length;
		
		for(int i=0;i<l;i++)
		{
			if(i==1)
			{
				j=a[i];
				a[i]=b[i];
				b[i]=j;
			}
			if(i== l-2)
			{
				j=a[i];
				a[i]=b[i];
				b[i]=j;
			}
		}

	}

	public static int maxaftermulti(int[] a,int[] b)
	{
		Integer n=Integer.MIN_VALUE;
		int l=a.length;
		int k=0;
		int[] c=new int[l-1];
		
		for(int i=0;i<l;i++)
		{
			c[k]=a[i]*b[i];
			k++;
		}
		for(int i=0;i<l;i++)
		{
			if(c[i]>n)	
			{
				n=c[i];
			}
		}	
		return n;
	}
	
	public static void main(string[] args)
	{
		int[] a={1,2,6,5,1,2,8,5,3};
		int[] b={9,8,9,4,5,6,8,10,3};
		swap(a[],b[]);
		maxaftermulti(a[],b[]);
	}
}
		
		
