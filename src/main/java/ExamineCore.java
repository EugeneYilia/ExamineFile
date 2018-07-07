import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ExamineCore {
    private ExamineCore() {
    }

    public static void examineFile(String filePath, String encodeContent, String encodeType) {
        File file = new File(filePath);
        if (file.exists()) {
            String fileContent = "";
            FileInputStream fileInputStream = null;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(encodeType);
                fileInputStream = new FileInputStream(file);
                byte[] buffer = new byte[1024];
                int length = -1;
                while ((length = fileInputStream.read(buffer, 0, 1024)) != -1) {
                    messageDigest.update(buffer, 0, length);
                }
                byte[] hash = messageDigest.digest();
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < hash.length; i++) {
                    int value = ((int) hash[i]) & 0xff;
                    if (value < 16) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(Integer.toHexString(value));
                }
                String encodeString = stringBuffer.toString();

                System.out.print(encodeString.equals(encodeContent));
                //System.out.println(encodeString);
                //System.out.println(encodeString.length());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    fileInputStream.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("文件不存在");
        }
    }
}
