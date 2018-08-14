
       	Employee emp1=new Employee();
		emp1.id=1001;
		emp1.name="captain jack sparrow";
		emp1.salary=606060;
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.salary);
		System.out.println(emp1.car);

		Employee emp2=new Employee();
		System.out.println(emp2.id);
		System.out.println(emp2.name);
		System.out.println(emp2.salary);

		Employee emp3= new Employee();
		emp3.id=123456;
		emp3.name="naaz";
		emp3.salary=505050;
		emp3.gender='m';
		System.out.println(emp3.car);
		emp3.car=new car();
		emp3.car.height=100;
		emp3.car.weight=200;
		emp3.car.color="white";
		System.out.println(emp3.id);
		System.out.println(emp3.name);
		System.out.println(emp3.salary);
		System.out.println(emp3.gender);
		System.out.println("naaz car details");
		System.out.println(emp3.car.height);
		System.out.println(emp3.car.weight);
		System.out.println(emp3.car.color);

		emp3.car.start();
        