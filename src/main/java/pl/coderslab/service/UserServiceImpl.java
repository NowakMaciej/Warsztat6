package pl.coderslab.service;

import java.util.Base64;
import java.util.Objects;

import org.springframework.stereotype.Service;

import pl.coderslab.dto.UserDto;
import pl.coderslab.entity.User;
import pl.coderslab.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public UserDto register (UserDto userDto) {
		User user = userRepository.save(createUserFromDto(userDto));
		return getDtoFromUser(user);
		
	}
	
	public Boolean login (UserDto userDto) {
		User user = userRepository.findUserByEmail(userDto.getEmail());
		if (Objects.isNull(user)) {
			return false;
		}
		String password = Base64.getEncoder().encodeToString(userDto.getPassword().getBytes());
		return user.getPassword().equals(password);
	}
	

	private User createUserFromDto(UserDto userDto) {
		User user = new User();
		user.setEmail(userDto.getEmail());
		user.setPassword(Base64.getEncoder().encodeToString(userDto.getPassword().getBytes()));
		user.setEnabled(true);
		user.setUserName(userDto.getUserName());
		return user;
	}
	
	private UserDto getDtoFromUser (User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setEmail(user.getEmail());
		userDto.setUserName(user.getUserName());
		userDto.setEnabled(user.getEnabled());
		return userDto;
	}
}
