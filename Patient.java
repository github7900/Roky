public class Patient {
    int age, birthyear;
        String name, gender, phn, address, bloodgrp;
        public Patient(int a, int b, String n, String g, String ph, String ad, String bld  ){
            age = a;
            birthyear = b;
            name = n;
            gender = g;
            phn = ph;
            address = ad;
            bloodgrp = bld;
        }
        public void displayinfo(){
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("BirthYear : "+birthyear);
            System.out.println("Gender : "+gender);
            System.out.println("BloodGroup : "+bloodgrp);
            System.out.println("Phone : "+phn);
            System.out.println("Address : "+address);
        }

        public static void main(String[] args) {
            Patient Alex = new Patient(22,2001,"Alex","Male", "0134-5678902", "DIU", "b +ve");
            Alex.displayinfo();
        }

    }
