package com.library.model;

public class PhieuMuon {
    public class phieumuon{
        public String maphieumuon;
        public String masach;

    public phieumuon(){}

        public phieumuon(String maphieumuon, String masach) {
            this.maphieumuon = maphieumuon;
            this.masach = masach;
        }

        public String getMaphieumuon() {
            return maphieumuon;
        }

        public String getMasach() {
            return masach;
        }

        public void setMaphieumuon(String maphieumuon) {
            this.maphieumuon = maphieumuon;
        }

        public void setMasach(String masach) {
            this.masach = masach;
        }

    }
}
