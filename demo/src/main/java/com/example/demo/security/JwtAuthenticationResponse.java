package com.example.demo.security;
//
//public class JwtAuthenticationResponse {
//
//    private String accessToken;
//    private String role;
//
//    public JwtAuthenticationResponse(String accessToken, String role) {
//        this.accessToken = accessToken;
//        this.role = role;
//    }
//
//    public String getAccessToken() {
//        return accessToken;
//    }
//
//    public void setAccessToken(String accessToken) {
//        this.accessToken = accessToken;
//    }
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//}
//


public class JwtAuthenticationResponse {

    private String accessToken;
    private int id;
    private String role;

    public JwtAuthenticationResponse(String accessToken, int id, String role) {
        this.accessToken = accessToken;
        this.id = id;
        this.role = role;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
