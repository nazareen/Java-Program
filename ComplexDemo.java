class ComplexDemo{
	public static void main(String[] args) {
		Complex com1 =new Complex(22,34);
		Complex com2 = new Complex(12,34);
		Complex com3 = new Complex();
		com3 = com3.add(com1,com2);
		System.out.println(com3.toString());
		
		com3 = com3.subtract(com1,com2);
		System.out.println(com3.toString());

		com3 = com3.multiply(com1,com2);
		System.out.println(com3.toString());

		com3 = com3.divide(com1,com2);
		System.out.println(com3.toString());
	}
}		