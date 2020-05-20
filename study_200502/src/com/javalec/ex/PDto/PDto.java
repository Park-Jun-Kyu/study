package com.javalec.ex.PDto;

import java.sql.Timestamp;

public class PDto {

	public PDto() {
		
	}
	
	public PDto(int pId,String pName,String pTitle,String pContent,Timestamp pDate,int pGroup,int pHit,int pStep,int pIndent) {
		this.pId = pId;
		this.pName = pName;
		this.pTitle = pTitle;
		this.pContent = pContent;
		this.pDate = pDate;
		this.pGroup = pGroup;
		this.pHit = pHit;
		this.pStep = pStep;
		this.pIndent = pIndent;
	}
	
	int pId;
	String pName;
	String pTitle;
	String pContent;
	Timestamp pDate;
	int pGroup;
	int pHit;
	int pStep;
	int pIndent;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpTitle() {
		return pTitle;
	}
	public void setpTitle(String pTitle) {
		this.pTitle = pTitle;
	}
	public String getpContent() {
		return pContent;
	}
	public void setpContent(String pContent) {
		this.pContent = pContent;
	}
	public Timestamp getpDate() {
		return pDate;
	}
	public void setpDate(Timestamp pDate) {
		this.pDate = pDate;
	}
	public int getpGroup() {
		return pGroup;
	}
	public void setpGroup(int pGroup) {
		this.pGroup = pGroup;
	}
	public int getpHit() {
		return pHit;
	}
	public void setpHit(int pHit) {
		this.pHit = pHit;
	}
	public int getpStep() {
		return pStep;
	}
	public void setpStep(int pStep) {
		this.pStep = pStep;
	}
	public int getpIndent() {
		return pIndent;
	}
	public void setpIndent(int pIndent) {
		this.pIndent = pIndent;
	}
	
	
	
	
	
	
	
}
