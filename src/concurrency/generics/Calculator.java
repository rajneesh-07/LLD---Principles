package concurrency.generics;

public class Calculator<X,Y>{

    private X x;
    private Y y;

    public Calculator(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    Calculator booleanCal = new Calculator(true,true); // Raw data types --> backward compatibility --> NOT RECOMMENDED

    public void print(X x, Y y){
        System.out.println(x);
        System.out.println(y);
    }

    public void printX(X x){
        System.out.println(x);
    }
    public void printY(Y y){
        System.out.println(y);

        // ClassName objName = new ClassName();
        //---> new ClassName(); --> supported for generics ---> NOT RECOMMENDED
        //---> new CalssName<>(); --> supported for generics ---> RECOMMENDED
    }
}
