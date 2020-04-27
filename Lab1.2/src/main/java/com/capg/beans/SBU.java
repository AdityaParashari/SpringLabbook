package com.capg.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU {
	
	@Value("PES-BU")
	private String sbuId;
	@Value("Process Engineering Services")
	private String sbuName;
	@Value("Kiran Rao")
	private String sbuHead;
	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SBU(String sbuId, String sbuName, String sbuHead) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
	public String getSbuId() {
		return sbuId;
	}
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}

}
