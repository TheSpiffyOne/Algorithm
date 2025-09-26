public class Main {
    public static void main(String[] args) {
        String str_1 = "AaBbCcDd";
        StringBuilder uppercaseStr = new StringBuilder();
        StringBuilder lowercaseStr = new StringBuilder();
        
        for (int i = 0; i < str_1.length(); i += 2) {
            uppercaseStr.append(str_1.charAt(i));
        }
        
        for (int i = 1; i < str_1.length(); i += 2) {
            lowercaseStr.append(str_1.charAt(i));
        }
        
        System.out.println("Заглавные буквы: " + uppercaseStr.toString());
        System.out.println("Строчные буквы: " + lowercaseStr.toString());
    }
}

//Стек

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  // создаём стек для Integer

        st.push(10);    // push — добавить
        st.push(20);
        st.push(30);

        System.out.println("Верхний элемент: " + st.peek()); // peek — просмотр верхнего

        st.pop();       // pop — удалить верхний элемент

        System.out.println("Новый верхний элемент: " + st.peek());
        System.out.println("Размер стека: " + st.size());
    }
}


