package xPracticeQuestions;

/*
 * Design and implement a java program that simulates a network monitoring system.
 * Your system should be capable of monitoring different types of network devices, such as
 * routers and switches, and alerting if any devices are experiencing errors or downtime.
 * Use interfaces to define common behaviours for network devices and implement these behaviours in different device classes.
 * 
 * Create an interface named NetworkDevice with atleast two methods:
 * 
 * - getStatus() which returns a String indicating the current status of device
 * - isAvailable() which returns a boolean indicating if the device is currently available and functioning correctly.
 * 
 * Implement the NetworkDevice interface in at least three seperate classes, Router and Switch. Each class should have a 
 * constructor that sets specific properties for the device and specific logic to determine its status and availability
 */

public class Qs5 {
    public static void main(String[] args) {

        Router r1 = new Router("test");
        System.out.println(r1.getStatus());
        System.out.println(r1.isAvailable());

    }
}

interface NetworkDevice {

    public String getStatus(); // * shall return a String indicating the current status of device

    public boolean isAvailable(); // * shall return boolean indicating if the device is currently available and
                                  // * functioning correctly.

}

class Router implements NetworkDevice {
    private String status;
    private boolean isAvailable;

    Router(String status) {
        try {
            if (!status.toLowerCase().equals("active") && !status.toLowerCase().equals("inactive")) {
                throw new IllegalArgumentException("Invalid status passed");
            } else {
                this.status = status.toLowerCase();
                if (status.equals("active")) {
                    isAvailable = true;
                } else {
                    isAvailable = false;
                }
            }
        } catch (IllegalArgumentException e) {
            this.status = "Not available";
            System.out.println("Error occured due to: " + e.getMessage());
        }

    }

    public String getStatus() {
        return status;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

class Switch implements NetworkDevice {
    private String status;
    private boolean isAvailable;

    Switch(String status) {
        try {
            if (!status.toLowerCase().equals("active") && !status.toLowerCase().equals("inactive")) {
                throw new IllegalArgumentException("Invalid status passed");
            } else {
                this.status = status.toLowerCase();
                if (status.equals("active")) {
                    isAvailable = true;
                } else {
                    isAvailable = false;
                }
            }
        } catch (IllegalArgumentException e) {
            this.status = "Not available";
            System.out.println("Error occured due to: " + e.getMessage());
        }

    }

    public String getStatus() {
        return status;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
