public class Calculator{

    double res = 0;
    double operNotM(String operation, String firstNum, String secNum){

        switch(operation){
            case "+": return plusNotM(firstNum,secNum);
            case "-": return minusNotM(firstNum,secNum);
            case "*": return multiplyNotM(firstNum,secNum);
            case "/": return divideNotM(firstNum,secNum);
        }
        return 0;
    }

    double operWithM(String operTwo, String firstNum, String secNum){

        switch(operTwo){
            case "+": return plusM(firstNum,secNum);
            case "-": return minusM(firstNum,secNum);
            case "*": return multiplyM(firstNum,secNum);
            case "/": return divideM(firstNum,secNum);
        }
        return 0;
    }

    private double plusNotM(String firstNum, String secNum){
        double first = 0;
        double second = 0;

        if (firstNum.equalsIgnoreCase("M")&&
                !secNum.equalsIgnoreCase("M")){
            first = res;
            second = Double.parseDouble(secNum);
        }

        else if (!firstNum.equalsIgnoreCase("M")&&
                secNum.equalsIgnoreCase("M")){
            first = Double.parseDouble(firstNum);
            second = res;
        }

        else if(firstNum.equalsIgnoreCase("M")&&
                secNum.equalsIgnoreCase("M")){
            first = res;
            second = res;
        }

        else {
            first = Double.parseDouble(firstNum);
            second = Double.parseDouble(secNum);
        }

        return first + second;
    }

    private double minusNotM(String firstNum, String secNum){

        double first = 0;
        double second = 0;
        if (firstNum.equalsIgnoreCase("M")&&
                !secNum.equalsIgnoreCase("M")){
            first = res;
            second = Double.parseDouble(secNum);
        }

        else if (!firstNum.equalsIgnoreCase("M")&&
                secNum.equalsIgnoreCase("M")){
            first = Double.parseDouble(firstNum);
            second = res;
        }

        else if(!firstNum.equalsIgnoreCase("M")&&
                !secNum.equalsIgnoreCase("M")){
            first = Double.parseDouble(firstNum);
            second = Double.parseDouble(secNum);
        }

        else if(firstNum.equalsIgnoreCase("M")&&
                secNum.equalsIgnoreCase("M")){
            first = res;
            second = res;
        }
        return first - second;
    }

    private double multiplyNotM(String firstNum, String secNum){
        double first = 0;
        double second = 0;
        if (firstNum.equalsIgnoreCase("M")&&
                !secNum.equalsIgnoreCase("M")){
            first = res;
            second = Double.parseDouble(secNum);
        }

        else if (!firstNum.equalsIgnoreCase("M")&&
                secNum.equalsIgnoreCase("M")){
            first = Double.parseDouble(firstNum);
            second = res;
        }

        else if(!firstNum.equalsIgnoreCase("M")&&
                !secNum.equalsIgnoreCase("M")){
            first = Double.parseDouble(firstNum);
            second = Double.parseDouble(secNum);
        }

        else if(firstNum.equalsIgnoreCase("M")&&
                secNum.equalsIgnoreCase("M")){
            first = res;
            second = res;
        }
        return first * second;
    }

    private double divideNotM(String firstNum, String secNum){

        double first = 0;
        double second = 0;

        if (firstNum.equalsIgnoreCase("M")&&
                !secNum.equalsIgnoreCase("M")){
            first = res;
            second = Double.parseDouble(secNum);
        }

        else if (!firstNum.equalsIgnoreCase("M")&&
                secNum.equalsIgnoreCase("M")){
            first = Double.parseDouble(firstNum);
            second = res;
        }

        else if(!firstNum.equalsIgnoreCase("M")&&
                !secNum.equalsIgnoreCase("M")){
            first = Double.parseDouble(firstNum);
            second = Double.parseDouble(secNum);
        }

        else if(firstNum.equalsIgnoreCase("M")&&
                secNum.equalsIgnoreCase("M")){
            first = res;
            second = res;
        }

        return first / second;
    }

    private double plusM(String firstNum, String secNum){
        double first = 0;
        double second = 0;

        if (firstNum.equalsIgnoreCase("M")&&
                !secNum.equalsIgnoreCase("M")){
            first = res;
            second = Double.parseDouble(secNum);
        }

        else if (!firstNum.equalsIgnoreCase("M")&&
                secNum.equalsIgnoreCase("M")){
            first = Double.parseDouble(firstNum);
            second = res;
        }

        else if(!firstNum.equalsIgnoreCase("M")&&
                !secNum.equalsIgnoreCase("M")){
            first = Double.parseDouble(firstNum);
            second = Double.parseDouble(secNum);
        }

        else if(firstNum.equalsIgnoreCase("M")&&
                secNum.equalsIgnoreCase("M")){
            first = res;
            second = res;
        }

        res = first + second;
        return res;
    }

    private double minusM(String firstNum, String secNum){

        double first = 0;
        double second = 0;

        if (firstNum.equalsIgnoreCase("M")&&
                !secNum.equalsIgnoreCase("M")){
            first = res;
            second = Double.parseDouble(secNum);
        }

        else if (!firstNum.equalsIgnoreCase("M")&&
                secNum.equalsIgnoreCase("M")){
            first = Double.parseDouble(firstNum);
            second = res;
        }

        else if(!firstNum.equalsIgnoreCase("M")&&
                !secNum.equalsIgnoreCase("M")){
            first = Double.parseDouble(firstNum);
            second = Double.parseDouble(secNum);
        }

        else if(firstNum.equalsIgnoreCase("M")&&
                secNum.equalsIgnoreCase("M")){
            first = res;
            second = res;
        }

        res = first - second;
        return res;
    }

    private double multiplyM(String firstNum, String secNum){
        double first = 0;
        double second = 0;

        if (firstNum.equalsIgnoreCase("M")&&
                !secNum.equalsIgnoreCase("M")){
            first = res;
            second = Double.parseDouble(secNum);
        }

        else if (!firstNum.equalsIgnoreCase("M")&&
                secNum.equalsIgnoreCase("M")){
            first = Double.parseDouble(firstNum);
            second = res;
        }

        else if(!firstNum.equalsIgnoreCase("M")&&
                !secNum.equalsIgnoreCase("M")){
            first = Double.parseDouble(firstNum);
            second = Double.parseDouble(secNum);
        }

        else if(firstNum.equalsIgnoreCase("M")&&
                secNum.equalsIgnoreCase("M")){
            first = res;
            second = res;
        }

        res = first * second;
        return res;
    }

    private double divideM(String firstNum, String secNum){
        double first = 0;
        double second = 0;

        if (firstNum.equalsIgnoreCase("M")&&
                !secNum.equalsIgnoreCase("M")){
            first = res;
            second = Double.parseDouble(secNum);
        }

        else if (!firstNum.equalsIgnoreCase("M")&&
                secNum.equalsIgnoreCase("M")){
            first = Double.parseDouble(firstNum);
            second = res;
        }

        else if(!firstNum.equalsIgnoreCase("M")&&
                !secNum.equalsIgnoreCase("M")){
            first = Double.parseDouble(firstNum);
            second = Double.parseDouble(secNum);
        }

        else if(firstNum.equalsIgnoreCase("M")&&
                secNum.equalsIgnoreCase("M")){
            first = res;
            second = res;
        }

        res = first / second;
        return res;
    }

    public boolean checkString(String string){

        if (string == null || string.length() == 0) return false;
        int i = 0;

        if (string.charAt(0) == '-'){
            if (string.length() == 1){
                return false;
            }
            i = 1;
        }
        char c;

        for (; i < string.length(); i++){
            c = string.charAt(i);
            if (!(c >= '0' && c <= '9')){
                return false;
            }
        }
        return true;
    }
}