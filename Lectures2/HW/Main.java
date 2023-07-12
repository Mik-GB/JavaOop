package Lectures2.HW;
//1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
//2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
//(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
//списку он препятствий не идет.
public class Main {
    public static void main(String[] args) {
        Go[] members = {
                new Cat("Maya", 50, 100),
                new Human("Tom", 20,150),
                new Robot("R2D2", 0,300)
        };
        Let[] lets = {
                new Let(new Wall(40),new Treadmill(70)),
                new Let(new Wall(10),new Treadmill(170))
        };
        startMembers(members, lets);
    }

    private static void startMembers(Go[] go, Let[] let) {
        for (int i = 0; i < go.length; i++) {
            for (Let l : let) {
                if (!go[i].run(l.getDistance()).contains("not")){
                    System.out.println(go[i].run(l.getDistance()));
                }else {
                    System.out.println(go[i].run(l.getDistance()));
                    break;
                }
                if (!go[i].jump(l.getHeight()).contains("not")){
                    System.out.println(go[i].jump(l.getHeight()));
                }else {
                    System.out.println(go[i].jump(l.getHeight()));
                    break;
                }
            }
        }
    }
}

