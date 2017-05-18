package com.jtjl.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jtjl.dao.SysUserDao;
import com.jtjl.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
	// ◊¢»ÎService“¿¿µ
		@Autowired
		private SysUserDao userDao;
}
