package com.laggarticus.data;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "orderrec")
public class OrderRec {
	
	@Id
	@Column(name="ordr_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ordr_id;
	
	@Column(nullable = false, name = "first_name") 
	private String firstName;
	
	@Column(nullable = false, name = "last_name")
	private String lastName;
	
	@Column(nullable = false, name = "grade")
	private String grade;
	
	@Column(nullable = false, name = "address_1")
	private String address1;
	
	@Column(nullable = true, name = "address_2")
	private String address2;
	
	@Column(nullable = false, name = "city")
	private String city;
	
	@Column(nullable = false, name = "state")
	private String state;
	
	@Column(nullable = false, name = "zip")
	private String zip;

}
