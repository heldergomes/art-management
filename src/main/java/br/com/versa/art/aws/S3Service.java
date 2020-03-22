package br.com.versa.art.aws;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class S3Service {

    private Logger LOG = LoggerFactory.getLogger(S3Service.class);

    private String bucketName;
    private AmazonS3 s3Client;
    public S3Service(AmazonS3 s3Client, @Value("${s3.bucket}") String bucketName){
        this.s3Client = s3Client;
        this.bucketName = bucketName;
    }

    public void uploadFile(String name, String localFilePath){
        try {
            File file = new File(localFilePath);
            LOG.info("Iniciando upload de arquivo");
            s3Client.putObject(new PutObjectRequest(bucketName, name, file));
            LOG.info("Upload de arquivo finalizado com sucesso");
        }catch (AmazonServiceException ex){
            LOG.info("AmazonServiceException: " + ex.getErrorMessage());
            LOG.info("Status Code: " + ex.getErrorCode());
        }catch (AmazonClientException ex){
            LOG.info("AmazonClientException: " + ex.getMessage());
        }

    }
}
