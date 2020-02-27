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

    public boolean isDeluxe(Integer n){
        int digit = n%10;
        n = n/10;
        if(n > 10){
            while(n > 0){
                if(n%10 != digit){
                    return false;
                }
                n = n/10;
            }
            return true;
        }
        return false;
    }

    public String print(boolean three, boolean five, boolean deluxe){
        String returnat;
        if(three == true && five == false){
            returnat = "fizz";
        } else if(three == false && five == true){
            returnat =  "buzz";
        } else if(three == true && five == true){
            returnat =  "fizz buzz";
        } else {
            returnat = "n";
        }
        if(deluxe == true){
            if(returnat.equals("n")){
                returnat = "deluxe";
            } else {
                returnat += " deluxe";
            }
        }
        return returnat;
    }

    public String fizzBuzz(Integer number) {
        String solutie = print(checkThree(number,hasThree(number)),checkFive(number,hasFive(number)),false);
        if(solutie.equals("n")){
            return number.toString();
        } else {
            return solutie;
        }
    }

}




