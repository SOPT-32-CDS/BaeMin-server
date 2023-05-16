package sopt.org.cds.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.cds.controller.user.dto.UserResponseDto;
import sopt.org.cds.domain.User;
import sopt.org.cds.infrastructure.UserRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public UserResponseDto getUserInfo(Long id) {
        Optional<User> user = userRepository.findById(id);

        if (user.isPresent()) {
            return UserResponseDto.of(user.get().getAddress());
        } else {
            throw new RuntimeException();
        }

    }
}
