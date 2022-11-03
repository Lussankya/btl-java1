package org.example.model;

public class Lop {
    public class lop{
        public String malop; //khai bao ma lop
        public String ten;  //khai bao ten hoc sinh
        public String MSV;  //khai bao ma sinh vien

        public lop(){}

        public lop(String malop, String ten, String MSV) {
            this.malop = malop;
            this.ten = ten;
            this.MSV = MSV;
        }

        public String getMalop() {
            return malop;
        }

        public String getMSV() {
            return MSV;
        }

        public String getTen() {
            return ten;
        }

        public void setMalop(String malop) {
            this.malop = malop;
        }

        public void setMSV(String MSV) {
            this.MSV = MSV;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String toString() {
            return this.ten;
        }
    }


}
