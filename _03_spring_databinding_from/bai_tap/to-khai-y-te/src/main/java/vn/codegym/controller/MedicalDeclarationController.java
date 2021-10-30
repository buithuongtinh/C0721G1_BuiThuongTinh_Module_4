package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Person;
import vn.codegym.service.IPersonService;

@Controller
@RequestMapping("/form")
public class MedicalDeclarationController {

    private IPersonService personService;

    @GetMapping("")
    public String showForm(Model model){
        model.addAttribute("person",new Person());
        return "display";
    }

    @PostMapping(value = "/save")
    public String save(@ModelAttribute("person") Person person, RedirectAttributes redirectAttributes){
        personService.save(person);
        redirectAttributes.addFlashAttribute("msg","Success!!");
        return "redirect:";
    }

}
