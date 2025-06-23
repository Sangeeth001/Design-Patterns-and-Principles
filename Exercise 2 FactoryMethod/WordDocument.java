public class WordDocument{
    public static void main(String[] args) {
        WordDocument word = new WordDocument();
        word.open();
        word.save();
    }
    public void open() {
        System.out.println("Opening Word document");
    }
    
    public void save() {
        System.out.println("Saving Word document");
    }
}
