/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalermanagementsystem;
import java.util.*;
/**
*
* @author Lynn Abbidi 1083873
* 	  Aliya Haidar 1082079
*/
public class HospitalERManagementSystem_Sec51_G5 {
    private static final PriorityQueue<Patient_Sec51_G5> patients = new PriorityQueue<>(new SeverityComparator_Sec51_G5());
    private static final Stack<Bed_Sec51_G5> availableBeds = new Stack<>();
    private static final Queue<Doctor_Sec51_G5> doctors = new LinkedList<>();
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void addBed(int i){
        if(availableBeds.size()>50){
            System.out.println("Maximum capacity of beds has reached.");
        }else{

            String id = "B" + String.format("%02d", i+1);
            Bed_Sec51_G5 b = new Bed_Sec51_G5(id);
            availableBeds.push(b);
        }
    }
    
    public static void addDoctor(Doctor_Sec51_G5 doctor){
        if (doctors.size()>10){
            System.out.println("Maximum capacity of doctors has reached.");
        }else{
            doctors.add(doctor);
        }
    }
    
    public static void main(String[] args) {
        Shift_Sec51_G5 dayShift = new Shift_Sec51_G5("Day", 8, 16);   
        Shift_Sec51_G5 nightShift = new Shift_Sec51_G5("Night", 16, 8); 

        Doctor_Sec51_G5 doctor1 = new Doctor_Sec51_G5("D01", "Maxine", "Neurology", dayShift);
        Doctor_Sec51_G5 doctor2 = new Doctor_Sec51_G5("D02", "George", "Cardiology", nightShift);
        Doctor_Sec51_G5 doctor3 = new Doctor_Sec51_G5("D03", "Emily", "Pediatrics", dayShift);
        Doctor_Sec51_G5 doctor4 = new Doctor_Sec51_G5("D04", "David", "Oncology", nightShift);
        Doctor_Sec51_G5 doctor5 = new Doctor_Sec51_G5("D05", "Sophia", "Orthopedics", dayShift);
        Doctor_Sec51_G5 doctor6 = new Doctor_Sec51_G5("D06", "Liam", "General Medicine", nightShift);
        
        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);
        doctors.add(doctor5);
        doctors.add(doctor6);

        for(int i=0;i<50;i++){
            addBed(i);
        }
        
        int userChoice;
        do {
            displayMenu();
            userChoice = userMenuChoice();
            switch (userChoice) {
                case 1: logPatientCheckIn(); break;  // 1- Log a new patient check-in.
                case 2: updatePatientInfo(); break;  // 2- Update patient information.
                case 3: assignDoctorToPatient(); break;  // 3- Assign a doctor to a patient.
                case 4: allocateBedToPatient(); break;  // 4- Allocate a bed to a patient.
                case 5: dischargePatient(); break;  // 5- Discharge a patient and free the bed.
                case 6: viewPatientQueue(patients); break;  // 6- View all patients in the queue sorted by severity.
                case 7: Admin(); break;  // 7- Add your own extra functionality.
                default: System.out.println("Thank you for using the Hospital ER Management System. Goodbye!");
            }
        } while (userChoice != 0);
    }
    
    public static void displayMenu() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Hospital Emergency Room Management System");
        System.out.println("---------------------------------------------------------");
        System.out.println("1- Log a new patient check-in.");
        System.out.println("2- Update patient information.");
        System.out.println("3- Assign a doctor to a patient.");
        System.out.println("4- Allocate a bed to a patient.");
        System.out.println("5- Discharge a patient and free the bed.");
        System.out.println("6- View all patients in the queue sorted by severity.");
        System.out.println("7- Admin ");
        System.out.println("0- Quit");
        System.out.println("---------------------------------------------------------");
    }

    public static int userMenuChoice(){
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Your choice (0, 1, 2, 3, 4, 5, 6, 7):");
            choice = input.nextInt();
        } while(choice > 7 || choice < 0);
        return choice;
    }
    
   public static void logPatientCheckIn(){
       
        System.out.println("Enter patient's ID: ");
        String id = scanner.next();
        System.out.println("Enter patient's name: ");
        String name = scanner.next();
        System.out.println("Enter patient's age: ");
        int age = scanner.nextInt();
        int severityLevel=0;
        while(severityLevel<1||severityLevel>4){
            System.out.println("Enter severity level: 4 (Critical) - 3 (Severe) - 2 (Moderate) - 1 (Mild): ");
            severityLevel = scanner.nextInt();
            if(severityLevel<1||severityLevel>4){
                System.out.println("Invalid input. Please enter a number 1-4.");
            }
        }
        
        patients.offer(new Patient_Sec51_G5(id,name,age,severityLevel));
        System.out.println("New patient added.\n");


    }

    public static void updatePatientInfo(){
        System.out.println("Enter patient's ID to update info: ");
        Scanner sc= new Scanner(System.in);
        String id=sc.nextLine();
        Scanner scanner =new Scanner(System.in);
        for(Patient_Sec51_G5 p: patients){
            if(p.getId().equals(id)){
                System.out.println("Current patient's information: \n"+p);
                System.out.println("What would you like to update?");
                System.out.println("1- Name ");
                System.out.println("2- Age ");
                System.out.println("3- Severity Level ");
                System.out.println("4- Update All ");
                System.out.println("5- Exit");
                System.out.println();
                int choice = scanner.nextInt();
                
                switch(choice){
                    case 1: 
                        System.out.println("Enter new name: ");
                        p.setName(sc.nextLine());
                        break;
                    case 2:
                        System.out.println("Enter new age: ");
                        p.setAge(scanner.nextInt());
                        break;
                    case 3:
                        int severityLevel=0;
                        while(severityLevel<1||severityLevel>4){
                            System.out.println("Enter severity level: 4 (Critical) - 3 (Severe) - 2 (Moderate) - 1 (Mild): ");
                            severityLevel = scanner.nextInt();
                            if(severityLevel<1||severityLevel>4){
                                System.out.println("Invalid input. Please enter a number 1-4.");
                            }
                        }
                        p.setSeverityLevel(severityLevel);
                        break;
                    case 4:
                        System.out.println("Enter new name: ");
                        p.setName(scanner.nextLine());
                        System.out.println("Enter new age: ");
                        p.setAge(scanner.nextInt());
                        int sL=0;
                        while(sL<1||sL>4){
                            System.out.println("Enter severity level: 4 (Critical) - 3 (Severe) - 2 (Moderate) - 1 (Mild): ");
                            sL = scanner.nextInt();
                            if(sL<1||sL>4){
                                System.out.println("Invalid input. Please enter a number 1-4.");
                            }
                        }
                        p.setSeverityLevel(scanner.nextInt());
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice.\n");
                        break;

                }
                System.out.println("Patient information updated.\n");
                return;
            }
        }System.out.println("Invalid choice.\n");
    }
    public static Patient_Sec51_G5 searchByID(String id){
        for(Patient_Sec51_G5 p1:patients){
            if (p1.getId().equals(id)){
                return p1;
            }
        }
        return null;
    }

    public static void assignDoctorToPatient() {
        System.out.println("Enter patient's ID: ");
        String patientId = scanner.next();
        Patient_Sec51_G5 patient = searchByID(patientId);

        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        System.out.println("Enter doctor's ID: ");
        String doctorId = scanner.next();
        Doctor_Sec51_G5 doctor = null;

        for (Doctor_Sec51_G5 d : doctors) {
            if (d.getId().equals(doctorId)) {
                doctor = d;
                break;
            }
        }

        if (doctor == null || !doctor.isAvailable()) {
            System.out.println("Doctor not found or not available.");
            return;
        }

        patient.setAssignedDoctor(doctor);
        doctor.setIsAvailable(false);
        System.out.println("Assigned Dr. " + doctor.getName() + " to patient " + patient.getName());
    }

    public static void allocateBedToPatient() {
        if (availableBeds.isEmpty()) {
            System.out.println("No available beds.");
            return;
        }

        System.out.print("Enter the patient's ID: ");
        String patientId = scanner.next();
        Patient_Sec51_G5 patient = searchByID(patientId);

        if (patient == null || patient.getAssignedBed() != null) {
            System.out.println("Patient not found or already has a bed.");
            return;
        }
        
        System.out.print("Enter the bed ID to allocate: ");
        String bedId = scanner.next();

        for (Bed_Sec51_G5 bed : availableBeds) {
            if (bed.getId().equals(bedId)) {
                patient.setAssignedBed(bed);
                bed.setIsFree(false);
                availableBeds.remove(bed);
                System.out.println("Allocated bed " + bedId + " to patient " + patient.getName() + ".");
                return;
            }
        }

        System.out.println("Bed " + bedId + " not found.");
    }

    public static void dischargePatient() {
        System.out.println("Enter patient's ID to discharge: ");
        Scanner scanner1 = new Scanner(System.in);
        String id = scanner1.nextLine();

        for (Patient_Sec51_G5 p : patients) {
            if (p.getId().equals(id)) {
                if (p.getAssignedBed() != null) {
                    p.getAssignedBed().setIsFree(true);
                    availableBeds.push(p.getAssignedBed());
                    Doctor_Sec51_G5 assignedDoctor = p.getAssignedDoctor();
                    if (assignedDoctor != null) {
                        assignedDoctor.setIsAvailable(true);
                    }
                }
                System.out.println("Patient " + p.getName() + " is discharged.\n");
                patients.remove(p); 
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    public static void viewPatientQueue(PriorityQueue<Patient_Sec51_G5> patientsQueue){
        if(patientsQueue.isEmpty()){
            return ;
        }
        Patient_Sec51_G5 patient = patientsQueue.poll();
        System.out.println(patient);
        viewPatientQueue(patientsQueue);
    }


    public static void Admin() {
        Scanner sc = new Scanner(System.in);
        int input=-1;

        while (input != 0) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Show number of free beds:  ");
            System.out.println("2. Show number of available doctors:  ");
            System.out.println("3. View all Doctors: ");
            System.out.println("4. Add a new Doctor: ");
            System.out.println("5. Search for a Patient using ID: ");
            System.out.println("0. Exit");

            input = sc.nextInt(); 

            switch (input) {
                case 1:
                    System.out.println("The number of free beds are: " + availableBeds.size());
                    break;

                case 2:
                    int count = 0;
                    for (Doctor_Sec51_G5 d : doctors) {
                        if (d.isAvailable) {
                            count++;
                        }
                    }
                    System.out.println("The number of available doctors are: " + count);
                    break;

                case 3:
                    System.out.println("Here is a list of all the doctors: ");
                    for (Doctor_Sec51_G5 doctor : doctors) {
                        System.out.println(doctor);
                    }
                    break;

                case 4:
                    System.out.println("Enter name:");
                    String name = sc.next();
                    System.out.println("Enter ID:");
                    String id = sc.next();
                    System.out.println("Enter specialization:");
                    String specialization = sc.next();

                    
                    System.out.println("Enter shift type- Day, Night, Evening:");
                    String shiftType = sc.next();
                    System.out.println("Enter start time :");
                    int startTime = sc.nextInt();
                    System.out.println("Enter end time :");
                    int endTime = sc.nextInt();

                    Shift_Sec51_G5 shift = new Shift_Sec51_G5(shiftType, startTime, endTime);
                    Doctor_Sec51_G5 doctor = new Doctor_Sec51_G5(id, name, specialization, shift);
                    addDoctor(doctor);
                    System.out.println("New Doctor has been added: " + doctor.getName());
                    break;

                case 5:
                    System.out.println("Please enter the ID as a string: ");
                    String str = sc.next();
                    boolean found = false;
                    for (Patient_Sec51_G5 patient : patients) {
                        if (patient.getId().equals(str)) {
                            System.out.println("Patient with ID: " + str + " found");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Patient with ID: " + str + " not found.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting Admin menu.");
                    break;

                default:
                    System.out.println("Please enter a valid input: ");
            }
        }
    }
    
    
}
