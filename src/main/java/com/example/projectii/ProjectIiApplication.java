package com.example.projectii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.projectii.controller.*;
import com.example.projectii.model.*;
import com.example.projectii.view.*;

@SpringBootApplication
public class ProjectIiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectIiApplication.class, args);
        LoginView view = new LoginView();
        LoginController control = new LoginController(view);
        control.login();
    }
}
