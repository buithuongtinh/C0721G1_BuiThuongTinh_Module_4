package com.codegym.validate_thong_tin_bai_hat.controller;

import com.codegym.validate_thong_tin_bai_hat.dto.MusicDto;
import com.codegym.validate_thong_tin_bai_hat.model.Music;
import com.codegym.validate_thong_tin_bai_hat.service.MusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("music")
public class MusicController {
    @Autowired
    private MusicService musicService;

    @GetMapping("/create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("songObject", new MusicDto());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createMusic(@Valid @ModelAttribute(name = "songObject") MusicDto musicDto, BindingResult bindingResult, Model model) {
        new MusicDto().validate(musicDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "create";
        }
        Music music = new Music();
        BeanUtils.copyProperties(musicDto, music);
        musicService.saveMusic(music);
        return "redirect:/music/list";
    }

    @GetMapping("/list")
    public String showList(Model model) {
        List<Music> music = this.musicService.findAll();
        model.addAttribute("musicList", music);
        return "list";
    }

    @GetMapping("/update/{id}")
    public ModelAndView showEdit(@PathVariable int id) {
        Music music = musicService.findById(id);
        MusicDto musicDto = new MusicDto();
        BeanUtils.copyProperties(music, musicDto);
        return new ModelAndView("edit", "musicList", musicDto);

    }

    @PostMapping("/update")
    public String updateMusic(@Valid @ModelAttribute MusicDto musicDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        new MusicDto().validate(musicDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "edit";
        } else {
            Music music = new Music();
            BeanUtils.copyProperties(musicDto, music);
            this.musicService.saveMusic(music);
            redirectAttributes.addFlashAttribute("messages", "Update done");
            return "redirect:/music/list";
        }
    }


}
