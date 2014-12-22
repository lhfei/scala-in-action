package cn.lhfei.scala.tour.annotations;

import java.io.IOException;

/**
 * Created by lhfei on 12/19/14.
 */
public class AnnotaTest {
    public static  void main(String[] args) {

        try {
            Reader in = new Reader(args[0]);

            int c;

            while((c = in.read()) != -1) {
               System.out.println((char)c );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
