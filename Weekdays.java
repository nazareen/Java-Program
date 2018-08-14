class Weekdays{
	public static void main(String[] args) {
		int dayNumber=3;
		String day="";
		switch(dayNumber){
			case 1:
			day="monday";
			break;
			case 2:
			day="tuesday";
			break;
			case 3:
			day="wednesday";
			break;
			case 4:
			day="thurseday";
			break;
			case 5:
			day="friday";
			break;
			case 6:
			day="saturday";
			break;
			case 7:
			day="sunday";
			break;
			default:
			System.out.println("invalid option");
		}
		System.out.println(day);
	}
}