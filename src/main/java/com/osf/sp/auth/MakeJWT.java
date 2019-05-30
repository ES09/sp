package com.osf.sp.auth;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.osf.sp.vo.UserInfoVO;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MakeJWT {
	
	private static final Date ISSUE_DATE;
	private static final Date EXPIRE_DATE;
	private static final String SALT = "osf";
	
	static {
		Calendar calendar = Calendar.getInstance();
		ISSUE_DATE = calendar.getTime(); // getTime - 현재시간
		calendar.add(Calendar.DATE, 10); // 일자로 10일을 더한 것
		EXPIRE_DATE = calendar.getTime();
	}
	
	public String makeJWT(UserInfoVO ui) {
		String jwt = JWT.create().withIssuer(ui.getUiId())
							.withIssuedAt(ISSUE_DATE)
							.withExpiresAt(EXPIRE_DATE)
							.sign(Algorithm.HMAC256(SALT));
		log.info("jwt => {}", jwt);
		return jwt;
	}
	
	public void checkJWT(String token, UserInfoVO ui){
		JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SALT))
										.withIssuer(ui.getUiId())
										.build();
		DecodedJWT decode = verifier.verify(token);
		log.info("decode => {}", decode);
		log.info("issuer => {}", decode.getIssuer());
		log.info("issue date => {}", decode.getIssuedAt());
		log.info("expire date => {}", decode.getExpiresAt());
	}
	
	public static void main(String[] args) {
		MakeJWT mjwt = new MakeJWT();
		UserInfoVO ui = new UserInfoVO();
		ui.setUiId("qwe");
		String jwt = mjwt.makeJWT(ui);
		mjwt.checkJWT(jwt, ui);
	}

}
