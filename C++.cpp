#include <iostream>
#include <string>
using namespace std;

int main() {
    string str = "AaBbCcDd";
    string uppercase = "";
    string lowercase = "";
    
    for (int i = 0; i < str.length(); i++) {
        if (i % 2 == 0) {
            uppercase += str[i]; // Четные индексы - заглавные
        } else {
            lowercase += str[i]; // Нечетные индексы - строчные
        }
    }
    
    cout << "Заглавные: " << uppercase << endl;
    cout << "Строчные: " << lowercase << endl;
    
    return 0;
}       

//Стек
int main() {
    stack<int> st;        // создаём стек для int

    st.push(10);          // push — добавить элемент
    st.push(20);
    st.push(30);

    cout << "Верхний элемент: " << st.top() << endl; // top — просмотр верхнего

    st.pop();             // pop — удалить верхний элемент

    cout << "Новый верхний элемент: " << st.top() << endl;
    cout << "Размер стека: " << st.size() << endl;

    return 0;
}
