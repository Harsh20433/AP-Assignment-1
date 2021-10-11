public class citizen  {
	private String name;
	private int age, due;
	private String uni;
	private String nod;

	public citizen(String n1, String n2, int n3, String n4, int n5) {
		{
			this.setname(n1);//calling the setter function for naming the citizen
			this.age = n3;
			this.setuni(n2);//calling the setter function for unique code of  the citizen
			this.setnod(n4);//calling the setter function for no od doses of the citizen
			this.setdue(n5);//calling the setter function for due date of the citizen
		}

	}


    String getname() {//getter fucntion for returning the name of the called patient
		return name;
	}

	void setname(String n1) {//setter fucntion for setting the name of the called patient
		this.name = n1;
	}

	String getuni() {//getter fucntion for returning the unique code of the called patient
		return uni;
	}

	void setuni(String n2) {//setter fucntion for setting the unique code of the called patient
		this.uni = n2;
	}

	int getage() {//getter fucntion for returning age of the called patient
		return age;
	}

	void setage(int n3) {//setter fucntion for setting the age of the called patient
		this.age = n3;
	}

	String getnod() {//getter fucntion for returning hte name of the called patient
		return nod;
	}

	void setnod(String n4) {//setter fucntion for setting hte name of the called patient
		this.nod=n4;
	}

	int getdue() {//getter fucntion for returning hte hospital nameof the called patinet
		return due;
	}

	void setdue(int n5) {//setter fucntion for setting hte hospital name of the called patient
		this.due = n5;
	}

	 void da() {
		System.out.println("Citizen name:" + this.getname());
		System.out.println("Age "+getage());
		System.out.println("Unique Id:  "+this.getuni());
	 }

 }
