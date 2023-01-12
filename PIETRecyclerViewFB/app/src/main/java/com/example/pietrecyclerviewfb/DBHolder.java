package com.example.pietrecyclerviewfb;

public class DBHolder {

    String pname,pdisease,pimage;

    DBHolder(){

    }

    public DBHolder(String pname, String pdisease, String pimage) {
        this.pname = pname;
        this.pdisease = pdisease;
        this.pimage = pimage;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPdisease() {
        return pdisease;
    }

    public void setPdisease(String pdisease) {
        this.pdisease = pdisease;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }
}
