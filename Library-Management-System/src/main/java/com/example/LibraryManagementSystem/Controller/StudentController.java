package com.example.LibraryManagementSystem.Controller;


import com.example.LibraryManagementSystem.DTO.RequestDto.StudentRequestDto;
import com.example.LibraryManagementSystem.DTO.RequestDto.UpdateStudentMobRequestDto;
import com.example.LibraryManagementSystem.DTO.ResponseDto.UpdateStudentMobNoResponseDto;
import com.example.LibraryManagementSystem.Exception.StudentNotFoundException;
import com.example.LibraryManagementSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    
    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequestDto studentRequestDto){

        return studentService.addStudent(studentRequestDto);
    }

    @PutMapping("/update_mobile")
    public UpdateStudentMobNoResponseDto updateMobNo(@RequestBody UpdateStudentMobRequestDto updateStudentMobRequestDto) throws StudentNotFoundException {

        return studentService.updateMobNo(updateStudentMobRequestDto);
    
    }
}
    
