package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;


/**
 * @description: user reg/login
 * @author: Swati Bhat
 * @create: 2019-11-16 15:15
 */

public class UserController extends Controller {

    public Result forgotPassword() {
        System.out.println("In forgotPassword");
        JsonNode req = request().body().asJson();
        String username = req.get("username").asText();
        String security = req.get("security").asText();
        try {
            User user = User.findByName(username); // ( match where username and password both match )
            ObjectNode result = Json.newObject();
            if(user!=null && username.equals(user.username) && security.equals(user.security)){
                return ok("true");
            }else{
                return ok(Json.toJson("false"));
            }
        }
        catch (Exception e) {
            return ok(Json.toJson("false"));
        }
    }

    public Result authenticate() {

        System.out.println("In authenticate");
        JsonNode req = request().body().asJson();
        String username = req.get("username").asText();
        String password = req.get("password").asText();



        try {
            User user = User.findByName(username);
            // ( match where username and password both match )
            if(user!=null && username.equals(user.username) && password.equals(user.password)){
                ObjectNode result = Json.newObject();
                result.put("username", user.username);
                result.put("password", user.password);
                result.put("security", user.security);
                result.put("title", user.Title);
                result.put("researchArea", user.researchArea);
                result.put("firstName", user.firstName);
                result.put("lastName", user.lastName);
                result.put("position", user.position);
                result.put("affiliation", user.affiliation);
                result.put("email", user.email);
                result.put("phone", user.phone);
                result.put("fax", user.fax);
                result.put("address", user.address);
                result.put("city", user.city);
                result.put("country", user.country);
                result.put("zip", user.zip);
                result.put("comment", user.comments);
                result.put("status", user.status);
                result.put("degree", user.degree);
                result.put("semester", user.semester);
                result.put("year", user.year);
                result.put("month", user.month);
                result.put("year2", user.year2);
                return ok(result);
            }else{
                return ok(Json.toJson("false"));
            }
        }
        catch (Exception e) {
            return ok(Json.toJson("false"));
        }

    }


    /**
     * When a user register, check if the username is taken
     * save to database if valid
     * POST
     * @return success if valid, fail if already taken
     */
    public Result registerNew() {
        System.out.println("In register");
        JsonNode req = request().body().asJson();
        String username = req.get("username").asText();
        String password = req.get("password").asText();
        String security = req.get("security").asText();
        String title = req.get("title").asText();
        String researchArea = req.get("researchArea").asText();
        String firstName = req.get("firstName").asText();
        String lastName = req.get("lastName").asText();
        String position = req.get("position").asText();
        String affiliation = req.get("affiliation").asText();
        String email = req.get("email").asText();
        String phone = req.get("phone").asText();
        String fax = req.get("fax").asText();
        String address = req.get("address").asText();
        String city = req.get("city").asText();
        String zip = req.get("zip").asText();
        String country = req.get("country").asText();
        String comment = req.get("comment").asText();
        String status = req.get("status").asText();
        String degree = req.get("degree").asText();
        String semester = req.get("semester").asText();
        String year = req.get("year").asText();
        String month = req.get("month").asText();
        String year2 = req.get("year2").asText();

        User u = User.findByName(username);
        ObjectNode result = null;
        if (u == null) {
            System.out.println("new user");
            result = Json.newObject();
            User user = new User();
            user.username=username;
            user.password=password;
            user.security=security;
            user.Title=title;
            user.researchArea=researchArea;
            user.firstName=firstName;
            user.lastName=lastName;
            user.position=position;
            user.affiliation=affiliation;
            user.email=email;
            user.phone=phone;
            user.fax=fax;
            user.address=address;
            user.city=city;
            user.zip=zip;
            user.country=country;
            user.comments=comment;
            user.status=status;
            user.degree=degree;
            user.semester=semester;
            user.year=year;
            user.month=month;
            user.year2=year2;


            user.save();
            result.put("body", username);
        }
        return ok(result);
    }

}