/*class InvalidValueException extends Exception{
        InvalidValueException(String s){
        super(s);
        }
        }

class Main {
    static void validate(int int_val) throws InvalidValueException {
        if ( int_val & amplt;10)         //value is valid if &amp;gt; 10 else throw exception
        throw new InvalidValueException("Invalid value");
     else
        System.out.println("This is valid integer");
    }

    public static void main(String args[]) {
        try {
            validate(9);
        } catch (Exception m) {
            System.out.println("Exception occured: " + m);
        }

        System.out.println("Code after Exception");
    }
}*/