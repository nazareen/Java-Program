public class swe{
	public static void main(String[] args)
	 {
	 	
	 	int num=0;
	 	int reversenum=0;
	 	num=501;
	 	int temp=num;
	 	while(num!=0){
	     reversenum=reversenum*10;
	 	 reversenum=reversenum+num%10;
	 	 num=num/10;
	 	}
	 	 System.out.println("reversenum num of" + temp +"is" + reversenum);
			
		
		
		
		
		
		
	
	}
}

