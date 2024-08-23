package com.dinesh.reactivemono;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class SpringReactivemono23augApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactivemono23augApplication.class, args);
		
		/*
		 * Mono<String> myMonoString= Mono.just("this is my first mono variable");
		 * 
		 * myMonoString.subscribe( System.out::println);
		 */
		
		String[] cities = new String[] {"Delhi","Agra","Pune","Mumbai"};
		
		Flux<String> myFluxCities = Flux.fromArray(cities);
		
    	myFluxCities.subscribe(
				System.out::println);
		
		/*
		 * myFluxCities .filter(city -> city.length()>4) .map(String::toUpperCase) //
		 * .delayElements(Duration.ofSeconds(1)) .subscribe(System.out::println);
		 */
    	
    	Flux<Integer> flux= Flux.just(1,2,3,4,5,6,7,8,9)
    			.delayElements(Duration.ofSeconds(1));
    	
    	flux
    	   .subscribe(
    			   i-> System.out.println("red " + i));
	}

}
