package hr.OSSAirline.services;

import hr.OSSAirline.models.User;
import hr.OSSAirline.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public void registerUser(User user){
        userRepository.save(user);
    }
}
