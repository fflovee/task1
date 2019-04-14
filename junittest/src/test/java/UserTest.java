import com.jnshu.hpmybatis.pojo.User;
import com.jnshu.hpmybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class UserTest {


    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        User user = userService.getUserByName("秦丽丽");
        System.out.println(user);
    }

    @Test
    public void selectALL(){
        System.out.println(userService.selectAll());
    }

    @Test
    public void deleteStu(){
        Boolean i = userService.deleteUser(19);
        if (i) {
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }
/*          Boolean i = false;
            try {
                i = userService.deleteUser(19);
            }catch (Exception e){
                System.out.println("数据删除失败");
                e.printStackTrace();

        }
            if (i){
                System.out.println("数据删除成功");*/




    @Test
    public void insertUser(){
        User user = new User();
        user.setName("贾伟奇");
        user.setQq(860733414);
        user.setType("Java工程师");
        user.setJointime(20180930);
        user.setTechnology("北京YD大学");
        user.setDaily("http://www.jnshu.com/school/86/daily");
        user.setJnshuID(1234);
        user.setWish("如果我不能在IT特训营拼尽全力，为自己以后的修行路上打好基础，就让我变胖2k斤!");
        user.setBrother("九分裤");
        user.setDaily("杜伟腾");
        user.setKnowfrom("知乎");
        user.setCreate_at(20180321);
        user.setUpdate_at(20190123);
        long i = userService.insertUser(user);
        if (i>0){
            System.out.println("成功 ");

        }else {
            System.out.println("失败");
        }
    }
    @Test
    public void updateUser(){
        User user = new User();
        user.setId(21);
        user.setName("贾伟");
        user.setQq(860733234);
        user.setType("PM");
        user.setJointime(20180930);
        user.setTechnology("北京YD大学");
        user.setJnshuID(4975);
        user.setDaily("http://www.jnshu.com/school/86/daily");
        user.setWish("如果我不能在IT特训营拼尽全力，为自己以后的修行路上打好基础，就让我变胖2k斤!");
        user.setBrother("九分裤");
        user.setDaily("杜伟腾");
        user.setKnowfrom("知乎");
        user.setCreate_at(20180321);
        user.setUpdate_at(20190123);
        boolean i = userService.updateUser(user);
        if (i){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
    }
}

