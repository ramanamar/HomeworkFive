/**
 * Created by
 * @author Raman Kryvasheyeu
 * for Java_1 course GeekBrains on 10'th of September 2016
 * */

package com.company;

public class Main {
    public static void main(String[] args) {

        //Создаем два массива экземпляров: competitors - для животных, trimTrail - для препятствий.
        //Инициализируем в них соответствующие экземпляры с параметрами.
        Animal[] competitors = {new Cat("Pushok"), new Dog("Barbos"), new Horse("Berezka")};
        Obstacle[] trimTrail = {new Trail(100.0f), new Wall(1.0f), new Pool(10.0f), new Wall(1.5f), new Trail(200.0f)};

        //Для каждого животного из массива competitors проходим каждое препятствие из массива trimTrail
        // и сравниваем параметры экземпляров животных с соответствующими параметрами экземпляров препятствий
        // с помощью метода doIt()
        for (Animal a: competitors) {
            println("--------------");
            for (Obstacle o: trimTrail) {
                o.doIt(a);
                if (!a.isOnTrail()) continue; //Как вариант можно поставить break, тогда после первого же проваленного
            }                                 //препятствия участник будет дисквалифицирован
        }

        //Выводим результаты с новой строки после разделителя
        println("_________________________"+"\n Results:");
        for (Animal a : competitors) {
            a.showResults();
        }
    }

    //Как правило добавляю этот метод для собственного удобства
    public static void println (String text) {
        System.out.println(text);
    }
}

