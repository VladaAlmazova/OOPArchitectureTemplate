package ru.urfu;

/**
 * методы для работы с сообщениями пользователя
 */
public interface WorkingWithMessages {
//    /**
//     * возвращает пользовательской сообщение с пометкой от бота
//     * @param messageFromUser - сообщение пользователя
//     * @return
//     */
//    public String annotateUserText(String messageFromUser);

    /**
     * Отправка сообщения пользователю
     * @param chatId - id чата с пользователем
     * @param message - текст сообщения для отправки
     */
    public void sendMessage(String chatId, String message);
}
