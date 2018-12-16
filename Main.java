import com.google.gson.Gson;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //создадим новый объект класса gson
        Gson gson = new Gson();
        //добавим новые классы сущностей
        User user1 = new User("Ihor","Klyovan",88);


        User user2 = new User("Den","Cool",50);


        //закинем созданые классы в arrayList
        ArrayList<User> arrayList = new ArrayList<User>();
        arrayList.add(user1);
        arrayList.add(user2);

        //десереализируем  наши данные в обычную строки и выведе результат
        String test = gson.toJson(arrayList);
        System.out.println(test);

        //произведем обратное действие сереализацию
        User[] userArray = gson.fromJson(test, User[].class);
        //теперь последовательно выведем данные наших юзеров на экран
        for(User item:userArray){
            System.out.println(item.getName()+", "+item.getLastName()+", "+item.getAge());
        }
    }
}

