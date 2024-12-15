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
public class Bed_Sec51_G5 {
    private String id;
    private boolean isFree;
    

    //default constructor 
    public Bed_Sec51_G5(){}
    
    //loaded constructor
    public Bed_Sec51_G5(String id) {
        this.isFree=true;
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public boolean isIsFree() {
        return isFree;
    }
    public void setIsFree(boolean isFree) {
        this.isFree = isFree;
    }
    @Override
    public String toString() {
        return "Bed{" + "id='" + id + '\'' + ", isFree=" + isFree + ", bedType='" + '\'' + '}';
    }

    
    
}
