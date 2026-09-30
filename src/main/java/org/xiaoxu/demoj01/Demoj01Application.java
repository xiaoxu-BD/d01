package org.xiaoxu.demoj01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demoj01Application {

    public static void main(String[] args) {
        //数据库设计是 rebase 之前 提交好的
        //after rebase
        //master 一直在提交
        // checkout and rebase on "master"  ->  feat 追上 master
        SpringApplication.run(Demoj01Application.class, args);
    }

}
