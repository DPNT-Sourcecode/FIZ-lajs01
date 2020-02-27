package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {
    public boolean checkThree(Integer number, boolean verify){
        if(number % 3 == 0 || verify == true){
            return true;
        }
        return false;
    }

    public boolean checkFive(Integer number, boolean verify){
        if(number % 5 == 0 || verify == true){
            return true;
        }
        return false;
    }

    public boolean hasThree(Integer n){
        while(n > 0){
            if(n % 10 == 3){
                return true;
            }
            n = n/10;
        }
        return false;
    }

    public boolean hasFive(Integer n){
        while(n > 0){
            if(n % 10 == 5){
                return true;
            }
            n = n/10;
        }
        return false;
    }

    public String print(boolean three, boolean five){
        if(three == true && five == false){
            return "fizz";
        } else if(three == false && five == true){
            return "buzz";
        } else if(three == true && five == true){
            return "fizz buzz";
        } else {
            return "n";
        }
    }

    public String fizzBuzz(Integer number) {
        String solutie = print(checkThree(number),checkFive(number));
        if(solutie.equals("n")){
            return number.toString();
        } else {
            return solutie;
        }
    }

}
