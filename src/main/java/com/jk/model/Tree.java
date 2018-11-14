package com.jk.model;

import java.io.Serializable;
import java.util.List;

public class Tree implements Serializable{

	private static final long serialVersionUID = 5659081018392445315L;

	private String id;
	
	private String text;
	
	private String url;
	
	private String pid;
	
	private  Boolean  Checked;
	
	private List<Tree> children;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Boolean getChecked() {
		return Checked;
	}

	public void setChecked(Boolean checked) {
		Checked = checked;
	}

	public List<Tree> getChildren() {
		return children;
	}

	public void setChildren(List<Tree> children) {
		this.children = children;
	}


	
	
}
