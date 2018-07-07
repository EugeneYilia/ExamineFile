public class Bootstrap {
    public static void main(String[] args) {
        String filePath = args[0];
        String encodeContent = args[1];
        String encodeType = args[2];
        ExamineCore.examineFile(filePath, encodeContent, encodeType);
    }
}
