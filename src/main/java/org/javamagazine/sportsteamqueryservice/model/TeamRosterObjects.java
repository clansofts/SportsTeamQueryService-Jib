package org.javamagazine.sportsteamqueryservice.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.javamagazine.sportsteamqueryservice.entity.TeamRoster;

/**
 *
 * @author juneau
 */
@XmlRootElement
@XmlSeeAlso(TeamRoster.class)
public class TeamRosterObjects extends ArrayList<TeamRoster> implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    public TeamRosterObjects(){
        super();
    }
    
    public TeamRosterObjects(Collection<? extends TeamRoster> c){
        super(c);
    }
    
    @XmlElement(name="teamRoster")
    public List<TeamRoster> getTeamRosterObjects(){
        return this;
    }
    
    public void setMyAssets(List<TeamRoster> teamRosterObjects){
        this.addAll(teamRosterObjects);
    }
}
