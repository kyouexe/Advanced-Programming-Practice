class Patient {
    protected String name;
    protected int age;
    Patient(String name, int age) {
        this.name = name;
        this.age = age; }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);  }  }
class InPatient extends Patient {
    private int roomNumber;
    private String admissionDate;
    InPatient(String name, int age, int roomNumber, String admissionDate) {
        super(name, age); 
        this.roomNumber = roomNumber;
        this.admissionDate = admissionDate;   }
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Admission Date: " + admissionDate);   }}
class OutPatient extends Patient {
    private String appointmentDate;
    private String doctorName;
    OutPatient(String name, int age, String appointmentDate, String doctorName) {
        super(name, age);
        this.appointmentDate = appointmentDate;
        this.doctorName = doctorName;
    }    public void displayDetails() {
        super.displayDetails();
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Doctor: " + doctorName);   }}
public class HospitalSystem {
    public static void main(String[] args) {
        Patient in = new InPatient("Ravi", 50, 201, "2025-08-20");
        Patient out = new OutPatient("Ananya", 25, "2025-08-25", "Dr. Sharma");
        System.out.println("=== InPatient Details ===");
        in.displayDetails();
        System.out.println("\n=== OutPatient Details ===");
        out.displayDetails();  }}