package ru.urfu;

/**
 * Общий класс для работы с сообщениями
 */
public class CommonMessageHandler {
    /**
     * Отправляет пользователю его сообщение с пометкой
     * @param bot - бот, который реализует отправку сообщений пользователю
     * @param chatId - идентификатор чата
     * @param messageFromUser - сообщение пользователя
     */
    public void annotateUserText(WorkingWithMessages bot, String chatId, String messageFromUser){
        String taggedUserText = String.format("Ваше сообщение: %s", messageFromUser);
        bot.sendMessage(chatId, taggedUserText);
    }
}
