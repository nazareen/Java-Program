class ArrayReference{
	public static void main(String[] args){
		int[] array1={1,2,3};
		int[] array2=array1;
		array2[0]=666;
		for(int i=0;i<array2.length;i++)
			System.out.println(array2[i]);
	}
}