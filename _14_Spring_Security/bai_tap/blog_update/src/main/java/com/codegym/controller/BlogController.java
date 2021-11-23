package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"", "/blog"})
public class BlogController {

    @Autowired
    private IBlogService iBlogService;


    @GetMapping(value = {"", "/list"})
    public ModelAndView findAll() {
        return new ModelAndView("list", "listAll", this.iBlogService.findAll());
    }

    @GetMapping("/create")
    public String saveForm(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        this.iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("messAdd", "add" + blog.getHeaderBlog() + "ok");
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String remove(@PathVariable long id) {
        this.iBlogService.delete(id);
        return "redirect:/list";
    }

    @GetMapping("/update/{id}")
    public String updateForm(@PathVariable long id, Model model) {
        model.addAttribute("blog", this.iBlogService.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Blog blog) {
        this.iBlogService.save(blog);
        return "redirect:/list";
    }
}
