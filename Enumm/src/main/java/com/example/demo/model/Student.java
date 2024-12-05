package com.example.demo.model;

import java.util.Date;

import com.example.demo.enumss.EnquiryStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int studentId;
private String studentName;
private String studentAddr;
private long studentMobno;
private String studentEmail;
private String studentPancardno;
private int studnetAge;
@Enumerated(EnumType.STRING)
private EnquiryStatus enquiryStatus;
private Date registeredon;
@OneToOne(cascade = CascadeType.MERGE.REMOVE.REFRESH.DETACH)
private CibilDetails cibilDetails;


}
