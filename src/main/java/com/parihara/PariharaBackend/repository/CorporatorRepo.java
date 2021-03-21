package com.parihara.PariharaBackend.repository;

/**
 * @author koustubha
 * 
 * This Interface , interacts with the Database and allows user to perform database related operations on 
 * CorporatorDetails class
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parihara.PariharaBackend.entity.CorporatorDetails;

@Repository
public interface CorporatorRepo extends JpaRepository<CorporatorDetails, Integer> {

}
