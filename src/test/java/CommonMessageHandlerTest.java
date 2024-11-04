import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.urfu.CommonMessageHandler;

/**
 * Тестирование класса обработчика сообщений
 */
public class CommonMessageHandlerTest {

    public CommonMessageHandler commonMessageHandler;

    /**
     * Создает новый экземпляр класса обработчика сообщений перед каждым тестом
     */
    @BeforeEach
    void initial() {
        commonMessageHandler = new CommonMessageHandler();
    }

    /**
     * Тестирует метод testAnnotateUserText
     * Пользовательское сообщение - одно слово
     */
    @Test
    @Disabled("Сообщение из одного слова")
    void testAnnotateUserTextOneWord() {
        String annotateMessage = commonMessageHandler.annotateUserText("one");
        Assertions.assertEquals("\"Ваше сообщение: 'one'\".", annotateMessage);
    }

    /**
     * Тестирует метод testAnnotateUserText
     * Пользовательское сообщение - текст
     */
    @Test
    @Disabled("Текстовое сообщение со знаками препинания")
    void testAnnotateUserTextText() {
        String annotateMessage = commonMessageHandler.annotateUserText(
                "Сложное предложение, которое - использует : знаки ; препинания.\n" +
                        "!Второе предложение!?");
        Assertions.assertEquals(
                "\"Ваше сообщение: 'Сложное предложение, которое - использует : знаки ; препинания.\n" +
                        "!Второе предложение!?'\".", annotateMessage);
    }

    /**
     * Тестирует метод testAnnotateUserText
     * Пользовательское сообщение - null
     */
    @Test
    @Disabled("Null сообщение")
    void testAnnotateUserTextNull() {
        String annotateMessage = commonMessageHandler.annotateUserText(null);
        Assertions.assertEquals(
                "\"Ваше сообщение: 'null'\".", annotateMessage);
    }

    /**
     * Тестирует метод testAnnotateUserText
     * Пользовательское сообщение - пустое
     */
    @Test
    @Disabled("Пустое сообщение")
    void testAnnotateUserTextEmpty() {
        String annotateMessage = commonMessageHandler.annotateUserText("");
        Assertions.assertEquals(
                "\"Ваше сообщение: ''\".", annotateMessage);
    }
}
