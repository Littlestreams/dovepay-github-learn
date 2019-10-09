package com.no4.github.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class HelloWorld {
	@RequestMapping(value="/say")
	public String sayHi() {
		return "hello world";
	}
	@RequestMapping(value="/resay")
	public String resayHi() {
		return "hello world too";
	}
	
	@RequestMapping(value="/commit")
	public String commitInfo() {
		return "修改后提交信息";
	}
	@RequestMapping(value="/remoteCommit")
	public String remoteCommit() {
		return "修改远程仓库信息，更新到本地;"
	}
}
