package com.example.flyawayairlines.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Remplacez cette logique par une recherche réelle dans votre base de données
        if ("admin".equals(username)) {
            return new User("admin", "{noop}password", Collections.emptyList());
        }
        throw new UsernameNotFoundException("Utilisateur non trouvé : " + username);
    }
}