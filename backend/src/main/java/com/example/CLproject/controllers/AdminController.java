package com.example.CLproject.controllers;
import com.example.CLproject.models.Product;

import com.example.CLproject.models.dtos.productDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.CLproject.services.AdminService;

import java.util.Map;


@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;




}