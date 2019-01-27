package com.rest.webservices.restfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.webservices.restfulwebservices.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
