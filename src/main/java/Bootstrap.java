public class Bootstrap {
    public static void main(String[] args) {
        String filePath = args[0];
        String encodeContent = args[1];
        String encodeType = args[2];
        if (encodeContent.equalsIgnoreCase("generate")) {//generate encoded string
            ExamineCore.generateEncodedString(filePath, encodeType);
        } else {//examine file
            ExamineCore.examineFile(filePath, encodeContent, encodeType);
        }
    }
}
