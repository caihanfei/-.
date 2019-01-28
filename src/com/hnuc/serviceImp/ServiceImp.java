package com.hnuc.serviceImp;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hnuc.pojo.student;
import com.hnuc.service.studentService;

public class ServiceImp implements studentService{

	@Override
	public List<student> show() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		List<student> list = session.selectList("student.mapper.selAll");
		session.close();
		return list;
	}
	
}
