package com.example.app_back.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-import")
public interface AppImportClient {
    @GetMapping("/import/hello")
    String getMsgFromImport();

}
