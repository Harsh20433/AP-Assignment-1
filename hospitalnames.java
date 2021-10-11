import java.io.IOException;
import java.util.ArrayList;
import java.util.*;


 class hospitalnames {
     private int pincode;
    private String hospname;
    private int unique;
    Scanner scanner=new Scanner(System.in);
    public hospitalnames(String ff, int pin, int uniq) {
        this.setHospname(ff);
        this.setunique(uniq);
        this.setpincode(pin);
    }


    public String getHospname() {
		return hospname;
	}

	public void setHospname(String hospname) {
		this.hospname = hospname;
    }
    
    public int getpincode() {
		return pincode;
	}

	public void setpincode(int pin) {
		this.pincode = pin;
	}

    public int getunique() {
		return unique;
	}

	public void setunique(int uniq) {
		this.unique = uniq;
    }

 }