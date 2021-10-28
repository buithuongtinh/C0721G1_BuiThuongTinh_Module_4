package vn.codegym.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Email;


import java.util.ArrayList;
import java.util.List;

@Controller
public class EmailController {


    @GetMapping()
    public String showUpdateMail(Model model) {
        List<String> languegeList = new ArrayList<>();
        languegeList.add("English");
        languegeList.add("Vietnamese");
        languegeList.add("Japanese");
        languegeList.add("Chinese");
        List<Integer> sizeList = new ArrayList<>();
        sizeList.add(5);
        sizeList.add(10);
        sizeList.add(15);
        sizeList.add(25);
        sizeList.add(50);
        sizeList.add(100);
       Email email = new Email();
        model.addAttribute("email", email);
        model.addAttribute("languageList", languegeList);
        model.addAttribute("sizeList", sizeList);
        return "update";
    }
    @PostMapping("/update")
    public String updateMail(@ModelAttribute Email email, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", "Edit success");
        return "redirect:/update";
    }
}
