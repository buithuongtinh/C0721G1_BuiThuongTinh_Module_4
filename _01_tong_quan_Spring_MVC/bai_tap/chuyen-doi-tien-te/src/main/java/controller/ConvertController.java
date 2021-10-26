package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class ConvertController {
    @RequestMapping(value = "/converter")
    public String index(){
        return "index";
    }

@RequestMapping("/usd")
  public String submit (@RequestParam String usd,String rate, Model model){
        float result =Float.parseFloat(usd)*Float.parseFloat(rate);
        model.addAttribute("result1",result);
        return "submit";
}

}
