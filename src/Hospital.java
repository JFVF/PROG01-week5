import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hospital {
    private String name;
    private String address;

    private List<Patient> patientList;
    private List<Doctor> doctorList;
    public Hospital(String name, String address){
        this.name = name;
        this.address = address;

        this.patientList = new ArrayList<>();
        this.doctorList = new ArrayList<>();

    }

    public void displayPatients(){
        for (Patient p: patientList) {
            System.out.println("***Displaying patient***");
            p.display();
            Doctor doc = this.getDoctorId(p.getDoctorId());
            System.out.println("---Displaying doctor---");
            doc.display();
        }
    }

    public void addDoctor(Doctor doctor){

        doctorList.add(doctor);
    }


    public void admitPatient(Patient patient){

        assignDoctor(patient);

        this.patientList.add(patient);

    }

    private void assignDoctor(Patient patient){

        Doctor doctor = doctorList.get(new Random().nextInt(doctorList.size()));

        patient.setDoctorId(doctor.getId());
    }

    public void medicalAppointment(Patient patient){
        Doctor doctor = this.getDoctorId(patient.getDoctorId());

        doctor.runDiagnostic(patient);
    }

    private Doctor getDoctorId(String id){
        for (Doctor doc: doctorList) {
            if(doc.getId().equals(id))
                return doc;
        }
        return null;
    }

}
