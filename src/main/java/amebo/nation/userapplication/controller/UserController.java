package amebo.nation.userapplication.controller;

import amebo.nation.userapplication.dto.SignupRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import amebo.nation.userapplication.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    private SignupRequest signupRequest;

    @PostMapping("/signup")
    public String signUp(@RequestBody SignupRequest signupRequest){
        userService.signUp(signupRequest);
        return "sign up successful";
    }
}
