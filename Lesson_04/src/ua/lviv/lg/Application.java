package ua.lviv.lg;

public class Application {

	public static void main(String[] args) {
		Animal van=new Animal("�������", 2, 7);
		
System.out.println("����� �������="+ van.getName()+"   �������� �������="+van.getSpeed()+"��/���,  ³� �������=" + van.getAge()+"����");
		van.setName("���");
		van.setAge(6);
		van.setSpeed(6.5);
		System.out.println("����� �������="+ van.getName()+"   �������� �������="+van.getSpeed()+"��/���,  ³� �������=" + van.getAge()+"����");
	}

}
