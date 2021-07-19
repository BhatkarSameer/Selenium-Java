
public class Calculator {

    public void add(){
        System.out.println ("Adding numbers");
    }

    public void subtract(){
        System.out.println ("Subtracting numbers");
    }

    public void multiply(){
        System.out.println ("Multiplying numbers");
    }

    public void divide(){
        System.out.println ("Dividing numbers");
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator ();

        calc.add ();
        calc.subtract ();
        calc.multiply ();
        calc.divide ();

    }

}