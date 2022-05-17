package com.dxc.training.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user2")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userid")
	private Integer userid;
	
	@Column(name="userfirstname")
	private String userfirstname;
	
	@Column(name="userlastname")
	private String userlastname;
	
	@Column(name="useremailid")
	private String useremailid;
	
	@Column(name="usercontact")
	private String usercontact;

	
	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUserfirstname() {
		return userfirstname;
	}

	public void setUserfirstname(String userfirstname) {
		this.userfirstname = userfirstname;
	}

	public String getUserlastname() {
		return userlastname;
	}

	public void setUserlastname(String userlastname) {
		this.userlastname = userlastname;
	}

	public String getUseremailid() {
		return useremailid;
	}

	public void setUseremailid(String useremailid) {
		this.useremailid = useremailid;
	}

	public String getUsercontact() {
		return usercontact;
	}

	public void setUsercontact(String usercontact) {
		this.usercontact = usercontact;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public User(Integer userid, String userfirstname, String userlastname, String useremailid, String usercontact) {
		super();
		this.userid = userid;
		this.userfirstname = userfirstname;
		this.userlastname = userlastname;
		this.useremailid = useremailid;
		this.usercontact = usercontact;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", userfirstname=" + userfirstname + ", userlastname=" + userlastname
				+ ", useremailid=" + useremailid + ", usercontact=" + usercontact + "]";
	}
	
	

}
