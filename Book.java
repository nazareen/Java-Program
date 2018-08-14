public class Book{

     String title;
     Author author;
     double price;

     public Book(String title,double price){
       this.title=title;
       this.price=price;
     }

     public void setTitle(String title){
     	this.title=title;
     } 
     
     public void setPrice(double price){
     	this.price=price;
     }  
     public String getTitle(){
     	return title;
     } 
     
     public double getPrice(){
     	return price;
     }
}