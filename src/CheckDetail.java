/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AshLim
 */
import java.util.Scanner;

public class CheckDetail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Delivery man1 = new Delivery(1001, "Lim Zhi Hui", 'Y', "", "1.00-2.00");
        Delivery man2 = new Delivery(1002, "Aw Khaw Wai", 'N', "Deliver burger", "11.00-12.00");
        Delivery man3 = new Delivery(1003, "Yong Kai Xiong", 'N', "Deliver noodles", "2.30-3.30");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Key in the staff ID:");
        int staff = scanner.nextInt();
        
        if(staff == 1001){
            System.out.println(man1.toString());
        }else if(staff == 1002){
            System.out.println(man2.toString());
        }else if(staff == 1003){
            System.out.println(man3.toString());
        }

    }

    private static class Delivery {

        private int staffID;
        private String staff_name;
        private char available;
        private String delivery;
        private String break_time;

        public Delivery(int staffID, String staff_name, char available, String delivery, String break_time) {
            this.staffID = staffID;
            this.staff_name = staff_name;
            this.available = available;
            this.delivery = delivery;
            this.break_time = break_time;
        }

        public int getStaffID() {
            return staffID;
        }

        public String getStaff_name() {
            return staff_name;
        }

        public char getAvailable() {
            return available;
        }

        public String getDelivery() {
            return delivery;
        }

        public String getBreak_time() {
            return break_time;
        }

        public void setStaffID(int staffID) {
            this.staffID = staffID;
        }

        public void setStaff_name(String staff_name) {
            this.staff_name = staff_name;
        }

        public void setAvailable(char available) {
            this.available = available;
        }

        public void setDelivery(String delivery) {
            this.delivery = delivery;
        }

        public void setBreak_time(String break_time) {
            this.break_time = break_time;
        }

        @Override
        public String toString() {
            return "Delivery:\n" + "==========================" + "\nStaff ID =" + staffID + "\nStaff Name =" + staff_name + "\nAvailable =" + available + "\nDelivery =" + delivery + "\nBreak_time =" + break_time;
        }

    }
}
