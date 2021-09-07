package com.prime.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeController {

	@RequestMapping("/getPrime/{num}")
	public String hello(@PathVariable("num") int num) {
		System.out.println("id=" + num);
		return getPrimeList(num);
	}

	private String getPrimeList(int num) {
		String primeNumbers = "";
		for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
            	primeNumbers = primeNumbers + i + " ";
            }
        }
		return primeNumbers;
	}
	private boolean isPrime(int num) {
	    boolean flag = true;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = false;
	        break;
	      }
	    }
	    return flag;
	}
}
