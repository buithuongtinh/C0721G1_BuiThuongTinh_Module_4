package com.codegym.validate_thong_tin_bai_hat.service;

import com.codegym.validate_thong_tin_bai_hat.model.Music;

import java.util.List;

public interface MusicService {
    List<Music> findAll();
    void saveMusic(Music music);
    Music findById(int id);
}
