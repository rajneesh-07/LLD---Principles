package LLD_DesignPatterns.Builder.WithoutInnerClass;

public class StudentValidator {

    public static boolean validate(StudentHelper studentHelper){
        return
                validateAge(studentHelper.getAge())
                && validateGradYear(studentHelper.getGradYear())
                && validateName(studentHelper.getName())
                && validatePhoneNumber(studentHelper.getPhoneNumber());

    }

    private static boolean validateAge(int age){
//        if(age<18)
//            return false;
//        else
//            return true;
        return age>=18;
    }

    private static boolean validateGradYear(int gradYear){
//        if(gradYear > 2025)
//            return false;
//        else
//            return true;
        return gradYear <= 2025;
    }

    private static boolean validateName(String name){
//        if(name.isEmpty() || name == null)
//            return false;
//        else
//            return true;
        return !name.isEmpty() && name != null;
    }

    private static boolean validatePhoneNumber(String phoneNumber){
//        if(phoneNumber.length() > 10 || phoneNumber.isEmpty() || phoneNumber == null){
//            return false;
//        }
//        else
//            return true;
        return phoneNumber.length() == 10 && !phoneNumber.isEmpty() ;

    }
}
