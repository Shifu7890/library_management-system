package com.example.LibraryManagementSystem.Service;


import com.example.LibraryManagementSystem.DTO.RequestDto.StudentRequestDto;
import com.example.LibraryManagementSystem.DTO.RequestDto.UpdateStudentMobRequestDto;
import com.example.LibraryManagementSystem.DTO.ResponseDto.StudentResponseDto;
import com.example.LibraryManagementSystem.DTO.ResponseDto.UpdateStudentMobNoResponseDto;
import com.example.LibraryManagementSystem.Exception.StudentNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    public String addStudent(StudentRequestDto studentRequestDto);

    public StudentResponseDto getStudentById(int id);

    public UpdateStudentMobNoResponseDto updateMobNo(UpdateStudentMobRequestDto updateStudentMobRequestDto) throws StudentNotFoundException;
    
}
