package com.hcl.customer;

import java.sql.Date;

public class Customervo {
private String cname;
private String caddress;
private String cstate;
private long cpn;
private String cemail;
private String cpw;
private Date cdov;
private String cinc;
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCaddress() {
	return caddress;
}
public void setCaddress(String caddress) {
	this.caddress = caddress;
}
public String getCstate() {
	return cstate;
}
public void setCstate(String cstate) {
	this.cstate = cstate;
}
public long getCpn() {
	return cpn;
}
public void setCpn(long cpn) {
	this.cpn = cpn;
}
public String getCemail() {
	return cemail;
}
public void setCemail(String cemail) {
	this.cemail = cemail;
}
public String getCpw() {
	return cpw;
}
public void setCpw(String cpw) {
	this.cpw = cpw;
}
public Date getCdov() {
	return cdov;
}
public void setCdov(Date cdov) {
	this.cdov = cdov;
}
public String getCinc() {
	return cinc;
}
public void setCinc(String cinc) {
	this.cinc = cinc;
}
@Override
public String toString() {
	return "Customervo [cname=" + cname + ", caddress=" + caddress + ", cstate=" + cstate + ", cpn=" + cpn + ", cemail="
			+ cemail + ", cpw=" + cpw + ", cdov=" + cdov + ", cinc=" + cinc + "]";
}


}

