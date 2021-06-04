package E_19;

import java.util.Scanner;

public class IsValidNum {
    private Scanner reader = new Scanner(System.in);

    public String promptUser(String statement){
        String holder = null;

        boolean exit = false;
        while(!exit){
            System.out.print(statement);
            holder = reader.next();
            if(checkValid(holder)){


                exit = true;
            }else{
                System.out.println("Please Enter A Valid Number");
                exit = false;
            }
        }

        return holder;
    }




    private boolean checkValid(String Value) {

        try {
            Float.parseFloat(Value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
