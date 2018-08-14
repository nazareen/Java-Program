class car{
	double height;
	double weight;
	String color;
	double speed;

	public void start(){
		System.out.println(color+"car started");
	}
	public void move(){
		speed++;
		System.out.println("car is moving");
	}
	public void stop(){
		speed=0;
		System.out.println(color+"car stoped");
	}
}