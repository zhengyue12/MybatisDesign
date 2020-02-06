    package com.java.domain;

    import java.io.Serializable;
    import java.util.Date;

    public class User implements Serializable {
        private Integer id;
        private String username;
        private Date birthday;
        private String sex;
        private String address;

        public Integer getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public Date getBirthday() {
            return birthday;
        }

        public String getSex() {
            return sex;
        }

        public String getAddress() {
            return address;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public void setUsername(String userName) {
            this.username = userName;
        }

        public void setBirthday(Date birthday) {
            this.birthday = birthday;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", userName='" + username + '\'' +
                    ", birthday=" + birthday +
                    ", sex='" + sex + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
