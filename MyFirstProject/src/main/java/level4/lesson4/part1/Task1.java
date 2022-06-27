package level4.lesson4.part1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Создайте 2 аннотации: OnlyForField, OnlyForMethod. Сделайте так, чтобы
// 1ую аннотацию можно было добавлять только к полям, а 2ую аннотацию только к методам.
// Создайте класс с 2 любыми полями и 2 любыми методами,
// добавьте @OnlyForField на оба поля и @OnlyForMethod только на 1 любой метод.
public class Task1 {
    @OnlyForField
    int x;
    @OnlyForField
    String name;

    public void myMeth1() {
    }

    @OnlyForMethod
    public void myMeth2() {
    }
}

@Target(ElementType.FIELD)
@interface OnlyForField {
}

@Target(ElementType.METHOD)
@interface OnlyForMethod {
}
