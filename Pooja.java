package com.satyanarayanaswamytemple;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pooja {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String poojaName;
	private String poojaVidhanam;
	private String poojaDravyalu;
	private String vidhiVidhanalu;
	private String samayamu;
	private String padhatulu;
	private String kathalu;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPoojaName() {
		return poojaName;
	}
	public void setPoojaName(String poojaName) {
		this.poojaName = poojaName;
	}
	public String getPoojaVidhanam() {
		return poojaVidhanam;
	}
	public void setPoojaVidhanam(String poojaVidhanam) {
		this.poojaVidhanam = poojaVidhanam;
	}
	public String getPoojaDravyalu() {
		return poojaDravyalu;
	}
	public void setPoojaDravyalu(String poojaDravyalu) {
		this.poojaDravyalu = poojaDravyalu;
	}
	public String getVidhiVidhanalu() {
		return vidhiVidhanalu;
	}
	public void setVidhiVidhanalu(String vidhiVidhanalu) {
		this.vidhiVidhanalu = vidhiVidhanalu;
	}
	public String getSamayamu() {
		return samayamu;
	}
	public void setSamayamu(String samayamu) {
		this.samayamu = samayamu;
	}
	public String getPadhatulu() {
		return padhatulu;
	}
	public void setPadhatulu(String padhatulu) {
		this.padhatulu = padhatulu;
	}
	public String getKathalu() {
		return kathalu;
	}
	public void setKathalu(String kathalu) {
		this.kathalu = kathalu;
	}
	

}
