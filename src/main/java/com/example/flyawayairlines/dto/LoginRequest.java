package com.example.flyawayairlines.dto;

    public class LoginRequest {
        private String username;
        private String password;

        // Getter pour username
        public String getUsername() {
            return username;
        }

        // Setter pour username
        public void setUsername(String username) {
            this.username = username;
        }

        // Getter pour password
        public String getPassword() {
            return password;
        }

        // Setter pour password
        public void setPassword(String password) {
            this.password = password;
        }
    }