package entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;


@Entity
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int year;
    private String title;
    private String[] actors;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date lastEdited;
    
    private String createdByUser;
    
    private String editedByUser;

    public Movie(int year, String name, String[] actors) {
        this.year = year;
        this.title = name;
        this.actors = actors;
        
        this.created = new Date();
        this.lastEdited = new Date();
        this.createdByUser = "Julius-Caesar";
        this.editedByUser = "";
        
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }
    
    
    public Movie() {
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }  
    
}
