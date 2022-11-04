package logic;

//Find average, min, max and percentage of marks. If a student has scored below marks in each subject.
//        Maths - 90 out of 100
//        Science - 80
//        English - 70
//        Telugu - 75
//        Social - 85
//        Hindi - 60

// which variables to be used?
// which data type to be used?

public class Marks {
    public static void main(String[] args) {
        // test scenarios
        // all +ve marks
        // decimal points
        float maths = 90; // declaration and initialization
        float science = 80;
        float english = 70;
        float telugu = 75;
        float social = 85;
        float hindi = 60;
        float marksObtained = maths + science + english + telugu + social + hindi; //reusing

        float average = marksObtained / 6;
        System.out.println("Average = " + average);
        float percentage = (marksObtained / 600)*100;
        System.out.println("Percentage = " + percentage);
    }
}
