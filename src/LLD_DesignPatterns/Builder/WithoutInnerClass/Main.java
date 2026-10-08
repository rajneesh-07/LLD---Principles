package LLD_DesignPatterns.Builder.WithoutInnerClass;


public class Main {
    public static void main(String[] args) {

        Student student = null;
        StudentHelper studentHelper = new StudentHelper(1, "Rajneesh", 99, 20,
                "Sandeep's Batch", "RGPV University",
                2022, "1234567890");

      boolean isValid =  StudentValidator.validate(studentHelper);

      if(isValid){
           student = new Student(studentHelper);
      }
    }
}

// student object getting created before validation -> DONE
// too many params, bad readability -> NOT RESOLVED
// all logic should be inside Student class -> NO


