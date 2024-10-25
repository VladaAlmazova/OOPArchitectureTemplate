package ru.urfu;

/**
 * Класс для запуска приложения
 */
public class Application {

    public static void main(String[] args) {
        //TODO добавить в переменную окружения
        String telegramBotName = System.getenv("JavaChatBot3_bot");
        String telegramToken = System.getenv("7915671046:AAF8_ZqOvFPsQcGxk77DisXxIZM0duuZ_2Q");
        new TelegramBot(telegramBotName, telegramToken)
                .start();

        String discordToken = System.getenv("discord_token");
        new DiscordBot(discordToken)
                .start();

        // сколько угодно чат платформ и все должны работать одинаково
    }

}
