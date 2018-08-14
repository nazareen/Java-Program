class ArrayRandomNum{
	public static void main(String[] args) {
		int[] array = new int[30];
		for(int i=0;i<array.length;i++){
			array[i] = new java.util.Random().nextInt();
		System.out.println(array[i]);
		}	 
	}
}