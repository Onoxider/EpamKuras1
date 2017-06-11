package module1.task6;

import java.util.ArrayList;

/**
 * Created by onoxider on 6/10/17.
 */
public class Notebook {

    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        for (int i = 1; i < 6; i++) {
            notebook.addRecord(new Record(String.valueOf(i), "desc" + String.valueOf(i)));
        }

        notebook.viewAllRecords();
        notebook.removeRecord(3);
        notebook.editRecord(1, "EDITED1", "EDITEDDESC1");
        System.out.println();
        notebook.viewAllRecords();
    }

    ArrayList<Record> records = new ArrayList<>();

    public void viewAllRecords() {
        for (Record record : records) {
            System.out.println(record);
        }
    }

    public void addRecord(Record record) {
        records.add(record);
    }

    public void removeRecord(int id) {
        records.remove(id-1);
    }

    /**
     *
     * @param id - идентификатор записи
     * @param title - название записи
     * @param desc - текст/описание записи
     */
    public void editRecord(int id, String title, String desc) {
        records.get(id-1).setTitle(title);
        records.get(id-1).setDesc(desc);
    }
}
