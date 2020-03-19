package com.example.restservice;


import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController implements IStringController {

	@RequestMapping("/api/{input}")
	@Override
	public ResponseValue reverseValue(@PathVariable("input") String input) {
		ResponseValue resp= new ResponseValue();

		if(isInputDataValid(input,resp)){
			resp.setReversed(new StringBuilder(input.trim()).reverse().toString());
			resp.setMessage("Success");
		}
		return resp;
	}

	public static boolean isInputDataValid(String input,ResponseValue resp){
		boolean valid=true;
		if(StringUtils.isEmpty(input)){
			resp.setMessage("Empty String");
			valid=false;
		}
		else if(input.length()==1 || input.length()>255){
			resp.setMessage("Enter a valid String");
			valid=false;
		}
		return valid;
	}
}
