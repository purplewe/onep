import com.shop.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class Test {
    @org.junit.Test
    public void test1(){
        List<Integer> list = new ArrayList<>();
        add(list);
        System.out.println(list.size());
    }
    @org.junit.Test
    public void test2(){
        User user = new User();
        user.setUsername("a");
        changeName(user);
        System.out.println(user.getUsername());
    }
    @org.junit.Test
    public void test3(){
        String str = new String("a");
        changeInteger(str);
        System.out.println(str);

    }
    public String changeInteger(String str){
        str = str+"b";
        System.out.println(str);
        return str;
    }


    public User changeName(User user){
        user.setUsername("b");
        return user;
    }

    public List add(List i){
        for (int i1 = 0; i1 < 100; i1++) {
            i.add(new Object());
        }
       return i;
    }
}

