package com.example.LibraryManagementSystem.DTO.RequestDto;

import com.example.LibraryManagementSystem.Enum.Department;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentRequestDto {

    private String name;

    private int age;


    private Department department;

    private String mobNo;
    
}