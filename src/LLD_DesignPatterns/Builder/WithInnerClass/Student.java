package LLD_DesignPatterns.Builder.WithInnerClass;

public class Student {
    private int id;
    private String name;
    private double psp;
    private int age;
    private String batch;
    private String universityName;
    private int gradYear;
    private String phoneNumber;

    public Student(int id, String name, double psp, int age, String batch, String universityName, int gradYear, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.psp = psp;
        this.age = age;
        this.batch = batch;
        this.universityName = universityName;
        this.gradYear = gradYear;
        this.phoneNumber = phoneNumber;
    }

    public static StudentHelper builder(){
        return new StudentHelper();
    }
    public static class StudentHelper {
        private int id;
        private String name;
        private double psp;
        private int age;
        private String batch;
        private String universityName;
        private int gradYear;
        private String phoneNumber;

        public StudentHelper(){

        }
        public StudentHelper id(int id) {
            this.id = id;
            return this;
        }

        public StudentHelper name(String name) {
            this.name = name;
            return this;
        }

        public StudentHelper psp(double psp) {
            this.psp = psp;
            return this;
        }

        public StudentHelper age(int age) {
            this.age = age;
            return this;
        }

        public StudentHelper batch(String batch) {
            this.batch = batch;
            return this;
        }

        public StudentHelper universityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public StudentHelper gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public StudentHelper phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        private void validate() {
            if (this.age < 18)
                throw new InvalidAgeException("Age must be at least 18 ");

            if (this.gradYear > 2025)
                throw new InvalidGradYearException("Grad Year must be 2025 or earlier ");

            if (this.name == null || this.name.isBlank() || this.name.isEmpty())
                throw new InvalidNameStudentException("Name can not be empty ");
        }

        public Student build() {
            validate();
            return new Student(this.id,this.name,this.psp,this.age,this.batch,this.universityName,this.gradYear,this.phoneNumber);
        }
    }


}
