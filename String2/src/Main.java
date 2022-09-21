public class Main {
    public static void main(String[] args) {
       String message = "the weather is nice today";
       System.out.println(message);
//        System.out.println("element num : " + message.length());
//        System.out.println("5th element : " + message.charAt(4));
//        System.out.println(message.concat(" !!!happy"));
//        System.out.println(message.startsWith("t"));//if message starts with t returns true.
//        System.out.println(message.endsWith("y"));
//        char[] chars = new char[3];
//        message.getChars(0,3,chars,0);
//        System.out.println(chars);
//        System.out.println(message.indexOf('e'));//içerideki elemanın kaçıncı olduğunu gösterir.ilk bulduğu charı gösterir.
//        System.out.println(message.lastIndexOf('y'));//aramaya sağdan başlar
        String newMessage = message.replace(' ', '-');
        System.out.println(message);
        System.out.println(message.substring(5,8));
        for(String sentence : message.split(" "))
        {
            System.out.println(sentence);
        }
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
    }
}