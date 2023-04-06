package chap_21_stream;


import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class _06_fileStream {
    public static void main(String[] args) {
        try {
            Path path = Paths.get(_06_fileStream.class.getResource("hyundaiCar.txt").toURI());
            //Files.lines() => 텍스트 파일을 행으로 분리해서
            //				   행들의 스트림을 만들어준다.
            Stream<String> fileStream = Files.lines(
                    path, Charset.defaultCharset());
            fileStream.forEach(l ->
                    System.out.println(l));
            } catch (URISyntaxException ue) {
            // TODO Auto-generated catch block
            ue.printStackTrace();
            } catch(Exception e) {
            e.printStackTrace();
            }
    }
}
