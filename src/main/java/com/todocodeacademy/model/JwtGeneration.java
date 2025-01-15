/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todocodeacademy.model;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Sergio Rolon
 */
public class JwtGeneration {
    public static String secret = "OneClickCarSoloQuedamos#4";
    
    public void JswGeneration(){
        
    }
 
public static Token generateToken(String email, String typeUsers) {
		  Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR,12); //Prueba/Desarrollo
	//calendar.add(Calendar.HOUR,10);
	
		return new Token(Jwts.builder().setSubject(email).claim("role", typeUsers)
				.setIssuedAt(new Date())
				.setExpiration(calendar.getTime())
				.signWith(SignatureAlgorithm.HS256, secret)
                                .compact());
	}//generateToken
}
