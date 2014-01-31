public class Romans {
public static void main(String[] args) {
System.out.println("Test Application for RomanApp");

//TASK 1: DECLARE TWO ROMAN NUMERALS. 
RomanNumeral x1 = new RomanNumeral("DXI");
RomanNumeral x2 = new RomanNumeral();

//TASK 2: VERIFY THE INITIAL VALUES OF BOTH OBJECTS\
System.out.println("x1 decimal = " + x1.decimalValue() + " roman = " + x1.romanValue());
System.out.println("x2 decimal = " + x2.decimalValue() + " roman = " + x2.romanValue());

//TASK 3: RESET THE ROMAN VALUE FOR X2
System.out.println("\nRESET X2:");
System.out.println("BEFORE decimal = " + x2.decimalValue() + " roman = " + x2.romanValue());
x2.setRoman("XID");
System.out.println("AFTER decimal = " + x2.decimalValue() + " roman =" + x2.romanValue());

//TASK 4: COMPARE X1 AND X2
compare (x1, x2);

//TASK 5: INCREMENT X2
System.out.println("\nINCREMENTING X2:");
System.out.println("BEFORE decimal = " + x2.decimalValue() + " roman =" + x2.romanValue());
x2.increment();
System.out.println("AFTER decimal = " + x2.decimalValue() + " roman =" + x2.romanValue());
compare (x1, x2);
}

static void compare (RomanNumeral x1, RomanNumeral x2){
if (x1.equalTo(x2.romanValue()))
System.out.println("x1 and x2 are equal in value.");
else if (x1.decimalValue() > x2.decimalValue())
System.out.println("x1 is greater than x2.");
else
System.out.println("x1 is less than x2.");
}

}
