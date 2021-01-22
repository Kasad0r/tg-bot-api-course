package learn.tgbotapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.starter.TelegramBotInitializer;

@SpringBootApplication
public class TgBotApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TgBotApiApplication.class, args);
	}

}
