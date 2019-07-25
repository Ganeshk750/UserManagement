package com.ganesh.Beans;

public class User {
	
	  protected int id;
	    protected String name;
	    protected String email;
	    protected String salary;
	    protected String profile;
	    protected String country;

	    public User() {}

	    public User(String name, String email, String salary, String profile, String country) {
	        super();
	        this.name = name;
	        this.email = email;
	        this.salary = salary;
	        this.profile = profile;
	        this.country = country;
	    }

	    public User(int id, String name, String email, String salary, String profile, String country) {
	        super();
	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.salary = salary;
	        this.profile = profile;
	        this.country = country;
	    }


		public String getSalary() {
			return salary;
		}

		public void setSalary(String salary) {
			this.salary = salary;
		}

		public String getProfile() {
			return profile;
		}

		public void setProfile(String profile) {
			this.profile = profile;
		}

		public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public String getCountry() {
	        return country;
	    }
	    public void setCountry(String country) {
	        this.country = country;
	    }

}
