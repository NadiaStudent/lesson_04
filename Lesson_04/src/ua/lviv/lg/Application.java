package ua.lviv.lg;

public class Application {

	public static void main(String[] args) {
		Animal van=new Animal("Леопард", 2, 7);
		
System.out.println("Назва тварини="+ van.getName()+"   Швидкість тварини="+van.getSpeed()+"км/год,  Вік тварини=" + van.getAge()+"років");
		van.setName("Бик");
		van.setAge(6);
		van.setSpeed(6.5);
		System.out.println("Назва тварини="+ van.getName()+"   Швидкість тварини="+van.getSpeed()+"км/год,  Вік тварини=" + van.getAge()+"років");
	}

}
