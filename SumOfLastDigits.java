class SumOfLastDigits{
	public static void main(String[] args){
		int[] array={23,45,24,35,46,45};
		int sum=0;
		for(int item:array)
			sum+=item%10;
		System.out.println(sum);
	}
}