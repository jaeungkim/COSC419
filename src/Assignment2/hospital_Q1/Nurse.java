package Assignment2.hospital_Q1;


public class Nurse extends Employee {

    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println(name + "(nurse) in action...");
    }

    // Nurses' duties
    private void checkVitalSigns() {
        System.out.println("\tChecking Vitals");
    }

    private void drawBlood() {
        System.out.println("\tDrawing blood");
    }

    private void cleanPatientArea() {
        System.out.println("\tCleaning Patient Area");
    }


    //call duties for nurses
    public void employeeJobs() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }
}
