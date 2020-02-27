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

    public boolean isDeluxe(Integer n, boolean verifyThree, boolean verifyFive){
        if(n % 3 == 0 && verifyThree == true){
            return true;
        }
        if(n % 5 == 0 && verifyFive == true){
            return true;
        }
        return false;
    }

    public boolean checkFake(Integer n){
        if(n%2 == 0){
            return false;
        }
        return true;
    }

    public String print(boolean three, boolean five, boolean deluxe, boolean fake){
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
            if(fake == true){
                returnat += " fake deluxe";
            } else {
                returnat += " deluxe";
            }
        }
        return returnat;
    }

    public String fizzBuzz(Integer number) {
        String solutie = print(checkThree(number,hasThree(number)),checkFive(number,hasFive(number)),isDeluxe(number, hasThree(number), hasFive(number)), checkFake(number));
        if(solutie.equals("n")){
            return number.toString();
        } else {
            return solutie;
        }
    }

}
