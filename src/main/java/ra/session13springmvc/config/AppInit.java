package ra.session13springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import ra.session13springmvc.controller.HomeController;
import ra.session13springmvc.service.DaoService;


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
