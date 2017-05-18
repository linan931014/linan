package com.jtjl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jtjl.service.SysUserService;

@Controller
@RequestMapping("/SysUser")
public class SysUserController extends BaseController {
	@Autowired
	private SysUserService userService;
}
