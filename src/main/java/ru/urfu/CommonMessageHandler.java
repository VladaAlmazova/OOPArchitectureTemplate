package ru.urfu;

/**
 * Работа с сообщениями
 */
public class CommonMessageHandler {
    /**
     * Возвращает текст сообщения с пометкой от бота
     *
     * @param messageFromUser текст сообщения пользователя
     * @return текст с пометкой
     */
    public String annotateUserText(String messageFromUser) {
        return String.format("\"Ваше сообщение: '%s'\".", messageFromUser);
    }
}
