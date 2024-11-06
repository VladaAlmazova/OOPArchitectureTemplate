import org.junit.jupiter.api.*;
import ru.urfu.CommonMessageHandler;

/**
 * Тестирование класса обработчика сообщений
 */
public class CommonMessageHandlerTest {

    private CommonMessageHandler commonMessageHandler;

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
    @DisplayName("Сообщение из одного слова")
    void testAnnotateUserTextOneWord() {
        String annotateMessage = commonMessageHandler.annotateUserText("one");
        Assertions.assertEquals("\"Ваше сообщение: 'one'\".", annotateMessage);
    }

    /**
     * Тестирует метод testAnnotateUserText
     * Пользовательское сообщение - текст
     */
    @Test
    @DisplayName("Текстовое сообщение со знаками препинания")
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
    @DisplayName("Null сообщение")
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
    @DisplayName("Пустое сообщение")
    void testAnnotateUserTextEmpty() {
        String annotateMessage = commonMessageHandler.annotateUserText("");
        Assertions.assertEquals(
                "\"Ваше сообщение: ''\".", annotateMessage);
    }
}
