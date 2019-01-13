package com.keyholesoftware.lambda.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.keyholesoftware.lambda.model.Language;



@RestController
public class LanguageResource {
	List<Language> languages = new ArrayList<Language>();
	@RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/languages")
	public List<Language> listLambdaLanguages() {
		languages.add(new Language("node"));
		languages.add(new Language("java"));
		languages.add(new Language("python"));
		return languages;
	}

}