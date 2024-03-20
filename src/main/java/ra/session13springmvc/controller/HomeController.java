package ra.session13springmvc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ra.session13springmvc.model.entity.Dao;
import ra.session13springmvc.service.DaoService;

import java.util.Date;


// Component, Controller, Service, Repository
@Controller // chú thích thành phần controller trong mvc
@RequiredArgsConstructor
//@RequestMapping("")
public class HomeController {
//    @Autowired
//    private DaoService daoService;
    // DI - controller
    private final DaoService daoService;
//    private DaoService daoService;
//    @Autowired
//    public void setDaoService(DaoService daoService) {
//        this.daoService = daoService;
//    }

    @RequestMapping({"/","/home","/hello"})
    public String home(Model model){
        model.addAttribute("list",daoService.getAll());
        return "home";
    }

    @RequestMapping("/model-and-view")
    public ModelAndView getModel(){
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("nam","Nguyễn Văn A");
        modelAndView.addObject("age",30);
        return modelAndView;
    }



}
