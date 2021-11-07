package com.codegym.validate_thong_tin_bai_hat.service;


import com.codegym.validate_thong_tin_bai_hat.model.Music;
import com.codegym.validate_thong_tin_bai_hat.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImp implements MusicService {


    @Autowired
    private MusicRepository musicRepository;


    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public void saveMusic(Music music) {
        this.musicRepository.save(music);
    }

    @Override
    public Music findById(int id) {
        return this.musicRepository.findById(id).get();
    }
}
