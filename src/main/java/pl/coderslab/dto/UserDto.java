package pl.coderslab.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class UserDto {
	Long id;
	@NotBlank
	private String userName;
	@NotBlank
	private String password;
	private Boolean enabled;
	@Email
	private String email;

}
