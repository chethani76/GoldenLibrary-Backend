package com.goldenlibrary.mgtsystem.models;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Member {
    @Id
    String id;
    String fname;
    String lname;
    Date dob;
    String address;
    String email;
    Date memberSince;

    public Member() {

    }

    public Member(String fname, String lname, Date dob, String address, String email) {
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.address = address;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(Date memberSince) {
        this.memberSince = memberSince;
    }

}