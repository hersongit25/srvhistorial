package com.mdm.service.implement;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mdm.model.User;
import com.mdm.service.userSrv;

@Service
public class userSrvImp implements userSrv {

	@Override
	public Map<String,User> testUser(){
		Map<String,User> list = new HashMap<>();
		User us1 = new User(1,"Jakson");
		User us2 = new User(2,"Steve");
		
		list.put("1", us1);
		list.put("2", us2);
		
		return list;
	}
}
