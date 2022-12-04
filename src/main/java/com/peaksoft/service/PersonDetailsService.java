package com.peaksoft.service;



import com.peaksoft.entity.Person;
import com.peaksoft.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PersonDetailsService implements UserDetailsService {

    @Autowired
    private PersonRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Person person = repository.getByPersonEmail(username);
        if (person == null) {
            throw new UsernameNotFoundException("User not found exception!");
        }
        return person;
    }

}
