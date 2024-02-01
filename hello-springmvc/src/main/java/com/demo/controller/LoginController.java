package com.demo.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.LoginForm;

@Controller
public class LoginController {

	@RequestMapping(method = RequestMethod.GET, path = "userLogin")
	public String loadUserLoginForm(Map model) {
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		return "login"; // view page name
	}

	@RequestMapping(method = RequestMethod.POST, path = "userLogin")
	public String processUserLoginForm(Map model, @Valid LoginForm loginForm, BindingResult result) {
		String uName = loginForm.getUsername();
		String pWord = loginForm.getPassword();

		System.out.println(uName + "====" + pWord);
		
		if (result.hasErrors()) {
			return "login";
		}

		if (uName.equals("Admin") && pWord.equals("admin123")) {
			model.put("welcomeMessage", "Hello, " + uName + "! Welcome to the dashboard!");
			return "welcome";
		}
		model.put("errorMessage", "Oh! Invalid login!");
		return "error";
	}
}
