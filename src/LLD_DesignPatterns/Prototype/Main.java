package LLD_DesignPatterns.Prototype;

public class Main {
    public static void main(String[] args) {

        Student batch1ProtoType = new Student();

        batch1ProtoType.setBatchName("Batch 1");
        batch1ProtoType.setBatchId(1);
        batch1ProtoType.setInstructorName("Sandeep");
        batch1ProtoType.setModule("LLD");
        batch1ProtoType.setSchedule("MWF Evening");
        batch1ProtoType.setBatchPsp(56.6);
        batch1ProtoType.setBatchAttendance(70);

        batch1ProtoType.setName("Rajneesh");
        batch1ProtoType.setId(46);
        batch1ProtoType.setContactDetails("1548796315");
        batch1ProtoType.setPsp(89.55);

        System.out.println(batch1ProtoType.getName());


        batch1ProtoType.setName("Divyansh");
        batch1ProtoType.setId(46);
        batch1ProtoType.setContactDetails("1548796315");
        batch1ProtoType.setPsp(89.55);

        System.out.println(batch1ProtoType.getName());

        Student batch2ProtoType = new Student();

        batch2ProtoType.setBatchName("Batch 2");
        batch2ProtoType.setBatchId(2);
        batch2ProtoType.setInstructorName("Sandeep");
        batch2ProtoType.setModule("LLD");
        batch2ProtoType.setSchedule("MWF Evening");
        batch2ProtoType.setBatchPsp(89.66);
        batch2ProtoType.setBatchAttendance(80);

        Registry<Student> registry = new Registry<>();

        registry.add("Batch 1",batch1ProtoType);
        registry.add("Batch 2",batch2ProtoType);

        Student rajneesh = batch1ProtoType.copy();

        rajneesh.setName("Rajneesh");
        rajneesh.setId(3);
        rajneesh.setContactDetails("45648435465");
        rajneesh.setPsp(56.55);
    }
}
