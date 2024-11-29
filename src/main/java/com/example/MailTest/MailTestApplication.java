package com.example.MailTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MailTestApplication {
	
	@Autowired
	private EmailSenderService mailService;

	public static void main(String[] args) {
		SpringApplication.run(MailTestApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	private void sendMail()
	{
		mailService.sendEmail("husayn.buet@gmail.com", "Get Ready", "Good days are coming Inshaallah.");
	}

}
