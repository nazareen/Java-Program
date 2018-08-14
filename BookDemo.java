class BookDemo{
	public static void main(String[] args) {
		Author a1 = new Author("shaik","nazareen");
		System.out.println(a1.firstName);
		System.out.println(a1.lastName);
		Book b1=new Book("i will become a developer",1000);
		System.out.println(b1.title);
        System.out.println(a1.toString());
        System.out.println(b1.price);
	}
}