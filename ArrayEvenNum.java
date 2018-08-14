class ArrayEvenNum{
	public static void main(String[] args) {
		int from=10;
		int to=30;
		int[] array=new int [((to-from)/2)+1];
		int index=0;
		for(int i=from;i<to;i++){
			if(i%2==0){
				array[index++]=i;
			}
		}
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
}