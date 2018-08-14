class EmployeeTest{
	public static void main(String[] args) {
		
	Employee emp3= new Employee(1001,"bahubali",3030303);
        System.out.println(emp3.id);
        System.out.println(emp3.name);
        System.out.println(emp3.salary);
        String[] tasklist={"check Email","bring cofee","write code"}; 
        emp3.tasklist=tasklist;
       emp3.display();
       Employee.risesalary(emp3,10);
       emp3.printemployeeDetails();
       Employee.risesalary(emp3,20);
       emp3.printemployeeDetails();

      System.out.println("--------------------");

    Employee emp2= new Employee(1002,"naaz",200000);
       System.out.println(emp2.id);
       System.out.println(emp2.name); 
       System.out.println(emp2.salary);
       emp2.tasklist=tasklist;
       emp2.display();
       Employee.risesalary(emp2,10);
       emp2.printemployeeDetails();
       Employee.risesalary(emp2,20);
       emp2.printemployeeDetails();

      System.out.println("----------------");

    Employee emp1 = new Employee();
       emp1.id=10010;
       emp1.name="naaz";
       emp1.salary=30000;
       System.out.println(emp1.id);
       System.out.println(emp1.name);
       System.out.println(emp1.salary);
               
       emp1.tasklist=tasklist;
       emp1.display();
       Employee.risesalary(emp1,10);
       emp1.printemployeeDetails();
       Employee.risesalary(emp1,20);
       emp1.printemployeeDetails();


    }
}
        
	
