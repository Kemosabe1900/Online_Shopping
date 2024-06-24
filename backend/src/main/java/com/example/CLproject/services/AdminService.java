package com.example.CLproject.services;

import com.example.CLproject.daos.AdminRepository;
import com.example.CLproject.models.dtos.productDTO;
import jakarta.transaction.Transactional;
import com.example.CLproject.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Service
@Transactional
public class AdminService {

    @Autowired
    private AdminRepository adminDAO;






}
