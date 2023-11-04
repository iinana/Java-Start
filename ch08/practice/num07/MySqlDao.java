package ch08.practice.num07;

public class MySqlDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("Search on MySql DB");
    }

    @Override
    public void insert() {
        System.out.println("Insert on Mysql DB");
    }

    @Override
    public void update() {
        System.out.println("Update on Mysql DB");
    }

    @Override
    public void delete() {
        System.out.println("Delete on Mysql DB");
    }
}
