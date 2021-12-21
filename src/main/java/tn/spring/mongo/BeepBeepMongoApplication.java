package tn.spring.mongo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tn.spring.mongo.dao.ColiRepository;
import tn.spring.mongo.entites.Coli;

@SpringBootApplication
public class BeepBeepMongoApplication implements CommandLineRunner{
	
	
	@Autowired
	private ColiRepository coliRepository;
	public static void main(String[] args) {
		SpringApplication.run(BeepBeepMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Coli c=new Coli("1", "FX2", "ahmed", "salah", 20124554, "nabeulr", "dar chaabane", 70, 1, "En cours", new Date(), null, "mejdi");
		coliRepository.save(c);
		
		
	}

}
