package org.example;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {

        CrptApi crptApi = new CrptApi(TimeUnit.SECONDS, 5);

        CrptApi.Document document = new CrptApi.Document();
        CrptApi.Description description = new CrptApi.Description();
        description.setParticipantInn("string");

        document.setDescription(description);
        document.setDoc_id("string");
        document.setDoc_status("string");
        document.setDoc_type("LP_INTRODUCE_GOODS");
        document.setImportRequest(true);
        document.setOwner_inn("string");
        document.setParticipant_inn("string");
        document.setProducer_inn("string");
        document.setProduction_date("2020-01-23");
        document.setProduction_type("string");

        CrptApi.Product product = new CrptApi.Product();
        product.setCertificate_document("string");
        product.setCertificate_document_date("2020-01-23");
        product.setCertificate_document_number("string");
        product.setOwner_inn("string");
        product.setProducer_inn("string");
        product.setProduction_date("2020-01-23");
        product.setTnved_code("string");
        product.setUit_code("string");
        product.setUitu_code("string");

        document.setProducts(List.of(product));
        document.setReg_date("2020-01-23");
        document.setReg_number("string");


        crptApi.createDocument(document, "signature");
    }

}
