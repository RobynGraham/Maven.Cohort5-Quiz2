package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {


        if (value > 5) {

            return true;

        }
        return false;

    }

    public Boolean isLessThan7(Integer value) {

        if (value < 7) {
            return true;
        }
        return false;
    }



    public Boolean isBetween5And7(Integer valueToEvaluate) {

        if (valueToEvaluate > 5) {
            return true;
        }
        if (valueToEvaluate < 7) {
            return false;
        } else {
            return true;
        }
    }


    public Boolean startsWith(String string, Character character) {
        String str = "";

//        if(str.startsWith(char[0]))
        return true;
    }
}
