package the.coyote.comuns.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import the.coyote.comuns.model.entity.PersonaEntity;
import the.coyote.comuns.model.entity.User;
import the.coyote.comuns.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByNome(username)
        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
    }

    

}
