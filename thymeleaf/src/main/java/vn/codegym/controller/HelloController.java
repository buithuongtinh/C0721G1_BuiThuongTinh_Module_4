package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.model.Student;
import vn.codegym.service.IStudentService;
import vn.codegym.service.StudentServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = {"/home", "/abc"})
public class HelloController {

    @Qualifier("studentServiceImpl")
    @Autowired
    private IStudentService studentService;
//    private IStudentService studentService = new StudentServiceImpl();

//    private  IStudentService studentService;

//    public HelloController(IStudentService studentService) {
//        this.studentService = studentService;
//    }

//    @Autowired
//    public void setStudentService(IStudentService studentService) {
//        this.studentService = studentService;
//    }

    @RequestMapping(method = RequestMethod.GET,
            consumes = "application/json",
            produces = "application/pdf", params = {"name=hung"})
    public String getHelloPage(Model model,
                               ModelMap modelMap,
                               HttpServletRequest request) {
        String name = request.getParameter("name");

        model.addAttribute("studentName", name);
        modelMap.addAttribute("studentAge", 22);


        return "hello";
    }

    @RequestMapping(method = RequestMethod.GET,
            consumes = "application/json",
            produces = "application/pdf", params = {"id=01"})
    public String getHelloPage5(Model model,
                                ModelMap modelMap,
                                HttpServletRequest request) {
        String name = request.getParameter("name");

        model.addAttribute("studentName", "Tung");
        modelMap.addAttribute("studentAge", 22);


        return "hello";
    }

    //    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @RequestMapping(value = "/hello")
    public ModelAndView getHelloPage1(
//            @RequestParam(value = "classId", required = false, defaultValue = "Phuoc") String myClassd
            @RequestParam String classId, int age
    ) {
        System.err.println(classId);
        System.err.println(age);
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("studentName", "Nguyen Van C");
        modelAndView.addObject("studentAge", 99);

        return modelAndView;
    }

    @RequestMapping("/hello2/{id:[1-5]}/edit")
    public ModelAndView getHelloPage2(Model model, @PathVariable int id) {
        System.err.println(id);

        model.addAttribute("studentName", "Nguyen Van C");
        model.addAttribute("studentAge", 99);

        ModelAndView modelAndView = new ModelAndView("hello");
        return modelAndView;
    }


    @RequestMapping("/hello3")
    public ModelAndView getHelloPage3(Model model) {
        ModelAndView modelAndView
                = new ModelAndView("hello2", "student", new Student(1, "Nguyen Van A", 1, new String[]{"JAVA", "PHP"}));

        model.addAttribute("className", "C0721G1");
        return modelAndView;
    }

    @RequestMapping("/student")
    public ModelAndView getStudentList() {
        ModelAndView modelAndView = new ModelAndView("studentList");
        modelAndView.addObject("studentList", studentService.findAll());

        return modelAndView;
    }

    @RequestMapping("/out")
    public String abc() {
//        return "redirect:/https://www.google.com/"; "/" chuyển hướng trong hệ thống
        return "redirect:https://www.google.com/"; // bo "/" chuyển hướng ngoài hệ thống
    }
}
