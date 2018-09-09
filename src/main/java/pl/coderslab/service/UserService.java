package pl.coderslab.service;

import pl.coderslab.dto.UserDto;

public interface UserService {
	UserDto register (UserDto userDto);
	Boolean login (UserDto userDto);
}
