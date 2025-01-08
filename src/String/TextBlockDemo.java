package String;

public class TextBlockDemo {
    public static void main(String[] args) {
        String input = "Hello my name is Ankit\n"+
                "I am 25 years old";
        System.out.println(input);
        String htmlCode = "<html>\n" +
                "    <head>\n" +
                "        <title>Hello</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <h1>Hello</h1>\n" +
                "    </body>\n" +
                "</html> ";
        System.out.println(htmlCode);
        String textBlock = """
                Hello my name is Ankit
                kjffjlf
                flfklfk
                
                
                dfjdlkfjdlfj""";
        System.out.println(textBlock);
    }
}
