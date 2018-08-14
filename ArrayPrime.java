class ArrayPrime{
	public static void main(String[] args) {
		int from=100;
		int to=200;
		int[] array=new int[(to-from)/2];
		int index=0;
		for(int i=from;i<=to;i++){
			int j=2;
			for(;j<i;j++){
				if(i%j==0)
					break;
			}
			if(j==i)
				array[index++]=i;
		}
		for(int item:array)
			System.out.println(item);
	}
}