package filepractice;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author jlombardo
 */
public class Garage {
    private String name;
    private double totalHours;
    private double totalFees;


    public Garage(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public double getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(double totalFees) {
        this.totalFees = totalFees;
    }


    
    
}
