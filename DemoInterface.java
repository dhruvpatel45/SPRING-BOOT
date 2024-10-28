package com.example.demo.Interface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.DemoModel;

@Repository
public interface DemoInterface extends CrudRepository<DemoModel , Integer> {

}
