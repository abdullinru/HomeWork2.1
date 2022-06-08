public class Main {
    public static void main(String[] args) {
//        int value = 33;
//        changeValue(value);
//        System.out.println(value);
        //Ответ будет 33, так значение переменной value не менялось.
        //в методе changeValue была создана копия переменной и в нее записалось значение 22
        Integer value = 33;
        changeValue(value);
        System.out.println(value);
        //Значение не меняется, так как при вызове метода создается копия переменной value.
        //далее value присваивается 22, но значение поля где хранится 33, никто не менял.

    }

    public static void changeValue(int value) {
        value = 22;
    }
    public static void changeValue(Integer  value) {
        value = 22;
    }
}