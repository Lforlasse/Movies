package entities.xx345y657;

import entities.Movie;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-11T12:32:57")
@StaticMetamodel(Movie.class)
public class Movie_ { 

    public static volatile SingularAttribute<Movie, String[]> actors;
    public static volatile SingularAttribute<Movie, Integer> year;
    public static volatile SingularAttribute<Movie, String> createdByUser;
    public static volatile SingularAttribute<Movie, Date> created;
    public static volatile SingularAttribute<Movie, Integer> id;
    public static volatile SingularAttribute<Movie, Date> lastEdited;
    public static volatile SingularAttribute<Movie, String> title;
    public static volatile SingularAttribute<Movie, String> editedByUser;

}