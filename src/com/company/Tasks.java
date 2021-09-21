package com.company;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Tasks {

    static boolean checkURL(String URL) {
        String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(URL);
        return matcher.matches();
    }

    static boolean checkURLOtherImplementation(String stringURL) {
        try {
            URL url = new URL(stringURL);
            return true;
        } catch (MalformedURLException e) {
            return false;
        }
    }

    static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    static boolean isValidIP(String email) {
        String regex = "(([0-1]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-1]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
