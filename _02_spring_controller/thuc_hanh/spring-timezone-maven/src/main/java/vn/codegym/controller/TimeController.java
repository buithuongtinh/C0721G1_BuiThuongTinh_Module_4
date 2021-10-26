package vn.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeController {
    @GetMapping("/world-clock")
    public String getTimeByTimezone(ModelMap model, @RequestParam(name = "city",required = false,defaultValue = "Asia/Ho_Chi_Minh")String city){

        //lấy thời gian hiện tại
        Date date = new Date();
        //lấy time zone hiện tại
        TimeZone time = TimeZone.getDefault();
        //lấy ra time zone của một thành phố cụ thể
        TimeZone local = TimeZone.getTimeZone(city);
        //tính thời gian hiện tại của một thành phố cụ thể
        long locale_time= date.getTime() +(local.getRawOffset() - time.getRawOffset());
//        Hàm getRawOffset()trả về lượng thời gian tính bằng mili giây để thêm vào UTC để có thời gian chuẩn trong múi giờ này.
        date.setTime(locale_time);

        model.addAttribute("city",city);
        model.addAttribute("date",date);
        return "index";
    }
}
