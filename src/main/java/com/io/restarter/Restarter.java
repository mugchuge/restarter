package com.io.restarter;

import org.bukkit.Bukkit;

public class Restarter implements Runnable {

    int num = 60;

    @Override
    public void run() {
        if (num == 60) {
            System.out.println("1분뒤 서버가 재시작됩니다.");
            num = num - 1;
        } else if (num == 0){
            System.out.println("서버를 닫습니다.");
            Bukkit.shutdown();
            num = 60;
        } else {
            num = num - 1;
        }
    }
}
