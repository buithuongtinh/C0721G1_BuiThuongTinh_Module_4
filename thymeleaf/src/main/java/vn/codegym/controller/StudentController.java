package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Student;
import vn.codegym.service.IStudentService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    @Qualifier("studentServiceImpl")
    private IStudentService studentService;

    @GetMapping("/list")
    public ModelAndView showList() {
        return new ModelAndView("/student/list",
                "studentList",
                studentService.findAll());
    }

    @GetMapping("/create")
    public String showCreatePage(Model model) {

        List<String> languageList = new ArrayList<>();
        languageList.add("C#");
        languageList.add("PHP");
        languageList.add("JAVA");

        model.addAttribute("student", new Student());
        model.addAttribute("languageList", languageList);

        return "/student/create";
    }

    @PostMapping("/create")
    public String createStudent(@ModelAttribute Student student,
                                RedirectAttributes redirectAttributes) {
        studentService.save(student);
        redirectAttributes.addFlashAttribute("successMg",
                "");
        return "redirect:/student/list";
    }
}
