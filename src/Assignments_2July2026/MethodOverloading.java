package Assignments_2July2026;

public class MethodOverloading {
    //formal parameters
    // change on number of parameters
    // change on data type of parameters
    // change on order of parameters

    public int add(int a,int b) {
        return a+b;
    }

    public int add(int a,int b,int c) {
        return a+b+c;
    }


    public double add(double d1,double d2) {
        return d1+d2;
    }

    //order of parameters
    public double add(int i,double d1) {
        return i+d1;
    }


    public double add(double d1,int i) {
        return i+d1;
    }

    public String add(String s1,String s2) {
        return s1+s2;
    }

    public void add(ComplexNumber c1,ComplexNumber c2) {
        ComplexNumber c3=new ComplexNumber();
        c3.real=c1.real+c2.real;
        c3.imaginary=c1.imaginary+c2.imaginary;
        System.out.println(c3.real +" +i "+c3.imaginary);

    }
    public Fraction add(Fraction f1,Fraction f2){
        int num=((f1.numerator*f2.denominator)
                +(f2.numerator*f1.denominator));
        int den=f1.denominator*f2.denominator;
        return new Fraction(num,den);
    }
    public static void main(String[] args) {

        MethodOverloading calc=new MethodOverloading();//supplied by jvm
        System.out.println( calc.add(89,78));
        System.out.println( calc.add(91.0,18.0));
        System.out.println( calc.add(11,78,90));
        System.out.println( calc.add(71,21.0));
        System.out.println( calc.add(12.0,18));
        System.out.println( calc.add("Hello ","world"));
        ComplexNumber c1=new ComplexNumber(3, 4);
        ComplexNumber c2=new ComplexNumber(5, 6);
        calc.add(c1,c2);
        Fraction f1=new Fraction(1,2);
        Fraction f2=new Fraction(2,3);
        Fraction res=calc.add(f1,f2);
        System.out.println(res.numerator+"/"+res.denominator);

    }
}
