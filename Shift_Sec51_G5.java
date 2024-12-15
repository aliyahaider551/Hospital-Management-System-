/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalermanagementsystem;

/**
 *
* @author Lynn Abbidi 1083873
* 	Aliya Haidar 1082079
 */

public class Shift_Sec51_G5 {
    private String shiftType; 
    private int startTime; 
    private int endTime;   

    // Constructor
    public Shift_Sec51_G5(String shiftType, int startTime, int endTime) {
        this.shiftType = shiftType;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters and Setters
    public String getShiftType() {
        return shiftType;
    }
    public void setShiftType(String shiftType) {
        this.shiftType = shiftType;
    }

    public int getStartTime() {
        return startTime;
    }
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return shiftType + " shift (" + startTime + " - " + endTime + ")";
    }
}