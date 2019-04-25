/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komputer;

/**
 *
 * @author YULISHA
 */
public class main {
    public static void main (String[] args){
        Intel intel1 = new Intel(2);
        AMD amd1 = new AMD(3);
        Komputer Komputer1=new Komputer(intel1);
        
        Komputer1.cetakInfo();
        Komputer1.mencabut(intel1);
        Komputer1.memasang(amd1);
        Komputer1.cetakInfo();
        
    }
    
}
