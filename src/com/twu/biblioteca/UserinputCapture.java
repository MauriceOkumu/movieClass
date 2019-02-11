package com.twu.biblioteca;

public class UserinputCapture {
    public String libNumber;
    public String name;
    public String email;
    public String password;
    public String phoneNumber;
    ScannerClass captureInfo;
    public UserinputCapture() {

    }
        public void UserinputCaptureRun () {
            captureInfo = new ScannerClass();
            System.out.print("What is you Library number? :");
            libNumber = captureInfo.scan();
            System.out.print("What is your name ? :");
            name = captureInfo.scan();
            System.out.print("Put your email address => :");
            email = captureInfo.scan();
            System.out.print("What is your password ? :");
            password = captureInfo.scan();
            System.out.print("Phone number :");
            phoneNumber = captureInfo.scan();
        }


}
