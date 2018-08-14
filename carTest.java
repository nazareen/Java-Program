class carTest{
	public static void main(String[] args){
		

		car ford=new car();
		ford.height=100;
		ford.weight=200;
		ford.color="blue";
		System.out.println(ford.height);
		System.out.println(ford.weight);
		System.out.println(ford.color);
		System.out.println(ford.speed);

		System.out.println("-----------------");

		car audi= new car();
		audi.height=100;
		audi.weight=105;
		audi.color="red";
		audi.speed=103;
		System.out.println(audi.height);
		System.out.println(audi.weight);
		System.out.println(audi.color);
		System.out.println(audi.speed);
        
        audi.start();
        ford.start();
	}
}