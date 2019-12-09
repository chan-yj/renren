package io.renren;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test1 {

    @Test
    public void test() {
        String a = 100+"";
        String b = 200+"";
        String c = 300+"";

        c=a;
        a=b;
        //c=a;
        //a= 200 c=200
        System.out.println(c);
        System.out.println(a);

    }
}
