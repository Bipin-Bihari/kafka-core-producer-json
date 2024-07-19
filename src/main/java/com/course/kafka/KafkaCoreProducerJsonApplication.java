package com.course.kafka;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.course.kafka.entity.Employee;
import com.course.kafka.producer.EmployeeJsonProducer;

@SpringBootApplication
@EnableScheduling
public class KafkaCoreProducerJsonApplication implements CommandLineRunner{
	@Autowired
	private EmployeeJsonProducer employeeJsonProducer;

	public static void main(String[] args) {
		SpringApplication.run(KafkaCoreProducerJsonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for(int i=0;i<5;i++) {
			var emp=new Employee("emp " + i,"Employee " + i);
			employeeJsonProducer.sendMessage(emp);
		}
	}

}
