class whileex1{
	public static void main(String[] args) {
		int num=32;
		int i=1;
		int iterations=1;
		int cursum=0;
		do{
			i+=2;
			iterations++;
			cursum+=i;
		}while(cursum + i < num);
		System.out.println(iterations);
	}
}