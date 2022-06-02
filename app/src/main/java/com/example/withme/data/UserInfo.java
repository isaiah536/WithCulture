package com.example.withme.data;

import java.util.ArrayList;

public class UserInfo {
    ArrayList<String> infoemail = new ArrayList<>();
    ArrayList<String> infoall = new ArrayList<>();

    public UserInfo(){
        infoemail.add("1");
        infoall.add("1"+"="+"0");
        infoemail.add("dhdhshhs_388");
        infoemail.add("seoyoung99");
        infoall.add("dhdhshhs_388=dhdhshhs_388");
        infoall.add("seoyoung99@cnu.ac.kr=123456789");
    }

    public void addEmail(String s){
        infoemail.add(s);
    }
    public void addAll(String s){infoall.add(s);}
    public String getEmail(int x){return infoemail.get(x);}
    public String getAll(int x) {return infoall.get(x);}
    public boolean empty(){
        return infoemail.isEmpty();
    }

    public boolean findEmail(String s){
        if(infoemail.contains(s)){
            return true;
        }else{
            return false;
        }
    }

    public boolean login(String email, String password){
        infoall.add("1=0");
        for (int i=0; i<infoall.size();i++){
            String [] temp = infoall.get(i).split("=");
            for(int j=0; j<temp.length; j++){
                if(email.equals(temp[0])&&password.equals(temp[1])){
                    return true;
                }
            }
        }
        return false;
    }
}
