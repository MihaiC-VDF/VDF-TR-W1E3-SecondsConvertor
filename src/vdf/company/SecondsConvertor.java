package vdf.company;

public class SecondsConvertor {

    public void convertor(int givenSeconds) {
//        variable to keep track of remaining seconds during conversion
        int remainingSeconds = givenSeconds;

//        Checking the hours, if any, based on the provided seconds and updating the remainingSeconds
        int hours = givenSeconds/3600;
        remainingSeconds = givenSeconds%3600;

//        Checking the hours, if any, based on the remaining seconds and updating the remainingSeconds
        int minutes = remainingSeconds/60;
        remainingSeconds = remainingSeconds%60;

//        Printing out the conversion
        System.out.println("For the provided seconds, " + givenSeconds + ", you have-> " + hours + " Hours, " + minutes + " minutes and " + remainingSeconds + "seconds");

    }

}
