package com.osf.sp.filter;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import com.osf.sp.auth.MakeJWT;
import com.osf.sp.vo.UserInfoVO;

import lombok.extern.slf4j.Slf4j;

// @Component
@Slf4j
public class CheckJWTFilter extends GenericFilterBean{
	
	@Resource
	private MakeJWT mjwt;
//	private static final String[] EXCLUDE_URIS = {"/login", "/join", "/view"};
//	
//	public boolean checkUri(String uri) {
//		for(String excludeUri : EXCLUDE_URIS) {
//			if(uri.indexOf(excludeUri)!=-1)) {
//				return false;
//			}
//		}
//		return true;
//	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		String method = req.getMethod();
		
		String uri = req.getRequestURI();
		
		log.info("JWT method => {}", method);
		if(!req.getRequestURI().equals("/login") 
					&& !req.getRequestURI().equals("/join")
					&& !method.equals("OPTIONS")) {
			
			String uiId = req.getHeader("X-AUTH-ID");
			String tokken = req.getHeader("X-AUTH-TOKKEN");
			try {
				UserInfoVO ui = new UserInfoVO();
				ui.setUiId(uiId);
				mjwt.checkJWT(tokken, ui);
			} catch(Exception e) {
				log.error("JWT error => {}", tokken);
				throw new ServletException("토큰키가 올바르지 않습니다.");
			}
		}				
		chain.doFilter(request, response); // 성공했다는 가정
	}

}
