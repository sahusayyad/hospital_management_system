/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard;

/**
 *
 * @author Dell
 */
public class db {
    
    private static String username,roll;

    public db() {
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        db.username = username;
    }

    public static String getRoll() {
        return roll;
    }

    public static void setRoll(String roll) {
        db.roll = roll;
    }
}
