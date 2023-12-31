package com.oracle.S202350102.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class JkController {


	@RequestMapping(value ="mypage")
	public String mypage() {
		System.out.println("JkController mypage Start...");
		
		return "mypage";
	}
	
	@RequestMapping(value ="/jk/memberupdate")
	public String memberupdate() {
		System.out.println("JkController memberupdate Start...");
		
		return "/jk/memberupdate";
	}
}
