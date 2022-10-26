import java.util.logging.Level;
import java.util.logging.Logger;


//LogginLab class
public class LogginLab {

    private final static Logger logger = Logger.getLogger(LogginLab.class.getName());

    //threshold is 0
    private Integer threshold = 0;


    //constructor
    public LogginLab() {
        this.threshold = 0;
    }

    public static void main(String[] args) {

        logger.log(Level.INFO, "Hello World!");
        logger.log(Level.SEVERE, "Terrible Error!");
        logger.log(Level.WARNING, "Not So Bad Error!");

        logger.log(Level.INFO, "****\n\tAt ZipCode, \n\twe don't use System.out.Println \n\tuntil we've earned the right.\n****");

    }
    //creates the getThreshold method
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public boolean thresholdExceeds(Integer limit) {
        return (this.threshold > limit);
    }

    //Creating thresholdReached method here
    public boolean thresholdReached(Integer limit) { return (this.threshold < limit); }

    // Write a method called thresholdReached, returns true if argument 'limit' is over the threshold.
    // Write a test for the method in the Test class.
}
