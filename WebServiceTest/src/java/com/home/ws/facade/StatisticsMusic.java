/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home.ws.facade;

import com.home.ws.forms.MusicalGroup;
import com.home.ws.servicesImpl.AlbumServiceImpl;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author norveos
 */
@WebService(serviceName = "StatisticsMusic")
public class StatisticsMusic {
    
    AlbumServiceImpl albumServiceImpl;
    MusicalGroup musicalGroup;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getAlbumByArtist")
    public MusicalGroup getAlbumByArtist(@WebParam(name = "nameArtist") String name) {
        albumServiceImpl = new AlbumServiceImpl();
        
        musicalGroup = albumServiceImpl.getAlbumByArtist(name);
        
        if(musicalGroup != null) {
            System.out.println(musicalGroup.getGroupName());
            System.out.println(musicalGroup.getGroupDescription());
            System.out.println(musicalGroup.getGroupWeb());
        }
        
        return musicalGroup;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getId")
    public String getId(@WebParam(name = "name") String name) {
        albumServiceImpl = new AlbumServiceImpl();
        String sId = albumServiceImpl.getId(name);
        return sId;
    }
}
