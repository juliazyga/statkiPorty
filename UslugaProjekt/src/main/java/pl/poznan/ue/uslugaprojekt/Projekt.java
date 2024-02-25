/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.poznan.ue.uslugaprojekt;

import java.util.HashMap;
import java.util.Map;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Julia
 */
@WebService(serviceName = "Projekt")
public class Projekt {

    Map<String, Statek> statkiWgMmsi = new HashMap<>();
    Map<String, Port> portyWgNazw = new HashMap<>();
    
    /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "zarejestrujStatek")
    public int zarejestrujStatek (
            @WebParam(name = "mmsi") String mmsi,
            @WebParam(name = "name") String name,
            @WebParam(name = "flag") String flag,
            @WebParam(name = "vtype") String vtype,
            @WebParam(name = "picture") byte[] picture,
            @WebParam(name = "grossTonnage") String grossTonnage) {
        Statek nowyStatek = new Statek(mmsi, name, flag, vtype, picture, grossTonnage);
        statkiWgMmsi.put(mmsi, nowyStatek); 
        
        return (statkiWgMmsi.size());
    }
    
    @WebMethod(operationName = "pobierzStatekWgMmsi")
    public Statek pobierzStatekWgMmsi(@WebParam(name = "mmsi") String mmsi) 
    {
        return statkiWgMmsi.get(mmsi);
    }
    
    @WebMethod(operationName = "zarejestrujPort")
    public int zarejestrujPort (
            @WebParam(name = "name") String name,
            @WebParam(name = "country") String country,
            @WebParam(name = "lat") double lat,
            @WebParam(name = "lon") double lon) {
        Port nowyPort = new Port(name, country, lat, lon);
        portyWgNazw.put(name, nowyPort); 
        
        return (portyWgNazw.size());
    }
    
    @WebMethod(operationName = "pobierzPortWgNazwy")
    public Port pobierzPortWgNazwy(@WebParam(name = "name") String name)
    {
        return portyWgNazw.get(name);
    }
    
}
