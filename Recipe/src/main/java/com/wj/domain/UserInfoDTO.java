package com.wj.domain;

import java.sql.Date;

public class UserInfoDTO {
	private String tableCategory="userinfo";
	private String usr_id, usr_pwd, usr_index, usr_email, usr_platform, usr_name,usr_bookmark;
	private int usr_grade;
	private String usr_birth;
	private byte usr_gender;

	
	
	
	public String getUsr_bookmark() {
		return usr_bookmark;
	}

	public void setUsr_bookmark(String usr_bookmark) {
		this.usr_bookmark = usr_bookmark;
	}

	public String getTableCategory(){
		return tableCategory;
	}
	
	public String getUsr_id() {
		return usr_id;
	}

	public void setUsr_id(String usr_id) {
		this.usr_id = usr_id;
	}

	public String getUsr_pwd() {
		return usr_pwd;
	}

	public void setUsr_pwd(String usr_pwd) {
		this.usr_pwd = usr_pwd;
	}

	public String getUsr_index() {
		return usr_index;
	}

	public void setUsr_index(String usr_index) {
		this.usr_index = usr_index;
	}

	public String getUsr_email() {
		return usr_email;
	}

	public void setUsr_email(String usr_email) {
		this.usr_email = usr_email;
	}

	public String getUsr_platform() {
		return usr_platform;
	}

	public void setUsr_platform(String usr_platform) {
		this.usr_platform = usr_platform;
	}

	public String getUsr_name() {
		return usr_name;
	}

	public void setUsr_name(String usr_name) {
		this.usr_name = usr_name;
	}

	public int getUsr_grade() {
		return usr_grade;
	}

	public void setUsr_grade(int usr_grade) {
		this.usr_grade = usr_grade;
	}

	public String getUsr_birth() {
		return usr_birth;
	}

	public void setUsr_birth(String usr_birth) {
		this.usr_birth = usr_birth;
	}

	public byte getUsr_gender() {
		return usr_gender;
	}

	@Override
	public String toString() {
		return "userDTO [usr_id=" + usr_id + ", usr_pwd=" + usr_pwd + ", usr_index=" + usr_index + ", usr_email="
				+ usr_email + ", usr_platform=" + usr_platform + ", usr_name=" + usr_name + ", usr_grade=" + usr_grade
				+ ", usr_birth=" + usr_birth + ", usr_gender=" + usr_gender + "usr_bookmark="+usr_bookmark+"]";
	}

	public void setUsr_gender(byte usr_gender) {
		this.usr_gender = usr_gender;
	}

	public UserInfoDTO() {

	}

	public UserInfoDTO(String usr_id, String usr_pwd, String usr_index, String usr_email, String usr_platform,
			String usr_name, int usr_grade, String usr_birth, byte usr_gender,String usr_bookmark) {
		this.usr_id = usr_id;
		this.usr_pwd = usr_pwd;
		this.usr_index = usr_index;
		this.usr_email = usr_email;
		this.usr_platform = usr_platform;
		this.usr_name = usr_name;
		this.usr_grade = usr_grade;
		this.usr_birth = usr_birth;
		this.usr_gender = usr_gender;
		this.usr_bookmark = usr_bookmark;
	}

}