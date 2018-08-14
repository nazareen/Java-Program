class Areawithif{
	public static void main(String[] args){
		final double PI=3.142;
		double radius=-123.123;
		if(radius>0){
			double area=radius*radius*PI;
			System.out.println(area);
		}
		else{
			System.out.println("radius should be grater than 0");
		}
	}
}