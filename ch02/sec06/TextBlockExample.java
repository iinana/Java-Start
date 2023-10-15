package ch02.sec06;

public class TextBlockExample {
    public static void main (String[] args) {
        String str1 = "" +
        "{\n" +
        "\t\"id\":\"winter\",\n" +
        "\t\"name\":\"snow\"\n" +
        "}";
        System.out.println(str1);

        String str2 = """
            {
                "id":"winter"
                "name":"snow"
            }
                """;
        System.out.println(str2);

        String str3 = """
                I'm learning \
                Java.
                I want to do it well
                """;
        System.out.println(str3);
    }
}
