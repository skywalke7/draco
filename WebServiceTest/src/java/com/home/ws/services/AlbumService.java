/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home.ws.services;

import com.home.ws.forms.MusicalGroup;
import java.util.List;

/**
 *
 * @author root
 */
public interface AlbumService {
    
    public MusicalGroup getAlbumByArtist(String name);
    public String getId(String name);
    
}
