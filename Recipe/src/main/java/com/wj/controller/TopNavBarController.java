package com.wj.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wj.domain.Index_TableDTO;
import com.wj.domain.UserInfoDTO;
import com.wj.service.UserService;

@Controller
public class TopNavBarController {

	private static final Logger logger = 
			LoggerFactory.getLogger(TopNavBarController.class);
	
	@Inject
	private UserService service;
	
	@RequestMapping(value="/board/signup",method=RequestMethod.POST)
	public String setUserInfo(
			@RequestParam(value="id_signup_txt",required=true) String id
			,@RequestParam(value="pwd_signup_txt",required=true) String pwd) throws Exception{
	
		UserInfoDTO dto = 
				new UserInfoDTO(id,pwd,"","test02@test.com","test02",
						"test02",1,"1992-11-20",(byte)1,"bookmark");
		logger.info("치직 여기는 컨트롤이다 치지직");
		
			service.signup(dto);
	
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/board/login",method=RequestMethod.POST)
	public String getUserIdAndPwd(
			@RequestParam(value="login_txt",required=true) String id
			,@RequestParam(value="pwd_txt",required=true) String pwd) throws Exception{
		UserInfoDTO dto = new UserInfoDTO();

		dto.setUsr_id(id);
		logger.info("컨트롤러 / id값은 : "+id);
		dto.setUsr_pwd(pwd);
		logger.info("컨트롤러 / pwd값은 : "+pwd);
		
		logger.info("1 이면 로그인 성공!"+service.checkUserIdWithPwd(dto));
		
		return "redirect:/";
	}
	
	
	@RequestMapping(value="/board/result",method=RequestMethod.GET)
	public String getSearchPage(
			@RequestParam(value="search_txt",required=true) String word,Model model){
		model.addAttribute("searchWord",word);
		return "/board/result";
	}

	@RequestMapping(value="/board/upload",method=RequestMethod.GET)
	public void getUploadPage(){
				
	}
	
	@RequestMapping(value="/board/myRef",method=RequestMethod.GET)
	public void getMyRefPage(){
				
	}
	

	
	
}
