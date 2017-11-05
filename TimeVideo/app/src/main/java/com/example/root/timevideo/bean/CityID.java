package com.example.root.timevideo.bean;

import java.util.List;



public class CityID
{

    private List<PBean> p;

    public List<PBean> getP() {
        return p;
    }

    public void setP(List<PBean> p) {
        this.p = p;
    }

    public static class PBean {
        /**
         * id : 290
         * n : 北京
         * count : 120
         * pinyinShort : bj
         * pinyinFull : Beijing
         */

        private int id;
        private String n;
        private int count;
        private String pinyinShort;
        private String pinyinFull;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getN() {
            return n;
        }

        public void setN(String n) {
            this.n = n;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getPinyinShort() {
            return pinyinShort;
        }

        public void setPinyinShort(String pinyinShort) {
            this.pinyinShort = pinyinShort;
        }

        public String getPinyinFull() {
            return pinyinFull;
        }

        public void setPinyinFull(String pinyinFull) {
            this.pinyinFull = pinyinFull;
        }
    }
}
