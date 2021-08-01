public class TestDouble {
    public static void main(String[] args) throws Exception {
        DoubleLinkedTable doubleLinkedTable = new DoubleLinkedTable();
        doubleLinkedTable.insert(0,"hello");
        doubleLinkedTable.insert(1,"world");
        doubleLinkedTable.insert(2,"hi");
        doubleLinkedTable.display();
        doubleLinkedTable.remove(doubleLinkedTable.length()-1);
        doubleLinkedTable.display();

    }
}
