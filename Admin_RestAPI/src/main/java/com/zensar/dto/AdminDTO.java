package com.zensar.dto;

public class AdminDTO {
    private String name;
    private String password;
    private String email;
    private long phNumber;

   
	public AdminDTO(String name, String password, String email, long phNumber) {
		
		this.name = name;
		this.password = password;
		this.email = email;
		this.phNumber = phNumber;
	}

	
	public AdminDTO() {
		
	}


	public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public long getPhNumber() {
	return phNumber;
    }

    public void setPhNumber(long phNumber) {
	this.phNumber = phNumber;
    }
    
    @Override
   	public String toString() {
   		return "AdminDTO [name=" + name + ", password=" + password + ", email=" + email + ", phNumber=" + phNumber
   				+ "]";
   	}

}
