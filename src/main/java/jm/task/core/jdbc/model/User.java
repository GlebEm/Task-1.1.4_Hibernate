package jm.task.core.jdbc.model;

import javax.persistence.*;
//@Table -указывает на таблицу в бд, @Column - На столбы, относящиеся к данной переменной
//аннотация @Id - особенное, для ID всегда указываем отдельную аннотацию
//    @GeneratedValue - указание стратегии с помощью которой генерируются значения для ID
// IDENTITY - хибернейт не думает о создании ID , все делается на стороне постгресса
@Entity
@Table(name = "users")
public class User { // Все поля должны быть private
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;


    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private Byte age;

    public User() { //для @Entity - обязательно нужен пустой конструктор
    }

    public User(String name, String lastName, Byte age) {  //id - считается на стороне постгреса
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    @Override /// Получение всех User из базы и вывод в консоль ( должен быть переопределен toString в классе User)
    public String toString() { //через гетеры
        return "User{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                '}';
    }

}
