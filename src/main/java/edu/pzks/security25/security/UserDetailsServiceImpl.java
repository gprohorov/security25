package edu.pzks.security25.security;


/*
  @author   george
  @project   book-social-network
  @class  UserDetailsServiceImpl
  @version  1.0.0 
  @since 05.10.24 - 15.15
*/

import edu.pzks.security25.user.Role;
import edu.pzks.security25.user.User;
import edu.pzks.security25.user.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository repository;
//    private final PasswordEncoder passwordEncoder;

 // @PostConstruct
//  void init() {
//      User user = User.builder()
//              .firstName("John")
//              .lastName("Lennon")
//              .email("john@mail.com")
//              .password(passwordEncoder.encode("password"))
//              .enabled(true)
//              .accountLocked(false)
//              .roles(List.of(Role.USER))
//              .build();
//     repository.save(user);
//  }

    @Override
    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
        return repository.findByEmail(userEmail)
                .orElseThrow(() -> new UsernameNotFoundException("user not found"));
    }
}
