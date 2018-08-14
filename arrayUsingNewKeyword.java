class ArrayUsingNewKeyword{
	public static void main(String[] args){
		int[] array=new int[10];
		array[1]=1000;
		System.out.println(array[1]);
		System.out.println(array[0]);
		System.out.println(array[2]);
		boolean[] barray=new boolean[3];
		barray[1]=true;
		System.out.println(barray[0]);
		System.out.println(barray[1]);
		System.out.println(barray[2]);
	}
}