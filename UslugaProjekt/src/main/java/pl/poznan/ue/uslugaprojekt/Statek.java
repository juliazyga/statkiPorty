/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.poznan.ue.uslugaprojekt;

/**
 *
 * @author Julia
 */
public class Statek {
    private String mmsi;
    private String name;
    private String flag;
    private String vtype;
    private byte[] picture;
    private String grossTonnage;
    
    public Statek(){
        
    }
    
    public Statek(String mmsi, String name, String flag, String vtype, byte[] picture, String grossTonnage) {
        this.mmsi = mmsi;
        this.name = name;
        this.flag = flag;
        this.vtype = vtype;
        this.picture = picture;
        this.grossTonnage = grossTonnage;
    }

    public String getMmsi() {
        return mmsi;
    }

    public void setMmsi(String mmsi) {
        this.mmsi = mmsi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getVtype() {
        return vtype;
    }

    public void setVtype(String vtype) {
        this.vtype = vtype;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getGrossTonnage() {
        return grossTonnage;
    }

    public void setGrossTonnage(String grossTonnage) {
        this.grossTonnage = grossTonnage;
    }
    
    
}
