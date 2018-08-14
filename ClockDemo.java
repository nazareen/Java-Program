class ClockDemo{
	public static void main(String[] args) {
		Clock clock= new Clock(57);
           for(int i=0;i<10;i++){
       	clock.tick();
      System.out.println(clock.toString());
    }    

     Clock clock1= new Clock(2,21,32);
          for(int i=0;i<10;i++){
        	clock1.tick();
       System.out.println(clock1.toString());
	 }

    Clock clock2= new Clock(23);
     System.out.println(clock2.toString());

    Clock clock3 = new Clock(2,34,5);
    System.out.println(clock3.toString());
    
    System.out.println(clock3.subtackClock(clock2));

    System.out.println(clock2.addClock(clock3));  
    
     
    }	

}