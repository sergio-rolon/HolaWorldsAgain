/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todocodeacademy.model;

/**
 *
 * @author Sergio Rolon
 */
public class Token {
    
private final String accessToken;
	
	public Token(String accesToken) {
		this.accessToken = accesToken;
	}//constructor

	

	public String getAccessToken() {
		return accessToken;
	}//getAccessToken
	
}//Token
