/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalermanagementsystem;
import java.util.*;
/**
*
* @author Lynn Abbidi 1083873
* 	Aliya Haidar 1082079
*/
public class SeverityComparator_Sec51_G5 implements Comparator<Patient_Sec51_G5>{
    @Override
    public int compare(Patient_Sec51_G5 p1, Patient_Sec51_G5 p2){
        if(p1.getSeverityLevel()==p2.getSeverityLevel()){
            return 0;
        }else if(p1.getSeverityLevel()>p2.getSeverityLevel()){
            return -1;
        }else return 1;
    }
}
