package com.ss.UtopiaAirlines.enitity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ronh
 *
 */

@Entity
@Table( name = "tbl_airport")
public class Airport {
	
	@Id
	private int airportId;
	private String city;
	private String name;
	public int getAirportId() {
		return airportId;
	}
	public void setAirportId(int airportId) {
		this.airportId = airportId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}