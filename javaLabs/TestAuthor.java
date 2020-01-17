public class TestAuthor {
    public TestAuthor() {
    }

    public static void main(String[] args) {
        Author a1 = new Author("Anastasia", "anas.sulima@yandex.ru", 'W');
        System.out.println(a1);
        a1.setEmail("Sulima123@yandex.ru");
        System.out.println(a1);
    }
}
