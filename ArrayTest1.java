class ArrayTest1{
	public static void main(String[] args){
		int[] array1={1,2,3,4,5,6};
		int[] array2=new int[array1.length];
		for(int i=0;i<array1.length;i++)
			array2[i]=array1[i];
			array2[0]=111;
		System.out.println(array1[0]);
	}
}