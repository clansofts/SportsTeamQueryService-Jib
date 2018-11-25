package org.javamagazine.sportsteamqueryservice.service;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CacheRetrieveMode;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.javamagazine.sportsteamqueryservice.entity.TeamRoster;
import org.javamagazine.sportsteamqueryservice.model.TeamRosterObjects;

/**
 *
 * @author juneau
 */
@javax.ejb.Stateless
@Path("teamrosterqueryservice")
public class TeamRosterFacadeREST  {

    @PersistenceContext(unitName = "SportsTeamQueryServicePU")
    private EntityManager em;

    public TeamRosterFacadeREST() {
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public TeamRoster find(@PathParam("id") BigDecimal id) {
        return (TeamRoster) em.createQuery("select object(o) from TeamRoster o " +
                "where o.id = :id")
                .setParameter("id", id)
                .setHint("javax.persistence.cache.retrieveMode", CacheRetrieveMode.BYPASS)
                .getSingleResult();
    }

    @GET
    @Path("findAll")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public TeamRosterObjects findAll() {
        List<TeamRoster> teamList =  em.createQuery("select object(o) from TeamRoster o")
                .setHint("javax.persistence.cache.retrieveMode", CacheRetrieveMode.BYPASS)
                .getResultList();
        TeamRosterObjects teamRosterObjs = new TeamRosterObjects(teamList);
        return teamRosterObjs;
    }

    protected EntityManager getEntityManager() {
        return em;
    }
    
}
