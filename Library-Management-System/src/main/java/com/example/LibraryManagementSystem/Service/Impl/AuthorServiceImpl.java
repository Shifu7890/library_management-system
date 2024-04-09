package com.example.LibraryManagementSystem.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.LibraryManagementSystem.Service.AuthorService;
import com.example.LibraryManagementSystem.DTO.ResponseDto.AuthorResponseDto;
import com.example.LibraryManagementSystem.Entity.Author;
import com.example.LibraryManagementSystem.Repository.AuthorRepository;

@Service
public class  AuthorServiceImpl implements AuthorService{

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public String addAuthor(Author author) {

        authorRepository.save(author);
        return "Author added";
    }

    @Override
    public AuthorResponseDto getByEmail(String email) {

        Author author = authorRepository.findByEmail(email);

        // prepare response Dto
        AuthorResponseDto authorResponseDto = new AuthorResponseDto();
        authorResponseDto.setName(author.getName());
        authorResponseDto.setAge(author.getAge());

        return authorResponseDto;
    }
}