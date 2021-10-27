package vn.codegym.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.model.Email;
import vn.codegym.service.EmailServiceImpl;
import vn.codegym.service.IEmailService;

@Controller
public class EmailController {


    @Autowired
    private IEmailService emailService;

    @GetMapping("/")
    public String display(Model model){
        Email email = new Email();
        model.addAttribute("email",new Email());
        return "edit-form";
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("email") Email email){
        emailService.saveEmail(email);
        return new ModelAndView("display","email",email);
    }
}
