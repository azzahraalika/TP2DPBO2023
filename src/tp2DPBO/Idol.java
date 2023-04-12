/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2DPBO;

/**
 *
 * @author Kristiyant Ponty Y
 */
public class Idol {
    private String nama;
    private String agensi;
    private String tahun;
    private String member;
    
    public Idol(){}
    public Idol(String nama, String agensi, String tahun, String member){
        this.nama = nama;
        this.agensi = agensi;
        this.tahun = tahun;
        this.member = member;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAgensi(String agensi){
        this.agensi = agensi;
    }
    public void setTahun(String tahun){
        this.tahun = tahun;
    }
    public void setMember(String member){
        this.member = member;
    }
    
    public String getNama(){
        return this.nama;
    }
    public String getAgensi(){
        return this.agensi;
    }
    public String getTahun(){
        return this.tahun;
    }
    public String getMember(){
        return this.member;
    }
}
