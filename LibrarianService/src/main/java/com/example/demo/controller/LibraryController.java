package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Book;
import com.example.demo.model.Student;

@RestController
@RequestMapping("/librarianService")
public class LibraryController 
{
	@Autowired
	private RestTemplate restTemplate;
@DeleteMapping("/deleteBook/{id}")
public String deleteBookByid(@PathVariable int id)
{
	restTemplate.delete("http://bookservice/bookService/deleteBook/{id}", id);
	return "Deleted Book Sucessfully";
}
@DeleteMapping("/deleteStudent/{id}")
public String deleteStudentByid(@PathVariable int id)
{
	restTemplate.delete("http://studentservice/StudentService/deleteStudent/{id}", id);
	return "Student Deleted Sucessfully";
}
@PostMapping("/addBook1")
public String registerBook(@RequestBody Book book)
{
	String result=restTemplate.postForObject("http://bookservice/bookService/addBook",book,String.class);
	return result;

}
@PostMapping("/addStudent1")
public String addStudent(@RequestBody Student student)
{
	String result=restTemplate.postForObject("http://studentservice/studentService/addStudent",student,String.class);
	return result;
}
}
