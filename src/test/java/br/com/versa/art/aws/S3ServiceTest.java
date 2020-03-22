package br.com.versa.art.aws;

import br.com.versa.art.config.S3Config;
import com.amazonaws.services.s3.AmazonS3;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = S3Config.class)
public class S3ServiceTest {

    private Logger LOG = LoggerFactory.getLogger(S3ServiceTest.class);

    @Autowired
    private AmazonS3 s3Client;

    @Value("${s3.bucket}")
    private String bucketName;

    @Test
    public void uploadFile(){
        String nameFile = "lion.jpg";
        S3Service service = new S3Service(s3Client, bucketName);
        service.uploadFile(nameFile, "src/test/resources/img/lion.jpg");
        deleteFile(nameFile);
    }

    private void deleteFile(String nameFile){
        s3Client.deleteObject(bucketName, nameFile);
        LOG.info("Arquivo deletado com sucesso");
    }
}
