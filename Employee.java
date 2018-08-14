class Employee{
	int id;
	String name;
	double salary;
	String[] tasklist;  

	  Employee(){
	  	id=-1;
	  	name="not specified";
	  	salary=-1;
	  }	
	  Employee(int id,String name,double salary){
	  	this.id=id;
	  	this.name=name;
	  	this.salary=salary;

	  }

	  Employee(int id,String name){
	  	this();
	  	this.id=id;
	  	this.name=name;
	  }
	  public void dosomthing(){
	  	System.out.print("employee is doing something");
	  }

      public void display(){
       for(String task:tasklist)
       	System.out.println(task);
   }
   public static double risesalary(Employee emp, double percentage){
   	 emp.salary=emp.salary+((emp.salary*percentage)/100);
   	 return emp.salary;
   }
	  

   public void printemployeeDetails(){
      System.out.println(id + " " + name + " " + salary);
   }

  
   
}