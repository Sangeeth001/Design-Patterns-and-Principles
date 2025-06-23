public class PdfDocument{
    public static void main(String[] args) {
        PdfDocument pdf = new PdfDocument();
        pdf.open();
        pdf.save();
    }
    public void open() {
        System.out.println("Opening PDF document");
    }
    
    public void save() {
        System.out.println("Saving PDF document");
    }
}