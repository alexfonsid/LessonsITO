package level2.lesson4.path1;

//Создать метод, который принимает 2 массива символов. Этот метод проверяет, что слово начинается c определенной последовательности.
//Например:
//char[] word = {‘П’,’р’,’и’,’в’,’е’,’т’};
//char[] firstPrefix = {‘П’,’р’,’и’}
//char[] secondPrefix = {‘П’,’р’,’е’}
//	Для вызова метода (word, firstPrefix) должно вернуться true, для вызова метода(word, secondPrefix) - false.
//public class Task5 {
//    public static void main(String[] args) {
//        char[] word = {'П', 'р', 'и', 'в', 'е', 'т'};
//        char[] firstPrefix = {'П', 'р', 'и'};
//        char[] secondPrefix = {'П', 'р', 'е'};
//        System.out.println(isBegins(word, firstPrefix));
//        System.out.println(isBegins(word, secondPrefix));
//
//    }

//    static boolean isBegins(char[] word, char[] prefix) {
////        int check = 0;
////        for (int i = 0; i < prefix.length; i++) {
////            if (word[i] == prefix[i]) {
////                continue;
////                check++;
////            }
////        }
////        return check == prefix.length ? true : false;
//        boolean isBeggining = true;
//        for (int i = 0; i < prefix.length; i++) {
//            if (word[i] != prefix[i]) {
//                break;
//            }
//            return isBeggining;
//        }
////    }
////}
