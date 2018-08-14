class Calculator{
	public static int add(int num1,int num2){
		return num1+num2;
	}

	public static int add(int num1,int num2,int num3){
		return num1+num2+num3;

	}

	public static double add(double num1,double num2){
		return num1+num2;
	}
    public static double mul(double distance,double time) {
		double speed=distance/time;
		return speed;
		
	}
	public static double mul(double radius){
		double area=radius*radius*3.142;
		return area;
	}
	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++)
		    fact*=i;
		return fact;
		
	}
	public static boolean isEven(int num) {
		return num%2==0?true:false;
		
	}public static boolean isOdd(int num) {
		return num%2!=0?true:false;
		
	}
	public static boolean isPrime(int num) {
		for(int i=2;i<num;i++){
			if(num%i==0)
				return false;
		}
		return true;
		
	}
	public static boolean palin(int num){
	    int reversenum=0;
		int temp=num;
		while(num!=0){
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;

		}


		if(reversenum==temp)
			return true;
		else
			return false;
        		
	}
	public static String generateFibonacci(int num){
		int first=0;
		int second=1;
		int current=0;
		String result=" ";
		if(num==0)
			return result;
		if(num==1)
			return "0";
		if(num==2)
			return "0  1";
		for(int i=0;i<num-2;i++){
			current=first+second;
			first=second;
			second=current;
			result=result+" "+current;
		}
		return result;
	}
	public static boolean divisibleby6(int num) {
		return num%6==0?true:false;
		
	}
	public static double timeinsec(double num) {
		return num/120f;
		
	}
	public static int countsdigits(int num){
		int sum=0;
		while(num>0){
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}
	public static int digitRepetedTwise(int num) {
		int a;
		int result;
		a=num*100;
		result=a+num;
		return result;
	}
	public static int countsNumOfDigits(int num) {
		int count=0;
		while(num!=0){
			num/=10;
			++count;
		}
		return count;
	}
	public static int findHundredDigit(int num) {
		int value,result;
		value=num%1000;
		result=value/100;
		return result;
		
	}
	public static int sumOfDigits(int num) {
		int a,b,sum;
		a=num%10;
		b=num/10;
		sum=a+b;
		return sum;
	}
	public static float doubleform (int num1,int num2,int num3){
		int a,b,c,add;
		a=num1*100;
		b=num2*10;
		c=num3;
		add=a+b+c;
		return add/100f;
	}
	public static boolean and(boolean num1,boolean num2, boolean num3) {
		boolean sum=num1&num2;
		return sum&num3;
		
	}
	public static boolean largerThanOne(int num,int num1,int num2) {
		return num>num1||num>num2;
		
	}
	public static int sumOf4Digits(int num) {
		int sum=0;
		for(int i=1;i<=4;i++){
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}
    public static double areaOfSquare(int x1,int x2,int y1,int y2) {
    	double area=((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))/2;
    	return area;
    	
    }
    public static int addDigitNumber(int num1,int num2,int num3) {
    	int a,b,c,d,sum=0;
    	for(int i=num1;i<=num3;i++){
    		a=i*1000;
    		b=i*100;
    		c=i*10;
    		d=i;
    		sum+=a+b+c+d;

    	}
        return sum;
    }
    public static boolean numDivBy3Or7(int num) {
    	if(num%3==0||num%7==0)
    		return true;
    	else 
    		return false;
    }
    public static int largestNumber(int num1,int num2,int num3){
        if(num1>num2||num1>num3){
        		return num1;
        }
        else if(num2>num3){
        		return num2;
        }
        else 
        	return num3;
    }
    public static int daysInMonth(int year,int month) {
    	int days=0;
    	switch(month){
    		case 1:
    		case 3:
    		case 5:
    		case 7:
    		case 8:
    		case 10:
    		case 12:
    		    days=31;
    		    break;
    		case 4:
    		case 6:
    		case 9:
    		case 11:
    		      days=30;
    		      break;
    		case 2:
    		    if(year%4==0 && year%100!=0 || year%400==0){
    		      days=29;	
    		    }
    		    else
    		    	days=28;
    	}
    	return days;
    }
    public static char changecharcase(char ch) {
       	int ch1=ch;
       	if(ch1>=65 && ch1<=90){
       		ch1=ch1+32;
       		ch=(char)ch1;
       		return ch;
       	}
       	else{
       		ch1=ch1-32;
       		ch=(char)ch1;
       		return ch;
       	}
    }   	
               
    public static boolean lastDigitsSame(int num1,int num2) {
        	if(num1%10==num2%10)
              return true;
          else
          	return false;
    }
    public static boolean sumOfTwoEqualsThird(int num1,int num2,int num3){ 
        int a,b,c;
        a=num1+num2;
        b=num2+num3;
        c=num1+num3;
        if(num3==a||num1==b||num3==c)
        	return true;
        else 
       	return false;
    }
    public static int sumOfLast3(int num){
    	int result=0;
    	for(int i=0;i<3;i++){
    		result+=num%10;
    		num=num/10;
    	}
        return result;
    }
    public static int reversingNumber(int num){
    	int reversenum=0;
    	int temp=num;
    	while(num!=0){
    		reversenum=reversenum*10;
    		reversenum=reversenum+num%10;
    		num=num/10;
    	}
    	return reversenum; 
    }
    public static boolean perfectNumber(int num){
    	int count;
    	int result=0;
    	for(count=1;count<=num;count++)
    		if(num%count==0)
    			result=result+count;
    	if(result==num)
    	    return true;
    	 else
    	    return false;
    }      	
    public static String naturalNumbers(int num){
    	String str=" ";
    	for(int i=0;i<num;i++)
    		str=str+" "+i;
    	return str;
    }
    public static String onlyEvens(int from,int to){
    	String str=" ";
    	for(int i=from;i<=to;i++){
    		if(isEven(i))
    			str=str+" "+i;
    	}
    	return str;
    } 
    public static String returnEvens(int from,int to){
    	return onlyEvens(from,to);
    }
    public static String returnOdd(int from,int to){
    	String str=" ";
    	for(int i=from;i<=to;i++){
    		if(isOdd(i))
    			str=str+" "+i;
    	}
        return str;
    }
    public static String returnPrimeNumbers(int from,int to){
    	String str=" ";
    	for(int i=from;i<=to;i++){
    		if(isPrime(i))
    			str=str+" "+i;
    	}
    	return str;
    }
    public static void printArray(int[] array){
    	for(int item:array)
    		System.out.println(item);
    } 
    public static int sumOfArray(int[] array){
        int sum=0;
        for(int item:array)
        	sum+=item;
        return sum;
    }
    public static void incrementArrayItemsBy1(int[] array){
    	for(int i=0;i<array.length;i++)
    		array[i]=array[i]+1;
    	System.out.println(array);
    }
}        


    

