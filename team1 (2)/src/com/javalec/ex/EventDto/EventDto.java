package com.javalec.ex.EventDto;
import java.sql.Timestamp;

public class EventDto {

	



		
		int eId;
		String eName;
		String eTitle; 
		String eContent;
		Timestamp eDate;
		int eHit;
		String eFile;
		
		
		public EventDto() {
			
			
		}
		
		public EventDto(int eId,String eName,String eTitle, String eContent , Timestamp eDate,int eHit,String eFile) {
			this.eId = eId;
			this.eName = eName;
			this.eTitle = eTitle;
			this.eContent = eContent;
			this.eDate = eDate;
			this.eHit = eHit;
			this.eFile = eFile;
			
		}

		public int geteId() {
			return eId;
		}

		public void seteId(int eId) {
			this.eId = eId;
		}

		public String geteName() {
			return eName;
		}

		public void seteName(String eName) {
			this.eName = eName;
		}

		public String geteTitle() {
			return eTitle;
		}

		public void seteTitle(String eTitle) {
			this.eTitle = eTitle;
		}

		public String geteContent() {
			return eContent;
		}

		public void seteContent(String eContent) {
			this.eContent = eContent;
		}

		public Timestamp geteDate() {
			return eDate;
		}

		public void seteDate(Timestamp eDate) {
			this.eDate = eDate;
		}

		public int geteHit() {
			return eHit;
		}

		public void seteHit(int eHit) {
			this.eHit = eHit;
		}

		public String geteFile() {
			return eFile;
		}

		public void seteFile(String eFile) {
			this.eFile = eFile;
		}
		
		
		
		
		
		
		
		
	}
