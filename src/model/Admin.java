package model;

public class Admin {


	//Class to store data of admin 
	
		public String adminName;
		public String adminId;
		public String adminPassword;

		public Admin(String adminName, String adminId, String adminPassword) {
			super();
			this.adminName = adminName;
			this.adminId = adminId;
			this.adminPassword = adminPassword;
		}

		public String getAdminName() {
			return adminName;
		}

		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}

		public String getAdminId() {
			return adminId;
		}

		public void setAdminId(String adminId) {
			this.adminId = adminId;
		}

		public String getAdminPassword() {
			return adminPassword;
		}

		public void setAdminPassword(String adminPassword) {
			this.adminPassword = adminPassword;
		}

	}



