
package com.home.ws.facade.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.home.ws.forms.MusicalGroup;

@XmlRootElement(name = "getAlbumByArtistResponse", namespace = "http://facade.ws.home.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAlbumByArtistResponse", namespace = "http://facade.ws.home.com/")
public class GetAlbumByArtistResponse {

    @XmlElement(name = "return", namespace = "")
    private MusicalGroup _return;

    /**
     * 
     * @return
     *     returns MusicalGroup
     */
    public MusicalGroup getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(MusicalGroup _return) {
        this._return = _return;
    }

}
