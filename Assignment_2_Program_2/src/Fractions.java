/**
 * public class Fractions {
 
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
**/

public class Fractions{
public static void main(String[] args) {
System.out.println("Test Application for the Fraction class");

// TASK 1: DECLARE SIXFRACTIONS.
Fraction x1 = new Fraction(3, 9);
Fraction x2 = new Fraction(1, 3);
Fraction x3, x4, x5, x6;

// TASK 2: DISPLAY THE FIRST TWO FRACTIONS
System.out.println("x1 = " + x1);
System.out.println("x2 = " + x2);

// TASK 3: COMPARE THE FIRST TWO FRACTIONS
if (x1.equalTo(x2))
System.out.println("\nx1 and x2 are equal.\n");
else
System.out.println("\nx1 and x2 are NOT equal.\n");

// TASK 4: REDUCE THE FIRST FRACTION AND COMPARE AGAIN
x1.reduce();
System.out.println("After reduction, x1 is " + x1);
if (x1.equalTo(x2))
System.out.println("x1 and x2 are equal.\n");
else
System.out.println("x1 and x2 are NOT equal\n.");

// TASK 5: SET X1 TO 5/8
x1.setNumerator(3);
x1.setDenominator(4);
System.out.println("x1 is set to " + x1);

// TASK 6: CREATE A NEW FRACTION BY ADDING X1 AND X2
x3 = x1.add(x2);
System.out.println("\nx3: x1 + x2 = " + x3);


// TASK 7: CREATE A NEW FRACTION BY SUBTRACTING X2 FROM X1
x4 = x1.subtract(x2);
System.out.println("x4: x1 - x2 = " + x4);


// TASK 8: CREATE A NEW FRACTION BY MULTIPLYING X1 BY X2
x5 = x1.multiply(x2);
System.out.println("x5: x1 * x2 = " + x5);


// TASK 9: CREATE A NEW FRACTION BY DIVIDING X1 BY X2
x6 = x1.divide(x2);
System.out.println("x6: x1 / x2 = " + x6);
}
}

