package com.codegym.blog.controller;


import com.codegym.blog.model.Category;
import com.codegym.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/category")
    public String findAllCategory(Model model){
        model.addAttribute("listAllCategory",this.iCategoryService.findAll());
        return "listCategory";
    }
    @GetMapping("/createCategory")
    public String saveCategoryForm(Model model){
        model.addAttribute("category",new Category());
        return "createCategory";
    }
    @PostMapping("/createCategory")
    public String saveCategory(@ModelAttribute Category category, Model model){
        this.iCategoryService.save(category);
        model.addAttribute("category",category);
        return "redirect:/category";
    }
    @GetMapping("/deleteCategory/{id}")
    public String delete(@PathVariable int id, @ModelAttribute Category category, Model model) {
        model.addAttribute("listAllCategory", this.iCategoryService.findByid(id));
        this.iCategoryService.delete(category);
        return "redirect:/category";
    }
}
