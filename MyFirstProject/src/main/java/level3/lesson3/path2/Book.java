package level3.lesson3.path2;

// Создайте класс Книга, с полями название, кол-во страниц. Поля сделайте закрытыми, добавьте геттеры
// и сеттеры к полям. В сеттеры добавьте проверки для кол-ва страниц нельзя установить значения меньше 0,
// для названия нельзя чтобы в название содержалось слово “name” (У строк есть метод “contains()”).
public class Book {
    private String name;
    private int pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.contains("name"))
            System.out.println("error");
        else {
            this.name = name;
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages >= 0)
            this.pages = pages;
        else System.out.println("error");
    }
}


