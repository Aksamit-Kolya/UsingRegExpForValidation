package com.company;

import static org.junit.jupiter.api.Assertions.*;

class TasksTest {
    String[] correctURL = {
            "https://www.google.com",
            "http://www.google.com",
            "https://habr.com/ru/all/",
            "https://www.google.com/search?q=google&oq=google&aqs=chrome..69i57j0i271l3j69i60l2j69i65.3025j0j7&sourceid=chrome&ie=UTF-8"
    };
    String[] wrongURL = {
            "javascript:alert('Hack me!')",
            "www.google.com",
            "google.com",
            "habr.com"
    };
    String[] correctEmail = {
            "dima.shisha@gmail.com",
            "me@gmail.com",
            "me-1000@gmail.com",
            "me-123@yahoo-test.ru",
    };
    String[] wrongEmail = {
            "me@.com.my",
            "мой2002@gmail.com",
            "me@gmail.com.1a"
    };
    String[] correctIP = {
            "0.0.0.0",
            "000.000.000.000",
            "255.255.255.255",
            "249.199.99.1"
    };
    String[] wrongIP = {
            "0.0.0",
            "0.0.0.0.0",
            "256.256.256.256",
            "1000.1.2.3"
    };

    @org.junit.jupiter.api.Test
    void checkURL() {
        for (String URL : correctURL) {
            assertTrue(Tasks.checkURL(URL));
        }
        for (String URL : wrongURL) {
            assertFalse(Tasks.checkURL(URL));
        }
    }

    @org.junit.jupiter.api.Test
    void checkURLOtherImplementation() {
        for (String URL : correctURL) {
            assertTrue(Tasks.checkURL(URL));
        }
        for (String URL : wrongURL) {
            assertFalse(Tasks.checkURL(URL));
        }
    }

    @org.junit.jupiter.api.Test
    void isValidEmail() {
        for (String email : correctEmail) {
            assertTrue(Tasks.isValidEmail(email));
        }
        for (String email : wrongEmail) {
            assertFalse(Tasks.isValidEmail(email));
        }
    }

    @org.junit.jupiter.api.Test
    void isValidIP() {
        for (String IP : correctIP) {
            assertTrue(Tasks.isValidIP(IP));
        }
        for (String IP : wrongIP) {
            assertFalse(Tasks.isValidIP(IP));
        }
    }
}