public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("Imirin","Abura Street");
        Doctor doctor = new Doctor("Rodrigo", "Zilda street", Specialty.CARDIOLOGY, "001");

        hospital.addDoctor(doctor);
        Patient patient = new Patient("Jorge","Abura street");

        hospital.admitPatient(patient);
        hospital.displayPatients();

        hospital.medicalAppointment(patient);

        //hospital.runDiagnostic(patient);
        hospital.displayPatients();
    }
}