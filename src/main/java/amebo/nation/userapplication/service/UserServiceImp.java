package amebo.nation.userapplication.service;

import amebo.nation.userapplication.entity.Role;
import amebo.nation.userapplication.entity.User;
import amebo.nation.userapplication.repository.UserRepository;
import amebo.nation.userapplication.dto.SignupRequest;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void signUp(SignupRequest signupRequest) {
        User user = new User();
        user.setFirstName(signupRequest.getFirstName());
        user.setLastName(signupRequest.getLastName());
        user.setPassword(signupRequest.getPassword());
        user.setEmail(signupRequest.getEmail());
        user.setRole(Role.ADMIN);
        userRepository.save(user);
    }


}
