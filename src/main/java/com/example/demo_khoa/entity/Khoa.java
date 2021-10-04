package com.example.demo_khoa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Khoa {
    @javax.persistence.Id
    @GeneratedValue
    private Long Id;
    private String khoaName;
    private String khoaAddress;
    private String khoaCode;
}
