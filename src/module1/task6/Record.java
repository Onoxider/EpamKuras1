package module1.task6;

/**
 * Created by onoxider on 6/10/17.
 */
public class Record {
    private String title;
    private String desc;

    @Override
    public String toString() {
        return "Record{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public Record(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Record record = (Record) o;

        if (title != null ? !title.equals(record.title) : record.title != null) return false;
        return desc != null ? desc.equals(record.desc) : record.desc == null;

    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        return result;
    }
}
