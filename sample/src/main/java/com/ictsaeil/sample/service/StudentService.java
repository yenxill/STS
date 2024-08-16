package com.ictsaeil.sample.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ictsaeil.sample.mapper.StudentMapper;


@Service
public class StudentService {

	@Autowired
	StudentMapper studentMapper;
	
	public List<HashMap<String,Object>> selectStudentInfo(String studentName) {
		List<HashMap<String,Object>> list = studentMapper.selectStudentInfo(studentName);
		return list;
	}
	
	
}
