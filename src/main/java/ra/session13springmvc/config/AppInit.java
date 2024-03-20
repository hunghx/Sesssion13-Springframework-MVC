package ra.session13springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import ra.session13springmvc.controller.HomeController;
import ra.session13springmvc.service.DaoService;

import javax.sql.DataSource;


//chú thích
@Configuration // định nghĩa đay lớp cấu hính app
@EnableWebMvc
@ComponentScan(basePackages = "ra.session13springmvc")
public class AppInit implements WebMvcConfigurer {

    // viewResolver - viewName
    @Bean // định nghĩa
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    // cấu hình jbdc template

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/jdbc_template?createDatabaseIfNotExist=true");
        dataSource.setUsername("root");
        dataSource.setPassword("hung18061999");
        return dataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }

//    @Bean
//    public DaoService daoService(){
//        return new DaoService();
//    }
//
//    @Bean
//    public HomeController homeController(){
//        HomeController homeController = new HomeController(daoService());
//        return homeController;
//
//    }

}
