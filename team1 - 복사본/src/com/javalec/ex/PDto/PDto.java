package com.javalec.ex.PDto;

import java.sql.Timestamp;

public class PDto {

	
	int pId;
	String pName;
	String pTitle;
	String pContent;
	Timestamp pDate;
	int pHit;
	int pGroup;
	int pStep;
	int pIndent;
	
	public PDto() {
		
	}
	
	public PDto(int pId,String pName,String pTitle,String pContent,Timestamp pDate,int pHit,int pGroup,int pStep,int pIndent) {
		this.pId = pId;
		this.pName = pName;
		this.pTitle = pTitle;
		this.pContent = pContent;
		this.pDate = pDate;
		this.pHit = pHit;
		this.pGroup = pGroup;
		this.pStep = pStep;
		this.pIndent = pIndent;
		
		
	}
	
	
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
	public int getpHit() {
		return pHit;
	}
	public void setpHit(int pHit) {
		this.pHit = pHit;
	}
	public int getpGroup() {
		return pGroup;
	}
	public void setpGroup(int pGroup) {
		this.pGroup = pGroup;
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
	
	
	String mId;
	String mPw;
	String mName;
	String mEmail1;
	String mEmail2;
	String mEmail3;
	String address1;
	String address2;
	String address3;
	String address4;
	String phone1;
	String phone2;
	String phone3;
	String birth1;
	String birth2;
	String birth3;
	String birth4;
	String gender;
	String news;
	String sms;
	String mNum1;
	String mNum2;
	String mJob;
	String marry;
	String mHobby;
	
	
	public PDto(String mId,String mPw,String mName,String mEmail1,String mEmail2,String mEmail3,String address1,String address2,String address3,
			String address4,String phone1,String phone2,String phone3,String birth1,String birth2,String birth3,String birth4,
			String gender,String news,String sms,String mNum1,String mNum2,String mJob,String marry,String mHobby){
		
		this.mId = mId;
		this.mPw = mPw;
		this.mName = mName;
		this.mEmail1 = mEmail1;
		this.mEmail2 = mEmail2;
		this.mEmail3 = mEmail3;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.address4 = address4;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.birth1 = birth1;
		this.birth2 = birth2;
		this.birth3 = birth3;
		this.birth4 = birth4;
		this.gender = gender;
		this.news = news;
		this.sms = sms;
		this.mNum1 = mNum1;
		this.mNum2 = mNum2;
		this.mJob = mJob;
		this.marry = marry;
		this.mHobby = mHobby;

	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmPw() {
		return mPw;
	}

	public void setmPw(String mPw) {
		this.mPw = mPw;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmEmail3() {
		return mEmail3;
	}

	public void setmEmail3(String mEmail3) {
		this.mEmail3 = mEmail3;
	}

	public String getmEmail1() {
		return mEmail1;
	}

	public void setmEmail1(String mEmail1) {
		this.mEmail1 = mEmail1;
	}

	public String getmEmail2() {
		return mEmail2;
	}

	public void setmEmail2(String mEmail2) {
		this.mEmail2 = mEmail2;
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

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}



	public String getBirth1() {
		return birth1;
	}

	public void setBirth1(String birth1) {
		this.birth1 = birth1;
	}

	public String getBirth2() {
		return birth2;
	}

	public void setBirth2(String birth2) {
		this.birth2 = birth2;
	}

	public String getBirth3() {
		return birth3;
	}

	public void setBirth3(String birth3) {
		this.birth3 = birth3;
	}

	public String getBirth4() {
		return birth4;
	}

	public void setBirth4(String birth4) {
		this.birth4 = birth4;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public String getSms() {
		return sms;
	}

	public void setSms(String sms) {
		this.sms = sms;
	}



	public String getmNum1() {
		return mNum1;
	}

	public void setmNum1(String mNum1) {
		this.mNum1 = mNum1;
	}

	public String getmNum2() {
		return mNum2;
	}

	public void setmNum2(String mNum2) {
		this.mNum2 = mNum2;
	}

	public String getmJob() {
		return mJob;
	}

	public void setmJob(String mJob) {
		this.mJob = mJob;
	}

	public String getMarry() {
		return marry;
	}

	public void setMarry(String marry) {
		this.marry = marry;
	}

	public String getmHobby() {
		return mHobby;
	}

	public void setmHobby(String mHobby) {
		this.mHobby = mHobby;
	}
	
	
	
	
}
