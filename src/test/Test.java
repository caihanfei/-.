package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hnuc.pojo.student;


public class Test {
	public static void main(String[] args) throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
//		session.selectList("student.mapper.selAll");
//		student s = session.selectOne("student.mapper.selByNumber", "160920056");
//		System.out.println(s);
		Map<String,Object> map = new HashMap<>();
		int pagesize = 2;
		int pagenumber = 2;
		map.put("pagesize", pagesize);
		map.put("pagestart",pagesize*(pagenumber-1));
		List<student> list =session.selectList("student.mapper.page",map);
		System.out.println(list);
		session.close();
	}
}
