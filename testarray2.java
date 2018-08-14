class testarray2
{
	public static void main(String[] args) {
		int from=10;
		int to=20;
		int[] array=new int[4];
		int index=0;
        
		for (int i=from;i<=to;i++) {
			for(i=0;i<array.length;i++)
		 for(int j=0;j<=to;j++)
		 	if(i%j!=0)
		 		array[index++]=i;
            System.out.println(array[i]);
	    }
		}
	}
