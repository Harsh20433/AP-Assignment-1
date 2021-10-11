import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class AP {
    public static Scanner scanner = new Scanner(System.in);


    public static ArrayList<citizen> stud = new ArrayList<citizen>();
    public static ArrayList<hospitalnames> hospital = new ArrayList<hospitalnames>();
    public static ArrayList<slot> slots = new ArrayList<slot>();
    public static ArrayList<vaccine> vaccine_slots= new ArrayList<vaccine>();
    

    static void citizen_reg(){
        System.out.println("Enter Citizen name : ");
        String patient = scanner.next();
        System.out.println("Enter Unique citizen id : ");
        String citizen_id = scanner.next();
        System.out.println("Enter age of patient : ");
        int age = scanner.nextInt();
        int un= scanner.nextInt();
        String nod=scanner.next();
        System.out.println("Citizen Name: " +  patient +  "Age: " +  "Unique ID: " + citizen_id);
        if(age>18) {
            citizen obj = new citizen(patient, citizen_id, age, nod, un);
            stud.add(obj);
        }else System.out.println("Only those aboove 18 years of age are allowed.");
    }

    static void vac_reg(){
        System.out.println("Vaccine name : ");
        String vac = scanner.next();
        System.out.println("Number of doses: ");
        int nod = scanner.nextInt();
        System.out.println("Gap between two doses : ");
        int god = scanner.nextInt();
        System.out.println("Vaccine Name: " +  vac +  "Number of doses: " + nod +  "Gap between two doses: " + god);
        AP.vaccine_slots.add(new vaccine(vac, nod, god));
    }

    
    static void hosp_reg(){
        System.out.println("Enter Hospital name : ");
        String hospital = scanner.next();
        System.out.println("Enter Unique hospital id : ");
        int hospital_id = scanner.nextInt();
        System.out.println("Enter pincode : ");
        int pincode = scanner.nextInt();
        System.out.println("Hospital Name: " +  hospital +  "Pincode: " + pincode +  "Unique ID: " + hospital_id);
        AP.hospital.add(new hospitalnames(hospital, pincode, hospital_id));

    }


    
    public static void main(String[] args) {
        System.out.println("CoWin Portal initialized....");
        System.out.println("---------------------------------");
        System.out.println("1. Add Vaccine");
        System.out.println("2. Register Hospital");
        System.out.println("3. Register Citizen");
        System.out.println("4. Add Slot for Vaccination");
        System.out.println("5. Book Slot for Vaccination");
        System.out.println("6. List all slots for a hospital");
        System.out.println("7. Check Vaccination Status");
        System.out.println("8. Exit");

        Scanner sc= new Scanner(System.in);
        int  choice=scanner.nextInt();

        if (choice==1){
        AP.vac_reg();
        }
        else if (choice==2)
        AP.hosp_reg();

        else if (choice==3)
        AP.citizen_reg();
        sc.close();



    }
}


//     public static void main(String[] args) throws IOException {//main method
//         Scanner scanner = new Scanner(System.in);

//         int a1 = scanner.nextInt();//number of patients 
//         patient za;
//         // ArrayList<Student> stud=new ArrayList<>();
//         for (int i = 0; i < a1; i++) {
//             za = new patient(scanner.next(), scanner.nextDouble(), scanner.nextInt(), scanner.nextInt(), i + 1);//creating object with patients name, age,temperature,oxygen level,and unique id 
//             stud.add(za);//adding the created object to the array list stud
//         }

//         // Student.d();
//         //int hlhg = 0;
//         while (func()==true) {//func will return false when all the patients have been admitted
//             System.out.println("Enter the query number ");
//             int ques = scanner.nextInt();
//             if (ques == 8) {//query for displaying all the not admitted cases
//                 display();// displaying the patients names
                
//             }
//             if (ques == 2) {//query to add the hospital to the list of hosptials with certain criterias
//                // hlhg++;
//                 String hosname = scanner.next();
                
//                 System.out.println("Temperature Criteria -");
//                 Double cc2 = scanner.nextDouble();
// System.out.println("Oxygen Levels -");
// int cc1 = scanner.nextInt();
               
//                System.out.println("Number of Available beds -");
// int numbeds = scanner.nextInt();
//                  hospitalnames za1 = new hospitalnames(hosname, numbeds, cc1, cc2);// hospital name, availablable beds,
//                                                                                   // oxygen,temperature
//                 hospital.add(za1);
//                 za1.pat();//the same object of hospitalnames class is called by reference and the values in the function 
//             }

//             if (ques == 5) {//query to tell the number of institutes admitting patients currently
//           //      hlhg++;
//                 opener();
//             }

//             if (ques == 4) {//query to tell the number of patients not admitted curretnly
//              //   hlhg++;
//                 addmit();
//             }

//             // za.vacancy();
//             if (ques == 6) {//query to tell the hospital's details like number of vacant beds adn admission status 
//                 String gas = scanner.next();
//          //       hlhg++;
//                 int fdd = -1;
//               //  System.out.println(hospital.get(0).getHospname());
//                 for (int i = 0; i < hospital.size(); i++) {
//                     if (hospital.get(i).getHospname().equals(gas)) {
//                         fdd = i;// finding the hosptial in the arraylist 
//                      //   System.out.println(fdd);
//                         break;
//                     }
//                 }
//                 if (fdd != -1) {
//                   //  System.out.println(fdd);
//                     hospital.get(fdd).someone();// calling the function in hospitalaname class
//                 }
//             }

//             if (ques == 9) {
//               //  hlhg++;
//                 String gfq=scanner.next();
//                 int fdd1 = -1;
//                // System.out.println(hospital.size());
//                 for (int i = 0; i < hospital.size(); i++) {
//                     if (hospital.get(i).getHospname().equals(gfq)) {
//                         fdd1= i;
//                     //    System.out.println(fdd1);
//                         break;
//                     }
//                 }
//                 if (fdd1!= -1)
//                 {//System.out.println(hospital.get(fdd1).getHospname());
//                     hospital.get(fdd1).nine();}

//             }
//             if (ques == 7) {//details of the patient with the user entered unique id
//               //  hlhg++;
//                 //System.out.println("Enter the id");
//                 int fff = scanner.nextInt();
//                 for (int kk = 0; kk < stud.size(); kk++) {
//                     if (stud.get(kk).getUniqueid() == fff) {
//                         stud.get(kk).da();

//                     }
//                 }
//             }
//             // Student.remover();
//             if (ques == 3) {
//                // hlhg++;
              
//                 System.out.println("Accounts removed of Institute whose admission is closed");
//                 for (int hg = 0; hg < hospital.size(); hg++)// 3
//                 {
//                     if (hospital.get(hg).getOpenclose() == "CLOSED") {
//                         System.out.println(hospital.get(hg).getHospname());

//                     }
//                 } alreadyadmitted2();
//             }
// if(ques==2)//deleting the already admiited patients
// {

//     alreadyadmitted();
// }





//         }
//     }
// }

 