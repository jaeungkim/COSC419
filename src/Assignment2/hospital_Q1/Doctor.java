package Assignment2.hospital_Q1;


public class Doctor extends Employee {

    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Dr." + name + " in action...");
    }

    //DOCTORS's duties
    private void prescribeMedicine() {
        System.out.println("\tPrescribe Medicine");
    }
    private void diagnosePatients() {
        System.out.println("\tDiagnosing Patient");
    }

    //call duties for doctors
    public void employeeJobs() {
        prescribeMedicine();
        diagnosePatients();
    }


}


