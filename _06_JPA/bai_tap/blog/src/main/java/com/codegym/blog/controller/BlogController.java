package com.codegym.blog.controller;


import com.codegym.blog.model.Blog;
import com.codegym.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
//@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/list")
    public String findAll(Model model) {
        model.addAttribute("listAll", this.iBlogService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String saveForm(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        this.iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("messageCreate", "add ok" + blog.getName());
        return "redirect:/list";

    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable int id) {
        ModelAndView modelAndView =new ModelAndView("delete");
        modelAndView.addObject("blog",iBlogService.findByid(id));
        return modelAndView;
    }
    @PostMapping("/delete")
    public String deleteBlog (@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.delete(blog.getId());
        redirectAttributes.addFlashAttribute("message", "New blog was successful deleted");
        return "redirect:/list";
    }
    @GetMapping("/edit/{id}")
    public String editshow(Model model,@PathVariable int id){
        model.addAttribute("blog",this.iBlogService.findByid(id));
        return "edit";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute Blog blog){
        this.iBlogService.update(blog);
        return "redirect:/list";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable int id,Model model){
        model.addAttribute("blog",this.iBlogService.findByid(id));
        return "detail";
    }
}
