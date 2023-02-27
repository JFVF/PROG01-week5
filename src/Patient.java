public class Patient extends Person{

    private Disease diagnostic;

    private String doctorId;
    public Patient(String name, String address){
        super(name,address);

        this.diagnostic = Disease.UNKNOWN;
    }

    public void display(){
        super.display();
        System.out.println("Patient diagnostic: " + this.diagnostic);
    }

    public void setDiagnostic(Disease diagnostic){
        this.diagnostic = diagnostic;
    }

    public void setDoctorId(String doctorId){
        this.doctorId = doctorId;
    }

    public String getDoctorId(){
        return doctorId;
    }

}
