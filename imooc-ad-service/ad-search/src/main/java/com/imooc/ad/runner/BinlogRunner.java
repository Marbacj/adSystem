package com.imooc.ad.runner;

import com.imooc.ad.mysql.BinlogClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Marbach
 */
@Slf4j
@Component
public class BinlogRunner implements CommandLineRunner {
//commandLineRunner 表示在应用程序启动时执行特定的操作
    private final BinlogClient client;

    @Autowired
    public BinlogRunner(BinlogClient client) {
        this.client = client;
    }

    @Override
    public void run(String... strings) throws Exception {

        log.info("Coming in BinlogRunner...");
        client.connect();
    }
}
