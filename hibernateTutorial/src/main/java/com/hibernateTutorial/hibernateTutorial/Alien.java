package com.hibernateTutorial.hibernateTutorial;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity(name = "Alien_table")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Alien {

	@Id
	private Integer aid;
	@Column(name = "Name")
	private AlienName Aname;
	private String Acolor;
	@Transient
	private String iamAnnoying;
	@OneToMany(mappedBy = "mylapys",fetch = FetchType.EAGER)
	List<Laptop> mylapys;
	
	public Integer getAid() {
		return aid; 
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public AlienName getAname() {
		return Aname;
	}
	public void setAname(AlienName aname) {
		Aname = aname;
	}
	public String getAcolor() {
		return Acolor;
	}
	public void setAcolor(String acolor) {
		Acolor = acolor;
	}
}
