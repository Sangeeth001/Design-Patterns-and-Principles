public class ExcelDocument{
    public static void main(String[] args) {
        ExcelDocument excelDoc = new ExcelDocument();
        excelDoc.open();
        excelDoc.save();
    }
    public void open() {
        System.out.println("Opening Excel document");
    }
    public void save() {
        System.out.println("Saving Excel document");
    }
}