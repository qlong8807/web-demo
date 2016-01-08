import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.bean.User;
import com.demo.dao.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/config/spring-common.xml")
public class TestUser {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testAdd(){
		User user = new User();
//		user.setId(1);
		user.setName("att");
		userMapper.save(user);
		
	}
	
	@Test
	public void testFindAll(){
		List<User> findAllList = userMapper.findAll();
		System.out.println(findAllList.size());
	}
	
	@Test
	public void testFindById(){
		User user = userMapper.findById(2);
		System.out.println(user.getId());
		System.out.println(user.getName());
	}


	@Test
	public void testUpdate(){
		User user = new User();
		user.setId(3);
		user.setName("atte");
		userMapper.update(user);
	}
	
	@Test
	public void testDelete(){
		userMapper.delete(1);
	}
}