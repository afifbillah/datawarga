/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.kelahiran;
import model.keluarga;
import database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
    import java.util.ArrayList;
/**
 *
 * @author afif
 */
public class transaksi {
    Koneksi Koneksi;
    
    ArrayList<kelahiran> arrKelahiran;
    ArrayList<keluarga> arrKeluarga;
    
    public transaksi () throws SQLException {
        this.Koneksi = new Koneksi();
        this.arrKelahiran = new ArrayList<>();
        this.arrKeluarga = new ArrayList<>();
    }
    
    public ArrayList<kelahiran> getDataKelahiran() throws SQLException {
        this.arrKelahiran.clear();
        ResultSet rs = this.Koneksi.GetData("select * from kelahiran");
        while(rs.next()){
            kelahiran kelahiran = new kelahiran();
            kelahiran.setno_lahir(rs.getString("no_lahir"));
            kelahiran.setno_kk(rs.getString("no_kk"));
            kelahiran.sethari_lahir(rs.getString("hari_lahir"));
            kelahiran.setkota_lahir(rs.getString("kota_lahir"));
            this.arrKelahiran.add(kelahiran);
        }return this.arrKelahiran;
        
    }
    
    public ArrayList<keluarga> getDataKeluarga() throws SQLException {
        this.arrKeluarga.clear();
        ResultSet rs = this.Koneksi.GetData(" select * from keluarga");
        while(rs.next()){
          
            keluarga keluarga = new keluarga();
            keluarga.setnik(rs.getString("nik"));
            keluarga.setno_lahir(rs.getString("no_lahir"));
            keluarga.setno_kk(rs.getString("no_kk"));
            keluarga.setkodepos(rs.getString("kodepos"));
            
            this.arrKeluarga.add(keluarga);
        }return this.arrKeluarga;
    }
}
