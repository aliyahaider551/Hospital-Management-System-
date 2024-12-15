/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalermanagementsystem;

/**
*
* @author Lynn Abbidi 1083873
* 		   Aliya Haidar 1082079
*/
public class Patient_Sec51_G5 {
    //
    private String id;
    private String name;
    private int age;
    private Doctor_Sec51_G5 assignedDoctor;
    private Bed_Sec51_G5 assignedBed;
    private int severityLevel;

    //default constructor 
    public Patient_Sec51_G5(){}
    
    //loaded constructor
    public Patient_Sec51_G5(String id, String n, int a, int sl){
        this.id=id;
        name = n;
        age = a;
        severityLevel = sl;
    }
    
    //Setters and Getters 
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

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Doctor_Sec51_G5 getAssignedDoctor() {
        return assignedDoctor;
    }
    public void setAssignedDoctor(Doctor_Sec51_G5 assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    public Bed_Sec51_G5 getAssignedBed() {
        return assignedBed;
    }
    public void setAssignedBed(Bed_Sec51_G5 assignedBed) {
        this.assignedBed = assignedBed;
    }

    public int getSeverityLevel() {
        return severityLevel;
    }
    public void setSeverityLevel(int severityLevel) {
        this.severityLevel = severityLevel;
    }

    
    
    @Override
    public String toString() {
        return "Patient{" + "ID=" + id + ", Name=" + name + ", Age=" + age + ", Assigned Doctor=" + assignedDoctor + ", Assigned Bed=" + assignedBed + ", Severity Level=" + severityLevel + '}';
    }
    
    
    
}
