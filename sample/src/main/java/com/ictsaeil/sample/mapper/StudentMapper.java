package com.ictsaeil.sample.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {

	@Mapper
	public List<HashMap<String,Object>> selectStudentInfo (String studentName);
}
