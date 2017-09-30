package Test;

/**
 * Created by muridjonrahimov on 9/28/17.
 */

public class Manager extends Clerk {

    private String changePositionClerk;

    public void printPossition() {
        System.out.println("I am a manager");
    }
    public String changeClerk(String printPositionClerk) {
        this.changePositionClerk = printPositionClerk;
        return printPositionClerk;
    }
}
