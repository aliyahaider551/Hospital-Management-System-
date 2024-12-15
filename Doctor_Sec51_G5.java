/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalermanagementsystem;
/**
*
* @author Lynn Abbidi 1083873
* 	 Aliya Haidar 1082079
*/

public class Doctor_Sec51_G5 {
     String id;
     String name;
     String specialization;
     boolean isAvailable;
     Shift_Sec51_G5 shift; 

    // Default constructor
    public Doctor_Sec51_G5() {
        this.isAvailable = true;
    }

    // Loaded constructor with shift details
    public Doctor_Sec51_G5(String id, String name, String specialization, Shift_Sec51_G5 shift) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.isAvailable = true;
        this.shift = shift;
    }

    // Setters and Getters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Shift_Sec51_G5 getShift() {
        return shift;
    }
    public void setShift(Shift_Sec51_G5 shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", name=" + name + ", specialization=" + specialization + ", isAvailable=" + isAvailable + ", shift=" + shift + '}';
    }

   
}
