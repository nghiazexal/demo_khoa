package com.example.demo_khoa.controller;

import com.example.demo_khoa.entity.Khoa;
import com.example.demo_khoa.service.KhoaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/khoa")
@Slf4j
public class KhoaController {
    @Autowired
    private KhoaService khoaService;


    @PostMapping("/")
    public Khoa saveKhoa(@RequestBody Khoa khoa){
        return khoaService.saveKhoa(khoa);
    }


    @GetMapping("/{id}")
    public Khoa findKhoaById(@PathVariable("id") Long khoaId){
        return khoaService.findKhoaById(khoaId);
    }


    @GetMapping("/")
    public String helloWorld(){
        return "heeloo!";
    }
}
