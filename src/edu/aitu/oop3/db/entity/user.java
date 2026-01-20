package edu.aitu.oop3.db.entity;

public class user {
        private int id;
        private String name;
        private String email;
        private String role;

        public user(int id, String name, String email, String role) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.role = role;
        }

        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public String getEmail() {

            return email;
        }
        public String getRole() {

             return role;
        }


}
