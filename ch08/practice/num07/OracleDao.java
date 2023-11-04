package ch08.practice.num07;

public class OracleDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("Search on Oracle DB");
    }

    @Override
    public void insert() {
        System.out.println("Insert on Oracle DB");
    }

    @Override
    public void update() {
        System.out.println("Update on Oracle DB");
    }

    @Override
    public void delete() {
        System.out.println("Delete on Oracle DB");
    }
}
