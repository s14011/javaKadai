package jp.ac.it_college.std.s14011.java;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

/**
 * Created by s14011 on 15/06/30.
 */
public class Communicat {
    public static void dd() {
        jp.ac.it_college.std.nakasone.lib.exam.Communicator comm = new jp.ac.it_college.std.nakasone.lib.exam.Communicator((msg) -> {
            System.out.println(msg);
        });
        comm.start();
        String name = "s14011";
        while (true) {
            System.out.println("入力してください:");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();

            if (str.equals("exit")) {
                try {
                    comm.send(name);
                }catch (IOException var3){
                    var3.printStackTrace();
                }
                comm.finish();
                break;
            } else {
                try {
                    comm.send(name  + ":" + str);
                } catch (IOException var3) {
                    var3.printStackTrace();
                }

            }
        }
    }


}