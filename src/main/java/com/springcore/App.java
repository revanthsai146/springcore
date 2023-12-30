package com.springcore;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;

import com.springcore.controller.MovieController;
import com.springcore.sample.Movie;
import com.springcore.service.MovieService;
import com.sun.org.slf4j.internal.LoggerFactory;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages="com.springcore")
@PropertySource("classpath:application.properties")
public class App 
{
	private static final Logger logger=Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
    	
    ApplicationContext container=new AnnotationConfigApplicationContext(App.class);
    MovieService service=container.getBean(MovieService.class);
    MovieController controller=container.getBean(MovieController.class);
    LocalDate date1=LocalDate.of(2022,01,10);
    List<Movie> movies=controller.getMoviesList();
    List<Movie> moviesbydate=controller.getMoviesByDate(date1);
   List<Movie> moviesbycollection=service.getMoviesByCollection(1200);
    logger.info("====================== Movies List ==============================");
    movies.forEach(System.out::println);
    logger.info("====================== Movies List By Release Date ==============================");
    moviesbydate.forEach(System.out::println);
    logger.info("====================== Movies List By Collection ==============================");
    moviesbycollection.forEach(System.out::println);
    
   
   
    
    }
}
