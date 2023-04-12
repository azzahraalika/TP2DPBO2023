/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2DPBO;

/**
 *
 * @author Kristiyant Ponty Y
 */
public class Agensi {
    private String nama;
    private String ceo;
    private String tahun;
    
    public Agensi(){}
    public Agensi(String nama, String ceo, String tahun){
        this.nama = nama;
        this.ceo = ceo;
        this.tahun = tahun;
    }
    
    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setCeo(String ceo) {
        this.ceo = ceo;
    }
    public void setTahun(String tahun){
        this.tahun = tahun;
    }
    
    // getter
    public String getNama() {
        return this.nama;
    }
    public String getCeo() {
        return this.ceo;
    }
    public String getTahun(){
        return this.tahun;
    }
}
