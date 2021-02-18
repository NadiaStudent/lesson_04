package ua.lviv.lgs;

public class Robot {
	private String whatToDo;
	
	Robot() {
		this.setWhatToDo("I'm Robot - ÿ ןנמסעמ ןנאצ‏‏");
	}

	public String getWhatToDo() {
		return whatToDo;
	}

	public void setWhatToDo(String whatToDo) {
		this.whatToDo = whatToDo;
	}
	
	public void work() {
		System.out.println(whatToDo);
	}

	}
