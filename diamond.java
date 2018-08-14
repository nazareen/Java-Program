public class diamond
{
	public static void main(String[] args) {
		int count,num,k,i=1;
		num=5;
		 count=num-1;
		for(k=1;k<=num;k++)
		{
			for(i=1;i<=count;i++)
				System.out.println(" ");
			count--;
			for(i=1;i<=2*k-1;i++)
				System.out.println("*");
		}
count=1;
for(k=1;k<=num-1;k++)
{
	for(i=1;i<=count;i++)
		count++;
	for(i=1;i<=2*(num-k)-1;i++)
		System.out.println("*");
	}
}
}