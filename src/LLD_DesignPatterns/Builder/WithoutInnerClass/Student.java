package LLD_DesignPatterns.Builder.WithoutInnerClass;

public class Student {
    private int id;
    private String name;
    private double psp;
    private int age;
    private String batch;
    private String universityName;
    private int gradYear;
    private String phoneNumber;

    public Student(StudentHelper studentHelper){
        this(studentHelper.getId(),
                studentHelper.getName(),
                studentHelper.getPsp(),
                studentHelper.getAge(),
                studentHelper.getBatch(),
                studentHelper.getUniversityName(),
                studentHelper.getGradYear(),
                studentHelper.getPhoneNumber());
    }

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
}
