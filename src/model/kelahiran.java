/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author afif
 */
public class kelahiran {
    private String  no_lahir;
    private String no_kk;
    private String hari_lahir;
    private String kota_lahir;
    
    public String getno_lahir(){
        return no_lahir;
    }
    
    public void setno_lahir (String no_lahir){
        this.no_lahir = no_lahir;
    }
    
       public String getno_kk(){
        return no_kk;
    }
    
    public void setno_kk (String no_kk){
        this.no_kk = no_kk;
    }

       public String gethari_lahir(){
        return hari_lahir;
    }
    
    public void sethari_lahir (String hari_lahir){
        this.hari_lahir = hari_lahir;
    }

       public String getkota_lahir(){
        return kota_lahir;
    }
    
    public void setkota_lahir (String kota_lahir){
        this.kota_lahir = kota_lahir;
    }
}
