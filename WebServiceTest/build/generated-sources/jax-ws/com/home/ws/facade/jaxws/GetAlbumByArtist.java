
package com.home.ws.facade.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAlbumByArtist", namespace = "http://facade.ws.home.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAlbumByArtist", namespace = "http://facade.ws.home.com/")
public class GetAlbumByArtist {

    @XmlElement(name = "nameArtist", namespace = "")
    private String nameArtist;

    /**
     * 
     * @return
     *     returns String
     */
    public String getNameArtist() {
        return this.nameArtist;
    }

    /**
     * 
     * @param nameArtist
     *     the value for the nameArtist property
     */
    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

}
