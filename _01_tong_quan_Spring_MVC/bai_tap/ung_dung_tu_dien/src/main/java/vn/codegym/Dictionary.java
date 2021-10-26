package vn.codegym;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    @RequestMapping("/dictionary")
    public String loadIndex(){
        return "index";
    }

    @RequestMapping(value = "result",method = RequestMethod.GET)
    public String dictionary(
        @RequestParam("key") String key,
        Model model
    ){
        Map<String, String> maps = new HashMap<>();
        maps.put("love", "yêu");
        maps.put("like", "thích");
        maps.put("death", "tử vong");
        maps.put("live", "sống");
        maps.put("book", "sách");

        if (maps.containsKey(key)) {
            model.addAttribute("result", maps.get(key));
        } else {
            model.addAttribute("message", "Not found");
        }
        return "view";
    }

}
