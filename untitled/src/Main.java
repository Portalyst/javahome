public static int task1() {
    return 1;
}

public static int task2(int a, int b, int c) {
    int D = b*b-(4*a*c);
    return D;
}

//public static int task3() {
//
//}

//task4
//public void a() {
//    // Доступ отовсюду
//}
//
//protected void a() {
//    // Доступ для наследников и пакета
//}
//
//void a() {
//    // Доступ внутри пакета
//}
//
//private void a() {
//    // Доступ только внутри класса
//}

void main() {
    int a = 1;
    int b = 2;
    int c = 3;

    IO.println(task1());
    IO.println(task2(a, b, c));

    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        IO.println("i = " + i);
    }
}
