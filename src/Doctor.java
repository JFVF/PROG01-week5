public class Doctor extends Person {

    private Specialty specialty;

    private String id;


    public Doctor(String name, String address, Specialty specialty,String id){
        super(name,address);

        this.specialty = specialty;
        this.id = id;
    }

    public void display(){
        super.display();
        System.out.println("Doctor's specialty: " + this.specialty);

    }

    public void runDiagnostic(Patient patient){

        patient.setDiagnostic(Disease.getRandomDisease());
    }

    public String getId(){
        return this.id;
    }

}
