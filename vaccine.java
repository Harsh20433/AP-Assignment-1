public class vaccine {
    private String name;
    private int gap_between_doses, dose_numbers;

    vaccine(String vaccine_name, int gap_between_doses, int dose_numbers){
        this.name = vaccine_name;
        this.gap_between_doses = gap_between_doses;
        this.dose_numbers = dose_numbers;
    }

    public String getName(){
        return name;
    }

    public void setName(String vaccine_name){
        this.setName(vaccine_name);
    }

    int getDose_numbers(){
        return dose_numbers;
    }

    int getGap_between_doses(){
        return gap_between_doses;
    }
}