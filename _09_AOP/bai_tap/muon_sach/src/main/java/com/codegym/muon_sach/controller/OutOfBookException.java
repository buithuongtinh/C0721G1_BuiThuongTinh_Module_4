package com.codegym.muon_sach.controller;

public class OutOfBookException extends Exception {
    public OutOfBookException(String message) {
        super(message);
    }
}
