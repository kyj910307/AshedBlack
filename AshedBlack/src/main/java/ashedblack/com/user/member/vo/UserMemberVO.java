package ashedblack.com.user.member.vo;

import java.util.Date;

public class UserMemberVO {
	private String userid;
	private String password;
	private String name;
	private String zipcode;
	private String address1;
	private String address2;
	private String tel1;
	private String tel2;
	private String tel3;
	private String email;
	private String gender;
	private String hobby;
	private String terms1;
	private String terms2;
	private String terms3;
	private String year;
	private String month;
	private String day;
	private Date reg_date;
	private Date updt_date;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	public String getTel3() {
		return tel3;
	}
	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getTerms1() {
		return terms1;
	}
	public void setTerms1(String terms1) {
		this.terms1 = terms1;
	}
	public String getTerms2() {
		return terms2;
	}
	public void setTerms2(String terms2) {
		this.terms2 = terms2;
	}
	public String getTerms3() {
		return terms3;
	}
	public void setTerms3(String terms3) {
		this.terms3 = terms3;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public Date getUpdt_date() {
		return updt_date;
	}
	public void setUpdt_date(Date updt_date) {
		this.updt_date = updt_date;
	}
	@Override
	public String toString() {
		return "UserMemberVO [userid=" + userid + ", password=" + password + ", name=" + name + ", zipcode=" + zipcode
				+ ", address1=" + address1 + ", address2=" + address2 + ", tel1=" + tel1 + ", tel2=" + tel2 + ", tel3="
				+ tel3 + ", email=" + email + ", gender=" + gender + ", hobby=" + hobby + ", terms1=" + terms1
				+ ", terms2=" + terms2 + ", terms3=" + terms3 + ", year=" + year + ", month=" + month + ", day=" + day
				+ ", reg_date=" + reg_date + ", updt_date=" + updt_date + "]";
	}	
}
