public class slot{
    private long hospital_id;
    //         private int number_of_slots;
    private int day_number;
    private int quantity;
    private int vaccine;
    slot(long hospital_id, int day_number, int quantity, int vaccine ){
        this.hospital_id = hospital_id;
        this.day_number = day_number;
        this.quantity = quantity;
        this.vaccine = vaccine;
    }
    public void setVaccine(int vaccine) {
        this.vaccine = vaccine;
    }

    public long getHospital_id() {
        return hospital_id;
    }

    public int getDay_number() {
        return day_number;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getVaccine() {
        return vaccine;
    }
}