package school;

import java.awt.Checkbox;
import java.text.SimpleDateFormat;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


class user {
     private int id;
     private String enrollment_no,name,standard,section/*,time,status*/;
     public user(String enrollment_no,String name,String standard,String section/*,String time,String status*/){
         this.enrollment_no = enrollment_no;
         this.name = name;
         this.standard = standard;
         this.section = section;
         /*this.time = time;
         this.status = status;*/
     }
     public String getenroll_no(){
         return enrollment_no;
     }
     public String getstudent(){
         return name;
     }
     public String getstandard(){
         return standard;
     }
     public String getsection(){
         return section;
     }
     public String gettime(){
     java.util.Date date = new java.util.Date();
        SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
        String time = s.format(date);
     return time;
     }
     /* public JCheckBox status(){
     //JPanel checkPanel = new JPanel();
     JCheckBox check = new JCheckBox();
     //checkPanel.add(new JLabel("CheckBox"));
     //checkPanel.add(check);
     return check;
     }*/
     public Object status(){
         Object obj = new Boolean(true);
         //JCheckBox check = new JCheckBox();
         //Object obj = check;
         return obj;
     }
}
