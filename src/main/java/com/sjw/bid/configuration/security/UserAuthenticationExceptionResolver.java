package com.sjw.bid.configuration.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class UserAuthenticationExceptionResolver implements
	HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
		HttpServletResponse response, Object handler, Exception ex) {

		return null;
	}

}
