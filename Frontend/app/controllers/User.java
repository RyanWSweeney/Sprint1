package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;


public class User {

    private String username;
    private String password;
    private String title;
    private String researchArea;
    private String firstName;
    private String lastName;
    private String position;
    private String affiliation;
    private String email;
    private String phone;
    private String fax;
    private String address;
    private String city;
    private String zip;
    private String country;
    private String comment;
    private String status;

    private String degree;

    private String semester;

    private String year;

    private String month;

    private String year2;

    private String security;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear2() {
        return year2;
    }

    public void setYear2(String year2) {
        this.year2 = year2;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public CompletionStage<WSResponse> checkAuthorized() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        //add username password
        WSRequest request = ws.url("http://localhost:9005/login");
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password",this.password);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }



    public  CompletionStage<WSResponse> registerUser() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        // send this. user
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password",this.password);
        res.put("title",this.title);
        res.put("researchArea",this.researchArea);
        res.put("firstName",this.firstName);
        res.put("lastName",this.lastName);
        res.put("position",this.position);
        res.put("affiliation",this.affiliation);
        res.put("email",this.email);
        res.put("phone",this.phone);
        res.put("fax",this.fax);
        res.put("address",this.address);
        res.put("city",this.city);
        res.put("zip",this.zip);
        res.put("country",this.country);
        res.put("comment",this.comment);
        res.put("status",this.status);
        res.put("degree",this.degree);
        res.put("semester",this.semester);
        res.put("year",this.year);
        res.put("month",this.month);
        res.put("year2",this.year2);
        res.put("security",this.security);


        System.out.println(username);
        System.out.println(password);
        System.out.println(security);
        System.out.println(title);
        System.out.println(researchArea);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(position);
        System.out.println(affiliation);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(fax);
        System.out.println(address);
        System.out.println(city);
        System.out.println(zip);
        System.out.println(country);
        System.out.println(comment);
        System.out.println(status);
        System.out.println(degree);
        System.out.println(semester);
        System.out.println(year);
        System.out.println(month);
        System.out.println(year2);

        WSRequest request = ws.url("http://localhost:9005/signup");
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

}
