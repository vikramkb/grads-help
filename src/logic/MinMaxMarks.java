package logic;

public class MinMaxMarks {
    public static void main(String[] args) {
        float maths = 90; // declaration and initialization
        float science = 80;
        float english = 70;
        float telugu = 75;
        float social = 85;
        float hindi = 60;

        float minimum = 0;
        if( maths < science) {
            minimum = maths;
        }else{
            minimum = science;
        }

        if(english < minimum) {
            minimum = english;
        }

        if(telugu < minimum) {
            minimum = telugu;
        }

        if(social < minimum) {
            minimum = social;
        }
        if(hindi < minimum) {
            minimum = hindi;
        }
        System.out.println("Minimum = " + minimum);
    }
}
