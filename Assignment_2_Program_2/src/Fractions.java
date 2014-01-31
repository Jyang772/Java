public class Fractions {
public static void main(String[] args) {
System.out.println("Test Application for the Fraction class");

// TASK 1: DECLARE TWO FRACTIONS.
Fraction x1 = new Fraction(5, 8);
Fraction x2 = new Fraction();

// TASK 2: VERIFY THE INITIAL VALUES OF BOTH FRACTIONS
System.out.println("x1 = " + x1.toString() + " value = " + x1.getValue());
System.out.println("x2 = " + x2.toString() + " value = " + x2.getValue());

// TASK 3: RESET THE FRACTION FOR X2
System.out.println("\nRESET X2:");
System.out.println("BEFORE x2 = " + x2.toString() + " value = " + x2.getValue());
x2.setDenominator(3);
x2.setNumerator(2);
System.out.println("AFTER x2 = " + x2.toString() + " value = " + x2.getValue());

// TASK 4: COMPARE X1 AND X2
compare(x1, x2);

// TASK 5: INCREMENT X2
System.out.println("\nINCREMENTING X2:");
System.out.println("BEFORE x2 = " + x2.toString() + " value = " + x2.getValue());
x2.increment();
System.out.println("AFTER x2 = " + x2.toString() + " value = " + x2.getValue());

}

static void compare(Fraction x1, Fraction x2) {
if (x1.equalTo(x2))
System.out.println("x1 and x2 are equal in value.");
else if (x1.getValue() > x2.getValue())
System.out.println("x1 is greater than x2.");
else
System.out.println("x1 is less than x2.");
}
}
