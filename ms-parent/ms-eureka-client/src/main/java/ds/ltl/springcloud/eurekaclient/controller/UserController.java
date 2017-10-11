package ds.ltl.springcloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ds.ltl.springcloud.eurekaclient.entity.User;

/**
 * 业务层
 * 
 * @author ltl
 * @date 2017年7月19日 下午2:34:46
 */

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

	@Autowired
	private Environment env;

	@RequestMapping("/{name}")
	public User getUser(@PathVariable("name") String name) {
		return new User(env.getProperty("spring.application.name") + ":"
				+ env.getProperty("server.port"), name);
	}
	
	@RequestMapping("/getUserById")
	public User getUserById(@RequestParam("id") String id){
		return new User(id,env.getProperty("spring.application.name") + ":"
				+ env.getProperty("server.port"));
	}

}
