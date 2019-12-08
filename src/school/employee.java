/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author Ashish Shahi
 */
public class employee {
     private int id;
     private String first_name,last_name,gender,dob,mobile,landline,address,email,h_qualification,p_marks,university,experince,prev_orgnisation;
     public employee(String first_name,String last_name,String gender,String dob,String mobile,String landline,String address,String email,String h_qualification,String p_marks,String university,String experince,String prev_orgnisation){
         this.first_name = first_name;
         this.last_name = last_name;
         this.gender = gender;
         this.dob = dob;
         this.mobile = mobile;
         this.landline = landline;
         this.address = address;
         this.email = email;
         this.h_qualification = h_qualification;
         this.p_marks = p_marks;
         this.university = university;
         this.experince = experince;
         this.prev_orgnisation = prev_orgnisation;
     }
     public String get_first_name(){
         return first_name;
     }
     public String get_last_name(){
         return last_name;
     }
     public String get_gender(){
         return gender;
     }
     public String get_dob(){
         return dob;
     }
     public String get_mobile(){
         return mobile;
     }
     public String get_landline(){
         return landline;
     }
     public String get_address(){
         return address;
     }
     public String get_email(){
         return email;
     }
     public String get_h_qualification(){
         return h_qualification;
     }
     public String get_p_marks(){
         return p_marks;
     }
     public String get_university(){
         return university;
     }
     public String get_experince(){
         return experince;
     }
     public String get_prev_orgnisation(){
         return prev_orgnisation;
     }
}
