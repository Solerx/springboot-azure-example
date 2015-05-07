package pt.jimmyboys.azuresample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Startup class that is used by spring-boot
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    /**
     * Method that is responsible for the application startup
     *
     * @param args parameters that can be passed in the command line
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

}
