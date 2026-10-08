package LLD_DesignPatterns.Builder.WithInnerClass;


public class Main {
    public static void main(String[] args) {
            // without inner class
        /*
        Student student = null;
        StudentHelper studentHelper = new StudentHelper(1, "Rajneesh", 99, 20,
                "Sandeep's Batch", "RGPV University",
                2022, "1234567890");

      boolean isValid =  StudentValidator.validate(studentHelper);

      if(isValid){
           student = new Student(studentHelper);
      }

         */

        Student student =
                Student.builder()
                        .id(1)
                        .name("Rajneesh")
                        .age(19)
                        .gradYear(2025)
                        .universityName("RGPV")
                        .psp(99)
                        .batch("Sandeep's Bathc")
                        .phoneNumber("1234567890")
                .build();
    }
}
  //    WITHOUT INNER CLASS
// student object getting created before validation -> DONE
// too many params, bad readability -> NOT RESOLVED
// all logic should be inside Student class -> NO

/*
        WITH INNER CLASS

   1. Moved the StudentHelper class as a static inner class inside Student
   2. Removed all getters from StudentHelper, as it is only for validations, and wont be used anywhere else in code
   3. Since, we do not have getters and setters, we only have setters, we do not need, to put prefix in names, like setName(), setAge()
   only, name(..), age(..) will suffice and would make code shorter/readable
   4. Put all the validations inside StudentHelper method with a method called validate()
   5. created a method called build() -> which return a Student object after validation
 */