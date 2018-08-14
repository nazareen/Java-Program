public class Complex{
	double realPart;
	double imaginaryPart;
	double result;
    
     public String toString(){
    	return realPart+","+ imaginaryPart;
    }

    public Complex(){

    }
    public Complex(double realPart,double imaginaryPart){
    	this.realPart=realPart;
    	this.imaginaryPart=imaginaryPart;
    } 
    public Complex add(Complex com1,Complex com2){
           Complex ctemp= new Complex();
           ctemp.realPart=com1.realPart+com2.realPart;
           ctemp.imaginaryPart=com1.imaginaryPart+com2.imaginaryPart;
           return ctemp;
    }
    public Complex subtract(Complex com1,Complex com2){
    	  Complex ctemp= new Complex();
           ctemp.realPart=com1.realPart-com2.realPart;
           ctemp.imaginaryPart=com1.imaginaryPart-com2.imaginaryPart;
           return ctemp;
    }
    public Complex multiply(Complex com1,Complex com2){
    	Complex ctemp= new Complex();
           ctemp.realPart=com1.realPart*com2.realPart;
           ctemp.imaginaryPart=com1.imaginaryPart*com2.imaginaryPart;
           return ctemp;
    }
    public Complex divide(Complex com1,Complex com2){
    	Complex ctemp= new Complex();
           ctemp.realPart=com1.realPart/com2.realPart;
           ctemp.imaginaryPart=com1.imaginaryPart/com2.imaginaryPart;
           return ctemp;
    }
    public void setRealPart(double realPart){
    	this.realPart=realPart;
    }
    public void setImaginaryPart(double imaginaryPart){
    	this.imaginaryPart=imaginaryPart;
    }
     public double getRealPart(){
    	return realPart;	
    }
    public double getImaginaryPart(){
    	return imaginaryPart;
    }

 }   
   