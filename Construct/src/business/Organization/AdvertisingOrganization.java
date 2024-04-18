/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import Advertising.AdCampaignList;
import Advertising.MediaandAdoption;
import Advertising.SelectAdOptionList;
import business.Role.AdCompanyRole;
import business.Role.AdManagerRole;
import business.Role.LabAssistantRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AdvertisingOrganization extends Organization{
     AdCampaignList adcampaignlist;
    MediaandAdoption mediaadlist;
    SelectAdOptionList selectedad;
   
    public AdvertisingOrganization() {
        super(Organization.Type.Advertising.getValue());
        
        adcampaignlist= new AdCampaignList();
        mediaadlist= new MediaandAdoption();
        selectedad= new SelectAdOptionList();
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdCompanyRole());
        roles.add(new AdManagerRole());
        return roles;
    }

    public AdCampaignList getAdcampaignlist() {
        return adcampaignlist;
    }

    public void setAdcampaignlist(AdCampaignList adcampaignlist) {
        this.adcampaignlist = adcampaignlist;
    }

    public MediaandAdoption getMediaadlist() {
        return mediaadlist;
    }

    public void setMediaadlist(MediaandAdoption mediaadlist) {
        this.mediaadlist = mediaadlist;
    }

    public SelectAdOptionList getSelectedad() {
        return selectedad;
    }

    public void setSelectedad(SelectAdOptionList selectedad) {
        this.selectedad = selectedad;
    }
     
   
    
    
}
