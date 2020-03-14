package com.mohshri.mohshriSupport.Dto;

public class EmailData {

	int id;
	String companyName;
	String email;
	long phone;
	String services;
	String aboutProject;
	
	public EmailData() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public String getAboutProject() {
		return aboutProject;
	}

	public void setAboutProject(String aboutProject) {
		this.aboutProject = aboutProject;
	}

	@Override
	public String toString() {
		return "EmailData [id=" + id + ", companyName=" + companyName + ", email=" + email + ", phone=" + phone
				+ ", services=" + services + ", aboutProject=" + aboutProject + "]";
	}
	

	
}
