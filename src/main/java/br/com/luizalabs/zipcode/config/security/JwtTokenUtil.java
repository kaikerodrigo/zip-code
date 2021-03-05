package br.com.luizalabs.zipcode.config.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;

@Component
public class JwtTokenUtil implements Serializable {
	private static final long serialVersionUID = -2550185165626007488L;

	@Value("${jwt.secret}")
	private String secret;

	public String getUsernameFromToken(String token) {
		return getClaimFromToken(token, Claims::getSubject);
	}

	public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
		final Claims claims = getAllClaimsFromToken(token);
		return claimsResolver.apply(claims);

	}

	private Claims getAllClaimsFromToken(String token) {
		return Jwts.parser()
				.setSigningKey(secret.getBytes(StandardCharsets.UTF_8)).parseClaimsJws(token).getBody();
	}

}