package spring.mvc.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import spring.mvc.root.service.NameService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class NameController {

    private final NameService nameService;

    @Autowired
    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    @RequestMapping("/index")
    public ModelAndView getHelloWorld(ModelAndView modelAndView) {
        modelAndView.addObject("names", nameService.getAllNames());
        return modelAndView;
    }

    @RequestMapping("/index/{id}")
    public ModelAndView getName(ModelAndView modelAndView, @PathVariable int id) {
        modelAndView.addObject("names", nameService.getNameById(id));
        return modelAndView;
    }

    @RequestMapping("/create")
    public String getCreate() {
        return "create";
    }

    @RequestMapping("/successfullyCreated")
    public String getSuccessfullyCreated() {
        return "successfullyCreated";
    }

    @RequestMapping(value = "/create", method = {RequestMethod.POST})
    public String postCreate(HttpServletRequest servletRequest) {
        System.out.println("Requested name: " + servletRequest.getParameter("name"));
        return "redirect:/successfullyCreated";
    }
}
