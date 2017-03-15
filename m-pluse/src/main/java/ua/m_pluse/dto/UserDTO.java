package ua.m_pluse.dto;

import java.time.LocalDate;

import ua.m_pluse.entity.Role;

public class UserDTO {

	private int id;
	private String name;
	private String email;
	private String phone;
	private String message;
	private Role role;
	private LocalDate dateOfPublic;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public UserDTO(int id, String name, String email, String phone, String message) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.message = message;		
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public LocalDate getDateOfPublic() {
		return dateOfPublic;
	}

	public void setDateOfPublic(LocalDate dateOfPublic) {
		this.dateOfPublic = dateOfPublic;
	}
	
	
}