package com.huayong.generator.po;

import com.huayong.generator.config.DbColumnType;

public class TableField {
	private boolean keyFlag;
	private boolean keyIdentityFlag;
	private String name;
	private String type;
	private String propertyName;
	private DbColumnType columnType;
	private String comment;

	public TableField() {
	}

	public boolean isKeyFlag() {
		return keyFlag;
	}

	public void setKeyFlag(boolean keyFlag) {
		this.keyFlag = keyFlag;
	}

	public boolean isKeyIdentityFlag() {
		return keyIdentityFlag;
	}

	public void setKeyIdentityFlag(boolean keyIdentityFlag) {
		this.keyIdentityFlag = keyIdentityFlag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public DbColumnType getColumnType() {
		return columnType;
	}

	public void setColumnType(DbColumnType columnType) {
		this.columnType = columnType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getPropertyType() {
		return null != this.columnType ? this.columnType.getType() : null;
	}

	public String getCapitalName() {
		return this.propertyName.substring(0, 1).toUpperCase() + this.propertyName.substring(1);
	}
}