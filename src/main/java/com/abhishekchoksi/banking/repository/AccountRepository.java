/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.abhishekchoksi.banking.repository;

import com.abhishekchoksi.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author apcho
 */
public interface AccountRepository extends JpaRepository<Account, Long>{
    
}
