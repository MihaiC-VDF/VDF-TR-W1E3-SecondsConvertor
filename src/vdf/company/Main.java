package vdf.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Initialising the convertor
        SecondsConvertor secConvertor = new SecondsConvertor();

//        Calling the appropriate interface to convert our seconds
        secConvertor.convertor(7377);

//        Closing/deleting the calculator instance
        secConvertor = null;
    }
}
