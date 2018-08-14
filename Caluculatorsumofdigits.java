class Caluculatorsumofdigits{
	public static int sumOfDigits(int num) {
		int a,b,sum;
		a=num%10;
		b=num/10;
		sum=a+b;
		return sum;
	}
}