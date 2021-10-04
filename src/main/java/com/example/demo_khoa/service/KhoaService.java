package com.example.demo_khoa.service;

import com.example.demo_khoa.entity.Khoa;
import com.example.demo_khoa.repository.KhoaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KhoaService {

    @Autowired
    private KhoaRepository khoaRepository;
    public Khoa saveKhoa(Khoa khoa){

        return khoaRepository.save(khoa);
    }
   public Khoa findKhoaById(Long khoaId){

       return khoaRepository.findById(khoaId).get();
   }


}
