package com.javaex.vo;

public class GuestVo {
	
	//필드
	public int no;
	public String name, pw, content, date;
	
	
	//생성자
	public GuestVo() {}
	
	/*
	public GuestVo(int no, String name, String pw, String content, String date) {
		this.no = no;
		this.name = name;
		this.pw = pw;
		this.content = content;
		this.date = date;
	}
	
	public GuestVo(int no, String name, String pw, String content) {
		this.no = no;
		this.name = name;
		this.pw = pw;
		this.content = content;
	
	}
	
	public GuestVo(String name, String pw, String content, String date) {
	
		this.name = name;
		this.pw = pw;
		this.content = content;
		this.date = date;
	}

	public GuestVo(String name, String pw, String content) {
		
		this.name = name;
		this.pw = pw;
		this.content = content;
		
	}
	
	public GuestVo(int no, String pw) {
		this.no = no;
		this.pw = pw;
	}
	*/
	
	//g/s
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	//메서드
	
	@Override
	public String toString() {
		return "GuestBookVo [no=" + no + ", name=" + name + ", password=" + pw + ", content=" + content
				+ ", date=" + date + "]";
	}

	
	
	
}
