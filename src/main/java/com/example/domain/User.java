package com.example.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private static final long serialVersionUID = -4300476953903870706L;
	private Long id;

	private String nickName;

	private String ip;

	private Date createTime;

	public User() {
		super();
	}

	public User(Long id, String nickName, String ip, Date createTime) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.ip = ip;
		this.createTime = createTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
