package com.haike.web.entity;

import java.util.Date;
import java.util.List;

/**
 * @author xiaoming
 *
 * @tags 导航栏菜单
 */
public class Menu extends IdEntity {
	private String title; // 菜单名称
	private String describe; // 菜单描述
	private int level; // 菜单级别
	private String pid; // 父级菜单id
	private Date createTime;
	private Date updateTime;
	private boolean removed;
	private List<Menu> menus; // 下一级别菜单

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public boolean isRemoved() {
		return removed;
	}

	public void setRemoved(boolean removed) {
		this.removed = removed;
	}

}
