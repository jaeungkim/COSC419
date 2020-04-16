package Assignment2.hospital_Q1;


public class EmergencyRoomProcess {
    public static void main(String[] args) {

        HospitalManagement ERDirector = new HospitalManagement();
        Employee peggy = new Nurse(1, "Peggy", "emergency", true);

        ERDirector.callUpon(peggy);

        Employee suzan = new Doctor(2, "Suzan", "emergency", true);
        ERDirector.callUpon(suzan);

        Employee Joe = new Nurse(2, "Joe", "emergency", false);
        ERDirector.callUpon(Joe);

    }
}
