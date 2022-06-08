public class Main {
    public static void main(String[] args) {
//        int value = 33;
//        changeValue(value);
//        System.out.println(value);
        //Задание 5. Ответ будет 33, так значение переменной value не менялось.
        //в методе changeValue была создана копия переменной и в нее записалось значение 22
//        Integer value = 33;
//        changeValue(value);
//        System.out.println(value);
        //Задание 6. Значение не меняется, так как при вызове метода создается копия переменной value.
        //далее value присваивается 22, но значение поля где хранится 33, никто не менял.
        Integer[] value = {3, 4};
        changeValue(value);
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
        //задание 7. Снова значение не меняется. Так как значение переменных ссылочного типа
        // можно изменить только с помощью методов которые меняют значение полей.
        // Задание 8. Значение ячейки изменилось, так как в методе было обращение к памяти
        // где было записано 3, и туда записали значение 99.





    }

    public static void changeValue(int value) {
        value = 22;
    }
    public static void changeValue(Integer  value) {
        value = 22;
    }
    public static void changeValue(Integer[]  value) {
//        Integer[] v = {1, 2};
//        value = v;
        value[0] = 99;
    }
}